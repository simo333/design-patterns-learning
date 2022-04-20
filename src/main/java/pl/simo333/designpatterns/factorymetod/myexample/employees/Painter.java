package pl.simo333.designpatterns.factorymetod.myexample.employees;

public class Painter implements Employee{
    @Override
    public void getJobPosition() {
        System.out.println("Painter");
    }

    @Override
    public void work() {
        System.out.println("Painting...");
    }
}
