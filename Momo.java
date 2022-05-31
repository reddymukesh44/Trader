public class Momo implements AlienAnimal,Tradable{

    private double PriceinAlien;

    public Momo(double i){
        this.PriceinAlien = i;
    }
    @Override
    public String sound() {
        return "momo momo";
    }

    @Override
    public double getHumanPrice() {
        return PriceinAlien/100;
    }

    @Override
    public double getAlienPrice() {
        return PriceinAlien;
    }
}
