public class Stuntman implements Employee{
    private int id;
    private String name;
    private String surname;
    private int salary;
    private String position;
    private String moneyType = "USD";

    public Stuntman(int id, String name, String surname, String position, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.position = position;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public void showEmployeeInfo() {
        System.out.println("Stuntman | " + id + " | " + name + " | " +
                surname + " | " + position + " | " + salary + " " + moneyType);
    }
}