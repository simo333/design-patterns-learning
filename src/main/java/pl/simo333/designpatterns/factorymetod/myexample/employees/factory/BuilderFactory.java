package pl.simo333.designpatterns.factorymetod.myexample.employees.factory;

import pl.simo333.designpatterns.factorymetod.myexample.employees.Builder;
import pl.simo333.designpatterns.factorymetod.myexample.employees.Employee;

public class BuilderFactory extends EmployeeCreator {
    @Override
    public Employee createEmployee() {
        return new Builder();
    }
}
