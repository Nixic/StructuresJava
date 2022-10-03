package patterns.creational.abstractFactory.paint;

import patterns.creational.abstractFactory.AbstractFactory;

public class PaintFactory implements AbstractFactory<Paint> {

    @Override
    public Paint create(String paintType) {
        if ("Liquid".equalsIgnoreCase(paintType)) {
            return new LiquidPaint();
        } else if ("Dry".equalsIgnoreCase(paintType)) {
            return new DryPaint();
        }

        return null;
    }

}
