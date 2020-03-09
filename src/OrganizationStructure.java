import java.util.List;

public abstract class OrganizationStructure {
    public static final String moneyType = "USD";
    int id;
    String name;
    String surname;
    Integer salary;
    String position;
    public void add(OrganizationStructure organizationStructure){
        throw new UnsupportedOperationException();
    }

    public void remove(OrganizationStructure organizationStructure){
        throw new UnsupportedOperationException();
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPosition(){
        return position;
    }

    public Integer getSalary(){
        return salary;
    }

    public void print(){
        throw new UnsupportedOperationException();
    }

    public List<OrganizationStructure> getList(){
        return null;
    }

    public List<OrganizationStructure> sortById(){
        throw new UnsupportedOperationException();
    }

    public List<OrganizationStructure> sortByName(){
        throw new UnsupportedOperationException();
    }

    public List<OrganizationStructure> sortBySurname(){
        throw new UnsupportedOperationException();
    }

    public List<OrganizationStructure> sortByPosition(){
        throw new UnsupportedOperationException();
    }

    public List<OrganizationStructure> sortBySalary(){
        throw new UnsupportedOperationException();
    }
}