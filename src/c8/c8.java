package c8;

import java.util.Scanner;

public class c8 {
    public static void main(String[] args) {
        //Z.1 (a==b)
        System.out.println("---------------Ex.2---------------");
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj rok: ");
        int year = in.nextInt();
        System.out.println("Podaj mesiac: ");
        int mounth = in.nextInt();
        boolean przestepny = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        System.out.println("Jest przestepny = " + przestepny);
        switch (mounth) {
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println(31);
            case 2 -> System.out.println((przestepny) ? 29 : 28);

//                if (przestepny)
//                    System.out.println("Dni = " + 29);
//                else
//                    System.out.println("Dni = " + 28);
            case 4, 6, 9, 11 -> System.out.println("Dni = " + 30);
        }
        System.out.println("---------------Ex.3---------------");
        char ch = in.next().charAt(0);
        switch (ch) {
            case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U', 'y', 'Y', 'ę', 'Ę', 'ą', 'Ą' -> System.out.println("Samogloska");
            default -> System.out.println("Spolgloska");
        }
        System.out.println("---------------Ex.4---------------");
        System.out.println("Podaj dwie liczbe rzeczywiste: ");
        double x1 = in.nextDouble();
        double x2 = in.nextDouble();
        if (((int) x1 * 100) == ((int) x2 * 100))
            System.out.println(x1 + " == " + x2);
        else
            System.out.println(x1 + " != " + x2);
        // -0.01 < a-b <0.01
        System.out.println("---------------Ex.5---------------");
        System.out.println("Podaj katy trojkata: ");
        int y = in.nextInt();
        int h = in.nextInt();
        int l = in.nextInt();
        if ((y + h + l) == 180) {
            System.out.println("Istnieje");
            if (y <= 90 && h <= 90 && l <= 90)
                System.out.println("Ostrokatny");
        } else {
            System.out.println("NIE Istnieje");
        }
        System.out.println("---------------Ex.6---------------");
        System.out.println("Podaj trzy liczby (a,b,c) (ax^2+bx+c) ");
        double D;
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        D = Math.pow(b, 2) - 4 * a * c;
        if (D > 0) {
            System.out.println("x1 = " + ((-b - Math.sqrt(D)) / (2 * a)));
            System.out.println("x2 = " + ((-b + Math.sqrt(D)) / (2 * a)));
        } else if (D == 0) {
            System.out.println("x0 = " + (-b / 2 * a));
        } else {
            System.out.println("Brak");
        }
        System.out.println("---------------Ex.7---------------");
        System.out.println("Podaj punkty i max punktow: ");
        int pnkt = in.nextInt();
        int max = in.nextInt();

        double proc = pnkt / max;
        if (proc >= 0.875) {
            System.out.println(5);
        } else if (proc >= 0.75) {
            System.out.println(4);
        } else if (proc >= 0.5) {
            System.out.println(3);
        } else {
            System.out.println(2);
        }
    }
}
