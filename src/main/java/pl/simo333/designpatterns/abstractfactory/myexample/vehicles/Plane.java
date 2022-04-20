package pl.simo333.designpatterns.abstractfactory.myexample.vehicles;

public class Plane implements Vehicle {
    @Override
    public void getFuel() {
        System.out.println("Rocket Fuel");
    }

    @Override
    public void getVehicleType() {
        System.out.println("Plane");
    }

    @Override
    public void getMovingWay() {
        System.out.println("Air");
    }

    @Override
    public void getModel() {
        System.out.println("Airbus");
    }
}
