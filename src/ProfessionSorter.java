import java.util.Comparator;

public class ProfessionSorter implements Comparator<Employees> {

    @Override
    public int compare(Employees o1, Employees o2) {
        return o1.getProfession().compareTo(o2.getProfession());
    }
}
