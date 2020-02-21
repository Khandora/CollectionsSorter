import java.util.Comparator;

public class SalarySorter implements Comparator<Employees> {

    @Override
    public int compare(Employees o1, Employees o2) {
        return o1.getSalary() - o2.getSalary();
    }
}
