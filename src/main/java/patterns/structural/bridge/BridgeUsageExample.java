package patterns.structural.bridge;

import patterns.structural.bridge.colors.Blue;
import patterns.structural.bridge.colors.Red;
import patterns.structural.bridge.shapes.Shape;
import patterns.structural.bridge.shapes.Square;
import patterns.structural.bridge.shapes.Triangle;

public class BridgeUsageExample {

    static Shape squareBlue = new Square(new Blue());
    static Shape squareRed = new Square(new Red());
    static Shape triangleBlue = new Triangle(new Blue());
    static Shape triangleRed = new Triangle(new Red());

    public static void main(String[] args) {

        System.out.println(squareBlue.draw());
        System.out.println(squareRed.draw());

        System.out.println(triangleBlue.draw());
        System.out.println(triangleRed.draw());

    }

}
