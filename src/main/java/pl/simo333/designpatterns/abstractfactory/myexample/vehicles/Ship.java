package pl.simo333.designpatterns.abstractfactory.myexample.vehicles;

public class Ship implements Vehicle {
    @Override
    public void getFuel() {
        System.out.println("Ships fuel");
    }

    @Override
    public void getVehicleType() {
        System.out.println("Ship");
    }

    @Override
    public void getMovingWay() {
        System.out.println("Water");
    }

    @Override
    public void getModel() {
        System.out.println("Titanic");
    }
}
