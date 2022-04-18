package pl.simo333.factorymetod.myexample.employees;

public class Builder implements Employee{

    @Override
    public void getJobPosition() {
        System.out.println("Builder");
    }

    @Override
    public void work() {
        System.out.println("Building..");
    }
}
