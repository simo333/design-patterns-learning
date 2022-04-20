package pl.simo333.designpatterns.abstractfactory.myexample.steerer;

public class Pilot implements Steerer {
    @Override
    public void getSteererType() {
        System.out.println("Pilot");
    }

    @Override
    public void getName() {
        System.out.println("Robert The Pilot");
    }
}
