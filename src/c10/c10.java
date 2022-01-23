package c10;

import java.util.Scanner;

public class c10 {
    public static void main(String[] args) {
        System.out.println("------------------------Ex.1------------------------");
        char a = 75;
        while (a < 151) {
            System.out.println(a + " - " + (a * 1));
            a++;
        }
        System.out.println("------------------------Ex.2------------------------");
        byte b = 4;        // od 0 do 15 dlatego nie trzeba zmaniac na heksadecymalny
        System.out.println((char)( b + 'A'));
        System.out.println("------------------------Ex.3------------------------");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int y = 1;
        while (y <= n) {
            for (int i =1; i<=4; i++)
                System.out.print(Math.pow(y, i) + " (^" + i + "), ");
            System.out.println();
            y++;
        }
        System.out.println("------------------------Ex.4------------------------");
        char gwiazda = '*';
        char spacja = ' ';
        byte m = 6;
        for (int i = 1; i <= m; i++) {
            int l = (i % 2 == 0) ? 2 : 1;
            System.out.print(i + " ");
            while (l < m) {
                if (l % 2 == 0) {
                    System.out.print(spacja);
                } else {
                    System.out.print(gwiazda);
                }

                l++;
            }
            System.out.println();
        }

        System.out.println("------------------------Ex.5------------------------");
        int czlWon = 0, pcWon = 0;
        byte p;
        do {
            System.out.println("Gracz: podaj liczbe (1-papier, 2-kamień, 3-nożyce, 4-wyjść z gry)");
            p = in.nextByte();
            if (p > 4 || p < 0) {
                System.out.println("Error");
            } else {
                byte a1 = 1, a2 = 3; //Granica Math.random
                byte pc = (byte) (a1 + (byte) (Math.random() * a2));
                if (p!=4)
                switch (pc) {
                    case 1:
                        System.out.println("Pc wybral papier!");
                        if (p == 1) {
                            System.out.println("Nikt nie wygral");
                        } else if (p == 2) {
                            System.out.println("PC wygral");
                            pcWon++;
                        } else {
                            System.out.println("Czlowek wygral");
                            czlWon++;
                        }
                        break;
                    case 2:
                        System.out.println("Pc wybral kamień!");
                        if (p == 1) {
                            System.out.println("Czlowek wygral");
                            czlWon++;
                        } else if (p == 2) {
                            System.out.println("Nikt nie wygral");
                        } else {
                            System.out.println("PC wygral");
                            pcWon++;
                        }
                        break;
                    case 3:
                        System.out.println("Pc wybral nożyce!");
                        if (p == 1) {
                            System.out.println("PC wygral");
                            pcWon++;
                        } else if (p == 2) {
                            System.out.println("Czlowek wygral");
                            czlWon++;
                        } else {
                            System.out.println("Nikt nie wygral");
                        }
                        break;
                    default:
                        System.out.println("Error");
                        break;
                }
            }
            System.out.println("PC wygral " + pcWon + " razy.");
            System.out.println("Czlowiek wygral " + czlWon + " razy.");
        } while (p != 4);
    }
}
