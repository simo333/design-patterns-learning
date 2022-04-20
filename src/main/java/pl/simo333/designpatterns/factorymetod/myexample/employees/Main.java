package pl.simo333.designpatterns.factorymetod.myexample.employees;

import pl.simo333.designpatterns.factorymetod.myexample.employees.factory.EmployeeCreator;
import pl.simo333.designpatterns.factorymetod.myexample.employees.factory.PainterFactory;
import pl.simo333.designpatterns.factorymetod.myexample.employees.factory.BuilderFactory;

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
