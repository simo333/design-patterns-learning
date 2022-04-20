package pl.simo333.designpatterns.abstractfactory.myexample.factories;

import pl.simo333.designpatterns.abstractfactory.myexample.steerer.Captain;
import pl.simo333.designpatterns.abstractfactory.myexample.steerer.Steerer;
import pl.simo333.designpatterns.abstractfactory.myexample.vehicles.Ship;
import pl.simo333.designpatterns.abstractfactory.myexample.vehicles.Vehicle;

public class WaterFactory implements TransportFactory{
    @Override
    public Vehicle createVehicle() {
        return new Ship();
    }

    @Override
    public Steerer createSteerer() {
        return new Captain();
    }
}
