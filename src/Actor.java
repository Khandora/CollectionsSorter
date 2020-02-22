public class Actor implements Employee{
    private int id;
    private String name;
    private String surname;
    private String position;
    private int salary;
    private String moneyType = "USD";

    public Actor(int id, String name, String surname, String position, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void showEmployeeInfo() {
        System.out.println("Actor | " + id + " | " + name + " | " + surname + " | " + position + " | " + salary + " " + moneyType);
    }

    @Override
    public String getName() {
        return name;
    }
}