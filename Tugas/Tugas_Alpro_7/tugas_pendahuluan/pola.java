package Tugas.Tugas_Alpro_7.tugas_pendahuluan;

import java.util.Scanner;

/**
 * MainPola
 */
class MainPola {
    public static void main(String[] args) {
        pola pl = new pola();
        pl.input();
    }
}

public class pola {
    Scanner inp = new Scanner(System.in);
    int pnjng;

    void input() {
        System.out.print("Masukkan Panjang : ");
        pnjng = inp.nextInt();

        perulangan(pnjng);
    }

    void perulangan(int constraint) {
        int mid = constraint / 2;
        for (int baris = 0; baris <= constraint; baris++) {

            for (int kolom = 0; kolom <= constraint; kolom++) {
                if (baris == 0 && kolom < mid) {
                    System.out.print("*");
                } else if (kolom == constraint && baris < mid) {
                    System.out.print("*");
                } else if (kolom == 0 && baris > mid) {
                    System.out.print("*");
                } else if (baris == constraint && kolom > mid) {
                    System.out.print("*");
                } else if (baris == mid || kolom == mid) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}