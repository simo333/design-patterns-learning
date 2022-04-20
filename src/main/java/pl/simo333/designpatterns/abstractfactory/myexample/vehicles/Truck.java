package pl.simo333.designpatterns.abstractfactory.myexample.vehicles;

public class Truck implements Vehicle {
    @Override
    public void getFuel() {
        System.out.println("Diesel");
    }

    @Override
    public void getVehicleType() {
        System.out.println("Truck");
    }

    @Override
    public void getMovingWay() {
        System.out.println("Roads");
    }

    @Override
    public void getModel() {
        System.out.println("Scania");
    }
}
