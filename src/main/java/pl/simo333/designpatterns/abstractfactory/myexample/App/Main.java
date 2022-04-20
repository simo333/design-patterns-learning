package pl.simo333.designpatterns.abstractfactory.myexample.App;

import pl.simo333.designpatterns.abstractfactory.myexample.factories.AirFactory;
import pl.simo333.designpatterns.abstractfactory.myexample.factories.LandFactory;
import pl.simo333.designpatterns.abstractfactory.myexample.factories.TransportFactory;
import pl.simo333.designpatterns.abstractfactory.myexample.factories.WaterFactory;
import pl.simo333.designpatterns.abstractfactory.myexample.steerer.Steerer;
import pl.simo333.designpatterns.abstractfactory.myexample.vehicles.Vehicle;

import java.util.Scanner;

public class Main {
    static String value = "land";
    static TransportFactory factory;


    public static void main(String[] args) {
        configureTransportSet();
        Vehicle vehicle = factory.createVehicle();
        Steerer steerer = factory.createSteerer();

        vehicle.getFuel();
        vehicle.getVehicleType();
        vehicle.getModel();
        vehicle.getMovingWay();

        steerer.getSteererType();
        steerer.getName();

    }

    static void configureTransportSet() {
        setValue();
        switch (value.toLowerCase()) {
            case "land" -> factory = new LandFactory();
            case "air" -> factory = new AirFactory();
            case "water" -> factory = new WaterFactory();
            default -> throw new IllegalArgumentException("Wrong parameter has been passed.");
        }
    }

    static void setValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create a new transport set:");
        value = scanner.nextLine();
    }
}
