package Fig2;

import java.util.List;

public abstract class Company {
    public abstract List<Employee> getEmployees();

    public void createSoftware() {
        List<Employee> employees = getEmployees();
        for (Employee e : employees) {
            e.doWork();
        }
    }
}
