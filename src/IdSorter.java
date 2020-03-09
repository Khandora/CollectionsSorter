import java.util.Comparator;

public class IdSorter implements Comparator<OrganizationStructure> {

    @Override
    public int compare(OrganizationStructure o1, OrganizationStructure o2) {
        return o1.getId() - o2.getId();
    }
}