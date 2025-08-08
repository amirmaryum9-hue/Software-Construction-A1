package Fig2;

import java.util.Arrays;
import java.util.List;

import Fig2.Employee.Tester;
import Fig2.Employee.Programmer;

public class OutsourcingCompany extends Company {
    public List<Employee> getEmployees() {
        return Arrays.asList(
            new Programmer(),
            new Tester()
        );
    }
}