public class Stuntman extends Company{

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
    public Integer getSalary() {
        return salary;
    }

    @Override
    public void print() {
        System.out.println("Stuntman | " + id + " | " + name + " | " +
                surname + " | " + position + " | " + salary + " " + moneyType);
    }
}