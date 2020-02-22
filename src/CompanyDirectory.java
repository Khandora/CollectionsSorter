import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee {
    private List<Employee> employeeList = new ArrayList<>();

    @Override
    public void showEmployeeInfo() {
        for(Employee emp:employeeList)
        {
            emp.showEmployeeInfo();
        }
    }

    public void addEmployee(Employee emp)
    {
        employeeList.add(emp);
    }

    public void removeEmployee(Employee emp)
    {
        employeeList.remove(emp);
    }

    public List<Employee> getList() {
        return employeeList;
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getPosition() {
        return null;
    }

    @Override
    public String getSurname() {
        return null;
    }

    @Override
    public int getSalary() {
        return 0;
    }
}