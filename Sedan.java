public class Sedan implements Vehicle,Tradable{

    private double PriceintheHumanWordl;
    private int speed;

    public Sedan(double i){
        this.PriceintheHumanWordl = i;
        speed = 0;
    }

    @Override
    public double getHumanPrice() {
        return PriceintheHumanWordl;
    }

    @Override
    public double getAlienPrice() {
        return PriceintheHumanWordl * 50;
    }

    @Override
    public void speedUp() {
        this.speed += 2;
    }

    @Override
    public void speedDown() {
        this.speed -= 2;
    }

    @Override
    public int getSpeed() {
        return speed;
    }
}
