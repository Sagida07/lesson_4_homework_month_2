import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> listA = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя №" + (i + 1) + " для списка А:");
            String names = scanner.nextLine();
            System.out.println("Имя успешно добавлено в Список А");
            System.out.println("   ");

            listA.add(names);
        }
        System.out.println("Ваш Список A: " + listA);

        System.out.println("---------------------");

        ArrayList<String> listB = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите имя " + (i + 1) + " для списка Б:");
            String names = scanner.nextLine();
            System.out.println("Имя успешно добавлено в Список Б");
            System.out.println("   ");

            listB.add(names);
        }
        System.out.println("Ваш Список Б: " + listB);

        System.out.println("---------------------");

        ArrayList<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4 - i));
        }
        System.out.println("Ваш Список С: " + listC);

        Collections.sort(listC, Comparator.comparing(String::length));


        System.out.println("Ваш отсортированный Список С: " + listC);
}
    }