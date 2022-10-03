package patterns.creational.abstractFactory.paint;

public class DryPaint implements Paint {

    @Override
    public String getPaint() {
        return "Dry paint";
    }

    @Override
    public String print(String inscription) {
        return "Written with dry paint:: " + inscription;
    }

}
