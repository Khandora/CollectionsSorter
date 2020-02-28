import java.util.List;

public abstract class Company {
    int id;
    String name;
    String surname;
    Integer salary;
    String position;
    public void add(Company company){
        throw new UnsupportedOperationException();
    }

    public void remove(Company company){
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

    public List<Company> getList(){
        return null;
    }

    public List<Company> sortById(){
        throw new UnsupportedOperationException();
    }

    public List<Company> sortByName(){
        throw new UnsupportedOperationException();
    }

    public List<Company> sortBySurname(){
        throw new UnsupportedOperationException();
    }

    public List<Company> sortByPosition(){
        throw new UnsupportedOperationException();
    }

    public List<Company> sortBySalary(){
        throw new UnsupportedOperationException();
    }
}