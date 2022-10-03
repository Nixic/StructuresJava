package patterns.creational.abstractFactory.paint;

public class LiquidPaint implements Paint {

    @Override
    public String getPaint() {
        return "Liquid paint";
    }

    @Override
    public String print(String inscription) {
        return "Written with liquid paint: " + inscription;
    }

}
