import java.util.Comparator;

public class SalarySorter implements Comparator<OrganizationStructure> {

    @Override
    public int compare(OrganizationStructure o1, OrganizationStructure o2) {
        return o2.getSalary() - o1.getSalary();
    }
}