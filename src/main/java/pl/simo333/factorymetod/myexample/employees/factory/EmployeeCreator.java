package pl.simo333.factorymetod.myexample.employees.factory;

import pl.simo333.factorymetod.myexample.employees.Employee;

public abstract class EmployeeCreator {
    private String name;
    private String lastName;

    private EmployeeCreator(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public abstract Employee createEmployee(String name, String lastName);

}
