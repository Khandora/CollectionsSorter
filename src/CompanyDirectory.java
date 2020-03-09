import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory extends OrganizationStructure {
    List<OrganizationStructure> structure = new ArrayList<>();

    public CompanyDirectory(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public void add(OrganizationStructure organizationStructure) {
        structure.add(organizationStructure);
    }

    @Override
    public void remove(OrganizationStructure organizationStructure) {
        structure.add(organizationStructure);
    }

    @Override
    public List<OrganizationStructure> getList() {
        return structure;
    }

    @Override
    public void print() {
        System.out.println("\n" + getId() + " " + getName());
        System.out.println("---------------------------");
        for (OrganizationStructure organizationStructure : structure) {
            organizationStructure.print();
        }
    }

    @Override
    public List<OrganizationStructure> sortById(){
        for (OrganizationStructure organizationStructure : structure) {
            organizationStructure.getList().sort(new IdSorter());
        }
        System.out.println();
        return structure;
    }

    @Override
    public List<OrganizationStructure> sortByName() {
        for (OrganizationStructure organizationStructure : structure) {
            organizationStructure.getList().sort(new FirstNameSorter());
        }
        System.out.println();
        return structure;
    }

    @Override
    public List<OrganizationStructure> sortBySurname(){
        for (OrganizationStructure organizationStructure : structure) {
            organizationStructure.getList().sort(new SurnameSorter());
        }
        System.out.println();
        return structure;
    }

    @Override
    public List<OrganizationStructure> sortByPosition() {
        for (OrganizationStructure organizationStructure : structure) {
            organizationStructure.getList().sort(new PositionPriority());
        }
        System.out.println();
        return structure;
    }

    @Override
    public List<OrganizationStructure> sortBySalary() {
        for (OrganizationStructure organizationStructure : structure) {
            organizationStructure.getList().sort(new SalarySorter());
        }
        System.out.println();
        return structure;
    }
}