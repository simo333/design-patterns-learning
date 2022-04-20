package pl.simo333.designpatterns.abstractfactory.myexample.factories;

import pl.simo333.designpatterns.abstractfactory.myexample.steerer.Driver;
import pl.simo333.designpatterns.abstractfactory.myexample.steerer.Steerer;
import pl.simo333.designpatterns.abstractfactory.myexample.vehicles.Truck;
import pl.simo333.designpatterns.abstractfactory.myexample.vehicles.Vehicle;

public class LandFactory implements TransportFactory {
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }

    @Override
    public Steerer createSteerer() {
        return new Driver();
    }
}
