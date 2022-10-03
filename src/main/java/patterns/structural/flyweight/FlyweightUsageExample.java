package patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class FlyweightUsageExample {

    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(VehicleFactory.createVehicle(Color.BLACK));
        vehicles.add(VehicleFactory.createVehicle(Color.BLACK));
        vehicles.add(VehicleFactory.createVehicle(Color.BLACK));
        vehicles.add(VehicleFactory.createVehicle(Color.BLACK));
        vehicles.add(VehicleFactory.createVehicle(Color.WHITE));
        vehicles.add(VehicleFactory.createVehicle(Color.WHITE));
        vehicles.add(VehicleFactory.createVehicle(Color.WHITE));
        vehicles.add(VehicleFactory.createVehicle(Color.WHITE));

        System.out.println("Number of different cars in cache: " + VehicleFactory.getVehiclesCache().size() + " Lets START!!!!");
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }

    }

}
