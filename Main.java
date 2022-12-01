import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        List<Knoten> alle = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);
        boolean nochEiner;

        do {
            System.out.println("Bitte gebe im Folgenden alle Knoten an");
            System.out.println("Bitte gebe die APNummer ein");
            int nr = scanner.nextInt();
            scanner.nextLine();


            System.out.println("Bitte gebe die Beschreibung ein");
            String beschreibung = scanner.nextLine();


            System.out.println("Bitte gebe 0-3 Vorgänger über ihre APNummer an");
            int[] vorgaenger = new int[3];
            for (int i = 0; i < 3; i++) {
                System.out.print("Bitte gebe den " + (i + 1) + ". Vorgänger ein.");
                System.out.print("Wenn du keine weiteren Vorgänger eingeben willst, gib 0 ein.");
                vorgaenger[0] = scanner.nextInt();
                if (vorgaenger[0] == 0) {
                    break;
                }
                scanner.nextLine();
            }
            System.out.println("Bitte gebe die Dauer ein");
            double dauer = scanner.nextDouble();
            scanner.nextLine();

            alle.add(new Knoten(nr, beschreibung, vorgaenger, dauer));


            System.out.println("Möchtest du weitere angeben? Schreibe true für Ja oder false für nein!");
            nochEiner = scanner.nextBoolean();
            scanner.nextLine();

        }while (nochEiner);
        for (Knoten k : alle) {
            System.out.println(k);
    }
    }
}





