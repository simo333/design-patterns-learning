package pl.simo333.designpatterns.abstractfactory.myexample.steerer;

public class Driver implements Steerer {
    @Override
    public void getSteererType() {
        System.out.println("Driver");
    }

    @Override
    public void getName() {
        System.out.println("Andrew Trucker");
    }
}
