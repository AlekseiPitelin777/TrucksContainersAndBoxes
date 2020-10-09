import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int MAX_CONTAINERS_IN_TRUCK = 12;
        final int MAX_BOXES_IN_CONTAINER = 27;

        int trucks = 1; //Порядковый номер грузовика
        int containers = 1; //Порядковый номер контейнера
        int boxes = 0;


        System.out.print("How many boxes needed?: ");
        int counter = scanner.nextInt();
        System.out.println("Truck № " + trucks);
        System.out.println("\tContainer № " + containers);

        while (boxes < counter) {
            System.out.println("\t\tBox № " + ++boxes);
            if ((containers % MAX_CONTAINERS_IN_TRUCK == 0) && (boxes % MAX_BOXES_IN_CONTAINER == 0)) {
                System.out.println("Truck № " + ++trucks);
            }
            if (boxes % MAX_BOXES_IN_CONTAINER == 0) System.out.println("\tContainer № " + ++containers);
        }
        System.out.println("If you want to transport " + boxes + " boxes" +
                " you need " + trucks + " trucks and " + containers + " containers" );
    }

}
