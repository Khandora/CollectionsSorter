public class Runner {

    public static void main(String[] args) {
        Actor actor1 = new Actor(102,"Brad", "Pitt", PositionPriority.SECONDARY_ROLE, 4690);
        Actor actor2 = new Actor(101, "Leonardo", "DiCaprio", PositionPriority.MAIN_ROLE, 5543);
        Actor actor3 = new Actor(103,"Jim","Carrey",PositionPriority.MAIN_ROLE,4800);
        Producer producer1 = new Producer(203, "Ridley", "Scott", PositionPriority.MAIN_PROD, 3200);
        Producer producer2 = new Producer(201, "Roland", "Rich", PositionPriority.SECONDARY_PROD, 2400);
        Producer producer3 = new Producer(202,"Michael","Mann",PositionPriority.SECONDARY_PROD,2600);
        Stuntman stuntman1 = new Stuntman(302,"Dar", "Robinson", PositionPriority.SENIOR_STUNT, 600);
        Stuntman stuntman2 = new Stuntman(301, "Vic", "Armstrong", PositionPriority.JUNIOR_STUNT, 522);
        Stuntman stuntman3 = new Stuntman(303,"John","Woo",PositionPriority.JUNIOR_STUNT,589);

        Company actorDirectory = new CompanyDirectory(100,"Actors' directory ");
        actorDirectory.add(actor1);
        actorDirectory.add(actor2);
        actorDirectory.add(actor3);

        Company producerDirectory = new CompanyDirectory(200,"Producers' directory");
        producerDirectory.add(producer1);
        producerDirectory.add(producer2);
        producerDirectory.add(producer3);

        Company stuntmanDirectory = new CompanyDirectory(300,"Stuntman's directory");
        stuntmanDirectory.add(stuntman1);
        stuntmanDirectory.add(stuntman2);
        stuntmanDirectory.add(stuntman3);

        Company directory = new CompanyDirectory(1,"Company's directory");
        directory.add(actorDirectory);
        directory.add(producerDirectory);
        directory.add(stuntmanDirectory);

        directory.print();

        directory.sortById();
        System.out.println("Sorted by id");
        directory.print();

        directory.sortByName();
        System.out.println("Sorted by first name");
        directory.print();

        directory.sortBySurname();
        System.out.println("Sorted by surname");
        directory.print();

        directory.sortByPosition();
        System.out.println("Sorted by position priority");
        directory.print();

        directory.sortBySalary();
        System.out.println("Sorted by salary");
        directory.print();
    }
}