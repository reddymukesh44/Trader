import java.util.ArrayList;
import java.util.List;

public abstract class Trader {
    private List<Tradable> inventory;
    private List<Tradable> wishlist;
    private double money;
    private boolean bilingual;

    public boolean isBilingual() {
        return bilingual;
    }
// Your code goes here.

    public Trader(double i, List<Tradable> inv, boolean lan) {
        this.bilingual = lan;
        this.inventory = inv;
        this.money = i;
        wishlist = new ArrayList<>(0);
    }

    public abstract boolean isHuman();

    public List<Tradable> getWishlist() {
        return wishlist;
    }

    public double getMoney() {
        return money;
    }

    public List<Tradable> getInventory() {
        return inventory;
    }

    public void addToWishlist(Tradable tra) {
        wishlist.add(tra);
    }

    public void addToInventory(Tradable tra) {
        inventory.add(tra);
    }

    public void removeFromInventory(Tradable tra) {
        inventory.remove(tra);
    }
    public void removeFromWishlist(Tradable tra) {
        wishlist.remove(tra);
    }

    public boolean sellTo(Trader tra) {
        int size = inventory.size();
        if (tra.bilingual == false && this.bilingual == false) {
            return false;
        }
        else {
            while (size > 0){
                Tradable i = this.inventory.get(size-1);
                if (!tra.getWishlist().contains(i)){
                    size--;
                    continue;
                }
                if ( i.getHumanPrice() > tra.money){
                    size --;
                    continue;
                }
                if (tra.isHuman() && this.isHuman()){
                    this.money += i.getHumanPrice();
                    tra.money -= i.getHumanPrice();
                }
                if ((tra.isHuman() == false || this.isHuman() == false) && i.getAlienPrice() > tra.money){
                    size--;
                    continue;
                }
                if (tra.isHuman()== false || this.isHuman() == false){
                    this.money += i.getHumanPrice();
                    tra.money -= i.getAlienPrice();
                }

                tra.getWishlist().remove(i);
                tra.addToInventory(i);
                this.removeFromInventory(i);
                size --;
            }
            return true;
        }
    }

    public boolean buyFrom(Trader tra){
        int size = wishlist.size();
        if (tra.bilingual == false && this.bilingual == false) {
            return false;
        }
        else {
            while (size > 0){
                Tradable i = this.wishlist.get(size-1);
                if (!tra.getInventory().contains(i)){
                    size--;
                    continue;
                }
                if ( i.getHumanPrice() > tra.money){
                    size --;
                    continue;
                }
                if (tra.isHuman() && this.isHuman()){
                    tra.money += i.getHumanPrice();
                    this.money -= i.getHumanPrice();
                }
                if ((tra.isHuman() == false || this.isHuman() == false) && i.getAlienPrice() > tra.money){
                    size--;
                    continue;
                }
                if (tra.isHuman()== false || this.isHuman() == false){
                    tra.money += i.getHumanPrice();
                    this.money -= i.getAlienPrice();
                }

                this.wishlist.remove(i);
                this.addToInventory(i);
                tra.removeFromInventory(i);
                size --;
            }
            return true;
        }
    }

}