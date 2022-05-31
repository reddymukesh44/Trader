import java.util.List;

public class HumanTrader extends Trader {

    boolean communication;
    public HumanTrader(double i, List<Tradable> inv, boolean lan) {
        super(i, inv, lan);
        this.communication = lan;
    }

    @Override
    public boolean isHuman() {
        return true;
    }
}