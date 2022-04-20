package pl.simo333.designpatterns.factorymetod.myexample.employees.factory;

import pl.simo333.designpatterns.factorymetod.myexample.employees.Employee;
import pl.simo333.designpatterns.factorymetod.myexample.employees.Painter;

public class PainterFactory extends EmployeeCreator {
    @Override
    public Employee createEmployee() {
        return new Painter();
    }
}
