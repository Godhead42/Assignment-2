
import java.util.ArrayList;
import java.util.Scanner;

public class SystemTrain {
    public ArrayList<Locomotive> locomotives = new ArrayList<Locomotive>();
    public ArrayList<Plackart> plackarts = new ArrayList<Plackart>();
    public ArrayList<Luxury> luxuries = new ArrayList<Luxury>();
    public ArrayList<Freight> freights = new ArrayList<Freight>();
    public ArrayList<Wagon> wagons = new ArrayList<Wagon>();
    public void Begin() {
        Scanner scanner = new Scanner(System.in);
        int menu = 0;
        while (menu !=6) {
            System.out.println("1. To add Locomotive"
                    + "\n2. To add Wagon"
                    + "\n3. To find Locomotive"
                    + "\n4. To find Wagon"
                    + "\n5. List of Direction"
                    + "\n6. Exit from System");
            menu = scanner.nextInt();
            switch (menu) {
                case 1: addLoco();
                    break;
                case 2: addWagon();
                    break;
                case 3: findLoco();
                    break;
                case 4: findWagon();
                    break;
                case 5: direction();
                    break;
                case 6: toExit();
                    break;
            }
        }
    }
    public void addLoco() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input speed for locomotive: ");
        String speed = scanner.nextLine();

        System.out.println("Input max wagon for locomotive: ");
        String emptyCapacity = scanner.nextLine();

        System.out.println("Input travel time: ");
        String timeInWay = scanner.nextLine();

        System.out.println("Input direction: ");
        String direction = scanner.nextLine();

        System.out.println("Input id of locomotive: ");
        String id = scanner.nextLine();
        Locomotive l = new Locomotive(speed,emptyCapacity,id,direction,timeInWay);
        locomotives.add(l);
    }

    public void addWagon() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter type of wagon: ");
        String type = scanner.nextLine();
        if (type.equals("Plackart")) {
            System.out.println("Input id of wagon: ");
            String id = scanner.nextLine();

            System.out.println("Input max capacity of wagon: ");
            String maxCapacity = scanner.nextLine();

            Plackart plackart = new Plackart(id,type,maxCapacity);
            plackarts.add(plackart);
            wagons.add(plackart);
        }

        if (type.equals("Luxury")) {
            System.out.println("Input id of wagon: ");
            String id = scanner.nextLine();
            System.out.println("Input max capacity of wagon: ");
            String maxCapacity = scanner.nextLine();
            Luxury luxury = new Luxury(id, type, maxCapacity);
            luxuries.add(luxury);
            wagons.add(luxury);
        }

        if (type.equals("Freight")) {
            System.out.println("Input id of wagon: ");
            String id = scanner.nextLine();
            System.out.println("Input max capacity of wagon: ");
            String maxCapacity = scanner.nextLine();
            Freight freight = new Freight(id, type, maxCapacity);
            freights.add(freight);
            wagons.add(freight);
        }

    }


    public void findLoco () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id of locomotive: ");
        String id = sc.nextLine();
        for (Locomotive locomotive : locomotives) {
            if (id.equals(locomotive.getId())) {
                System.out.println("Id is: " + locomotive.getId()
                        + "\nSpeed is: " + locomotive.getSpeed()
                        + "\nmaximum number of wagons: " + locomotive.getEmptyCapacity()
                        + "\nDirection: "  + locomotive.getDirection()
                        + "\nTravel time: " + locomotive.getTimeInWay()
                        + "\n");
            }
        }
    }
    public void findWagon() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id of wagon: ");
        String id = scanner.nextLine();
        for (Wagon wagon : wagons) {
            if(id.equals(wagon.getId())) {
                System.out.println("Id is:" + wagon.getId()
                        + "\nType of wagon: " + wagon.getType()
                        + "\nMax capacity of wagon: " + wagon.getMaxCapacity()
                        + "\n");
            }
        }
    }
    public void direction () {
        for (Locomotive l : locomotives) {
                System.out.println("Direction: "  + l.getDirection());
        }
    }
    public void toExit() {
        System.out.println("Exiting from system");
        System.exit(0);
    }

    public ArrayList<Locomotive> getLocomotives() {
        return locomotives;
    }

    public ArrayList<Plackart> getPlackarts() {
        return plackarts;
    }

    public ArrayList<Luxury> getLuxuries() {
        return luxuries;
    }

    public ArrayList<Freight> getFreights() {
        return freights;
    }

    public ArrayList<Wagon> getWagons() {
        return wagons;
    }

}