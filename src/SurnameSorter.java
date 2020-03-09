import java.util.Comparator;

public class SurnameSorter implements Comparator<OrganizationStructure> {

    @Override
    public int compare(OrganizationStructure o1, OrganizationStructure o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}