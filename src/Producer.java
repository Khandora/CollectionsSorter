public class Producer implements Employee {
    private int id;
    private String name;
    private String surname;
    private String position;
    private int salary;
    private String moneyType = "USD";

    public Producer(int id, String name, String surname, String position, int salary) {
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
    public String getName() {
        return name;
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
        System.out.println("Producer | " + id + " | " + name + " | " + surname +
                " | " + position + " | " + salary + " " + moneyType);
    }
}