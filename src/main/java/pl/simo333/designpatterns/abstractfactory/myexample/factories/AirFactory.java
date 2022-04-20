package pl.simo333.designpatterns.abstractfactory.myexample.factories;

import pl.simo333.designpatterns.abstractfactory.myexample.steerer.Pilot;
import pl.simo333.designpatterns.abstractfactory.myexample.steerer.Steerer;
import pl.simo333.designpatterns.abstractfactory.myexample.vehicles.Plane;
import pl.simo333.designpatterns.abstractfactory.myexample.vehicles.Vehicle;

public class AirFactory implements TransportFactory {
    @Override
    public Vehicle createVehicle() {
        return new Plane();
    }

    @Override
    public Steerer createSteerer() {
        return new Pilot();
    }
}
