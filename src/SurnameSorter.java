import java.util.Comparator;

public class SurnameSorter implements Comparator<Employees> {

    @Override
    public int compare(Employees o1, Employees o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
