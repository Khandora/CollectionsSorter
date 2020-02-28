import java.util.Comparator;

public class SalarySorter implements Comparator<Company> {

    @Override
    public int compare(Company o1, Company o2) {
        return o2.getSalary() - o1.getSalary();
    }
}