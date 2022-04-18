package pl.simo333.factorymetod.myexample.employees;

import pl.simo333.factorymetod.myexample.employees.factory.BuilderFactory;
import pl.simo333.factorymetod.myexample.employees.factory.EmployeeCreator;
import pl.simo333.factorymetod.myexample.employees.factory.PainterFactory;

public class Main {
    private static EmployeeCreator creator;

    public static void main(String[] args) {
        configure(13);
        runBusinessLogic();
    }

    static void configure(int parameter) {
        if (parameter == 1) {
            creator = new BuilderFactory();
        } else {
            creator = new PainterFactory();
        }
    }

    static void runBusinessLogic() {
        creator.commandToWork();
    }
}
