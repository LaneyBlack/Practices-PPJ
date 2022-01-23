package c9;

import java.util.Scanner;

public class c9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("----------------Ex.1----------------");
//        for (int i = 1; i < 11; i++)
//            System.out.println(i);
//        System.out.println("----------------Ex.2----------------");
//        int wrt = 6;
//        for (int i = 1; i < 11; i++)
//            System.out.println(wrt * i);
//        System.out.println("----------------Ex.3----------------");
//        boolean z = false;
//        System.out.println("Wynik while");
//        while (z)
//            System.out.println(z);
//        System.out.println("Wynik do while");
//        do
//            System.out.println(z);
//        while (z);
//        System.out.println("----------------Ex.4----------------");
//        int varIn;
//        do varIn = in.nextInt();
//        while (varIn != 0);
//        System.out.println("----------------Ex.5----------------");
//        int studentNumber = in.nextInt();
//        for (int i = 0; i <= studentNumber; i++)
//            System.out.println(i);
//        System.out.println("----------------Ex.6----------------");
//        double sum = 0;
//        for (int i = 0; i < 11; i++)
//            System.out.println(sum = sum + 1 / Math.pow(2, i));
//        System.out.println("----------------Ex.7----------------");
//        int daysToDate = 0;
//        System.out.println("Podaj dzien");
//        int day = in.nextInt();
//
//        System.out.println("Podaj miesiac");
//        int month = in.nextInt();
//        if (month < 0 || month > 12)
//            System.out.println("Miesac powinien byc mniejszy od 12 i wiekszy od 0");
//        else {
//            while (month > 0) {
//                month--;
//                //TODO  mies 2 and dzien 29 maja wyjatek 117?
//                switch (month) {
//                    case 1, 3, 5, 7, 8, 10, 12: {
//                        if (day > 31) {
//                            System.out.println("Ten mesiac ma tylko 31 dzien!");
//                            day = 31;
//                        }
//                        daysToDate += 31;
//                        break;
//                    }
//                    case 2: {
//                        if (day > 28) {
//                            System.out.println("Ten mesiac ma tylko 28 dni!");
//                            day = 28;
//                        }
//                        daysToDate += 28;
//                        break;
//                    }
//                    case 4, 6, 9, 11: {
//                        if (day > 30) {
//                            System.out.println("Ten mesiac ma tylko 30 dni!");
//                            day = 30;
//                        }
//                        daysToDate += 30;
//                        break;
//                    }
//                    default:
//                        break;
//                }
//            }
//            daysToDate += day;
//            System.out.println(daysToDate);
//        }

        System.out.println("----------------Ex.8----------------");
        float kwota = in.nextFloat();
        float[] vals = new float[]{10, 5, 2, 1, 0.5f, 0.2f, 0.1f, 0.05f};
        int y;

        for (float x :
                vals) {                 //Бегу по списку флоатов и использую каждое число от 10 до 0.05. Получается н принимает значения всех чисел списка.
            y = Math.round(kwota / x * 100) / 100;
            if (x >= 1)
                System.out.println(y + " " + (int) x + "zl");
            else
                System.out.println(y + " " + (int) (x * 100) + "gr");

            kwota -= y * x;
            kwota = (float) (Math.round(kwota * 100)) / 100;     //TODO Bez tego(Math.round) 0.25 - 0.2 = 0.49999999997   Dlaczego?
        }


        while (kwota < 0.05) {
            if (kwota >= 10) {
                y = (int) (kwota / 10);
                System.out.println(y + " 10 zl");
                kwota -= y * 10;
            } else if (kwota >= 5) {
                y = (int) (kwota / 5);
                System.out.println(y + " 5 zl");
                kwota -= y * 5;
            } else if (kwota >= 2) {
                y = (int) (kwota / 2);
                System.out.println(y + " 2 zl");
                kwota -= y * 2;
            } else if (kwota >= 1) {
                y = (int) (kwota);
                System.out.println(y + " 1 zl");
                kwota -= y;
            } else if (kwota >= 0.5) {
                y = (int) (kwota / 0.5);
                System.out.println(y + " 50 gr");
                kwota -= y * 0.5;
            } else if (kwota >= 0.2) {
                y = (int) (kwota / 0.2);
                System.out.println(y + " 20 gr");
                kwota -= y * 0.2;
            } else if (kwota >= 0.1) {
                y = (int) (kwota / 0.1);
                System.out.println(y + " 10 gr");
                kwota -= y * 0.1;
            } else if (kwota >= 0.05) {
                y = (int) (kwota / 0.05);
                System.out.println(y + " 5 gr");
                kwota -= y * 0.05;
            }
        }
        System.out.println(kwota);
    }
}

