import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory extends Company{
    List<Company> structure = new ArrayList<>();

    public CompanyDirectory(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public void add(Company company) {
        structure.add(company);
    }

    @Override
    public void remove(Company company) {
        structure.add(company);
    }

    @Override
    public List<Company> getList() {
        return structure;
    }

    @Override
    public void print() {
        System.out.println("\n" + getId() + " " + getName());
        System.out.println("---------------------------");
        for (Company company : structure) {
            company.print();
        }
    }

    @Override
    public List<Company> sortById(){
        for (Company company : structure) {
            company.getList().sort(new IdSorter());
        }
        System.out.println();
        return structure;
    }

    @Override
    public List<Company> sortByName() {
        for (Company company : structure) {
            company.getList().sort(new FirstNameSorter());
        }
        System.out.println();
        return structure;
    }

    @Override
    public List<Company> sortBySurname(){
        for (Company company : structure) {
            company.getList().sort(new SurnameSorter());
        }
        System.out.println();
        return structure;
    }

    @Override
    public List<Company> sortByPosition() {
        for (Company company : structure) {
            company.getList().sort(new PositionPriority());
        }
        System.out.println();
        return structure;
    }

    @Override
    public List<Company> sortBySalary() {
        for (Company company : structure) {
            company.getList().sort(new SalarySorter());
        }
        System.out.println();
        return structure;
    }
}