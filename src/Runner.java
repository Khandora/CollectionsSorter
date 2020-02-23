public class Runner {

    public static void main(String[] args) {
        CompanyDirectory directory = new CompanyDirectory();
        Actor actor1 = new Actor(100,"Brad", "Pitt", PositionPriority.SECONDARY_ROLE, 4690);
        Actor actor2 = new Actor(101, "Leonardo", "DiCaprio", PositionPriority.MAIN_ROLE, 5543);
        Producer producer1 = new Producer(200, "Ridley", "Scott", PositionPriority.MAIN_PROD, 3200);
        Producer producer2 = new Producer(201, "Roland", "Rich", PositionPriority.SECONDARY_PROD, 2400);
        Stuntman stuntman1 = new Stuntman(300,"Dar", "Robinson", PositionPriority.SENIOR_STUNT, 600);
        Stuntman stuntman2 = new Stuntman(301, "Vic", "Armstrong", PositionPriority.JUNIOR_STUNT, 522);
        directory.addEmployee(actor1);
        directory.addEmployee(actor2);
        directory.addEmployee(producer1);
        directory.addEmployee(producer2);
        directory.addEmployee(stuntman1);
        directory.addEmployee(stuntman2);
        System.out.println("Sorted by id");
        directory.getList().sort(new IdSorter());
        directory.showEmployeeInfo();
        System.out.println("Sorted by first name");
        directory.getList().sort(new FirstNameSorter());
        directory.showEmployeeInfo();
        System.out.println("Sorted by surname");
        directory.getList().sort(new SurnameSorter());
        directory.showEmployeeInfo();
        System.out.println("Sorted by position priority");
        directory.getList().sort(new PositionPriority());
        directory.showEmployeeInfo();
        System.out.println("Sorted by salary");
        directory.getList().sort(new SalarySorter());
        directory.showEmployeeInfo();
    }
}