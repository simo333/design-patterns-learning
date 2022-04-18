package pl.simo333.factorymetod.myexample.employees.factory;

import pl.simo333.factorymetod.myexample.employees.Employee;

public abstract class EmployeeCreator {
    public void commandToWork() {
        Employee employee = createEmployee();
        employee.work();
    }

    public abstract Employee createEmployee();

}
