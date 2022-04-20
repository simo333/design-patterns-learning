package pl.simo333.designpatterns.abstractfactory.myexample.factories;

import pl.simo333.designpatterns.abstractfactory.myexample.steerer.Steerer;
import pl.simo333.designpatterns.abstractfactory.myexample.vehicles.Vehicle;

public interface TransportFactory {
    Vehicle createVehicle();
    Steerer createSteerer();
}
