import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */

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
