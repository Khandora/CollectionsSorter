
public class Employees implements Comparable<Employees> {
    private int id;
    private String name;
    private String surname;
    private String profession;
    private int salary;

    public Employees(int id, String name, String surname, String profession, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.profession = profession;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee " + id + " " + name + " " + surname + " " + profession + " " + salary + "\n";
    }

    @Override
    public int compareTo(Employees o) {
        return this.id - o.id;

    }
}
