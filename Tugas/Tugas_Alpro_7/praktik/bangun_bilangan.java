package Tugas.Tugas_Alpro_7.praktik;

import java.util.Scanner;

/**
 * main
 */
class run {
    public static void main(String[] args) {
        bangun_bilangan bgn = new bangun_bilangan();
        bgn.input();
    }
}

public class bangun_bilangan {
    Scanner inp = new Scanner(System.in);

    void input() {
        System.out.print("Ketinggian : ");
        int tinggi = inp.nextInt();

        System.out.println("Pola Bilangan :");
        polaSegitiga(tinggi);
    }

    void polaSegitiga(int n) {
        if (n >= 1) {

            // Do While
            int counterBaris = 1;
            do {
                System.out.println();
                int kolom = 1;
                do {
                    System.out.print(kolom + " ");
                    kolom++;
                } while (kolom <= counterBaris);
                counterBaris++;
            } while (counterBaris <= n);

            // While
            // int counterBaris = 1;
            // while (counterBaris <= n) {
            // int kolom = 1;
            // while (kolom <= counterBaris) {
            // System.out.print(kolom + " ");
            // kolom++;
            // }
            // System.out.println();
            // counterBaris++;
            // }

            // For
            // for (int i = 1; i <= n; i++) {
            // for (int j = 1; j <= i; j++) {
            // System.out.print(j + " ");
            // }
            // System.out.println();
            // }
        } else {
            System.out.println("Inputan harus bilanganasli");
        }
    }
}