public class Pikachu implements AlienAnimal,Tradable{

    private double PriceinHuman;
    private double PriceinAlien;

    public Pikachu(double hum,double ali){
        this.PriceinHuman = hum;
        this.PriceinAlien = ali;
    }
    @Override
    public String sound() {
        return "pika pika";
    }

    @Override
    public double getHumanPrice() {
        return PriceinHuman;
    }

    @Override
    public double getAlienPrice() {
        return PriceinAlien;
    }
}
