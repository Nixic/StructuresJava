package patterns.structural.adapter;

public class AdapterUsageExample {

    public static void main(String[] args) {
        double mph = 300; // as speed in class BugattiVeyron
        double kmph = mph * 1.6; // value as in adapter = 480

        Movable bugattiVeyron = new BugattiVeyron();
        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
        bugattiVeyronAdapter.getSpeed();

        if (kmph == bugattiVeyronAdapter.getSpeed()) {
            System.out.println("Speed in kmph = " + bugattiVeyronAdapter.getSpeed());
        }

    }

}
