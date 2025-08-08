package Fig2;

import java.util.Arrays;
import java.util.List;
import Fig2.Employee.Designer;
import Fig2.Employee.Artist;

public class GameDevCompany extends Company {
    public List<Employee> getEmployees() {
        return Arrays.asList(
            new Designer(),
            new Artist()
        );
    }
}
