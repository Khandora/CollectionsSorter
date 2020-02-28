import java.util.Comparator;

public class SurnameSorter implements Comparator<Company> {

    @Override
    public int compare(Company o1, Company o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}