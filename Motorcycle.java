public class Motorcycle implements Vehicle,Tradable{

    private double PriceinHuman;
    private double PriceinAlien;
    private int speed;

    public Motorcycle(double hum,double ali){
        this.PriceinHuman = hum;
        this.PriceinAlien = ali;
    }
    @Override
    public double getHumanPrice() {
        return PriceinHuman;
    }

    @Override
    public double getAlienPrice() {
        return PriceinAlien;
    }

    @Override
    public void speedUp() {
        speed += 1;
    }

    @Override
    public void speedDown() {
        speed -= 1;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }
}
