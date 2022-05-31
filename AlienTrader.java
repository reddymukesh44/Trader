import java.util.List;

public class AlienTrader extends Trader{
    boolean communication;
    public AlienTrader(double i, List<Tradable> inv, boolean lan) {
        super(i, inv, lan);
        this.communication = lan;
    }

    public boolean isHuman() {
        return false;
    }

}