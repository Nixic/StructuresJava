package patterns.structural.flyweight;

public class Car implements Vehicle {

    private Engine engine;
    private Color color;

    public Car(Engine engine, Color color) {
        this.engine = engine;
        this.color = color;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Error while creating a new car:" + e);
        }
    }

    @Override
    public void start() {
        System.out.println(this.color + " car is starting!");
        engine.start();
    }

    @Override
    public void stop() {
        System.out.println(this.color + " car is stopping!");
        engine.stop();
    }

    @Override
    public Color getColor() {
        return this.color;
    }
}
