public class Actor extends Company{

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
    public Integer getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("Actor | " + id + " | " + name + " | " + surname + " | " + position + " | " + salary + " " + moneyType);
    }

    @Override
    public String getName() {
        return name;
    }
}