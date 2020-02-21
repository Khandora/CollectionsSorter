import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<Employees> employeesList = new ArrayList<>();
        employeesList.add(new Employees(5,"Ivan","Ivanov","manager",100000));
        employeesList.add(new Employees(6,"Robert","Stark","king",10000000));
        employeesList.add(new Employees(2,"Luke","Skywalker","jedi",1));
        employeesList.add(new Employees(1,"Brad","Pitt","actor",123456));
        employeesList.add(new Employees(4,"Marshall","Mathers","rapper",999999));
        employeesList.add(new Employees(3,"Will","Smith","actor/rapper",555555));

        System.out.println(employeesList);

        System.out.println("Sorted by id");
        Collections.sort(employeesList);
        System.out.println(employeesList);

        System.out.println("Sorted by first name");
        Collections.sort(employeesList, new FirstNameSorter());
        System.out.println(employeesList);

        System.out.println("Sorted by surname");
        Collections.sort(employeesList, new SurnameSorter());
        System.out.println(employeesList);

        System.out.println("Sorted by profession");
        Collections.sort(employeesList, new ProfessionSorter());
        System.out.println(employeesList);

        System.out.println("Sorted by salary");
        Collections.sort(employeesList, new SalarySorter());
        System.out.println(employeesList);
    }
}
