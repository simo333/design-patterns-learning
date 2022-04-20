package pl.simo333.designpatterns.abstractfactory.myexample.steerer;

public class Captain implements Steerer {
    @Override
    public void getSteererType() {
        System.out.println("Captain");
    }

    @Override
    public void getName() {
        System.out.println("Captain Jack");
    }
}
