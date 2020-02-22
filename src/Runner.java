public class Runner {

    public static void main(String[] args) {
        CompanyDirectory directory = new CompanyDirectory();
        Actor actor1 = new Actor(100,"Brad", "Pitt", PositionPriority.SECONDARY_ROLE, 46900);
        Actor actor2 = new Actor(101, "Leonardo", "DiCaprio", PositionPriority.MAIN_ROLE, 55430);
        Producer producer1 = new Producer(200, "Ridley", "Scott", PositionPriority.MAIN_PROD, 32000);
        Producer producer2 = new Producer(201, "Roland", "Emmerich", PositionPriority.SECONDARY_PROD, 24000);
        Stuntman stuntman1 = new Stuntman(300,"Dar", "Robinson", PositionPriority.SENIOR_STUNT, 6000);
        Stuntman stuntman2 = new Stuntman(301, "Vic", "Armstrong", PositionPriority.JUNIOR_STUNT, 5222);
        directory.addEmployee(actor1);
        directory.addEmployee(actor2);
        directory.addEmployee(producer1);
        directory.addEmployee(producer2);
        directory.addEmployee(stuntman1);
        directory.addEmployee(stuntman2);
        directory.getList().sort(new PositionPriority());
        directory.showEmployeeInfo();
    }
}