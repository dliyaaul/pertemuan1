package Tugas.Tugas_Alpro_7.praktik;

import java.util.Scanner;

class runDiagonal {
    public static void main(String[] args) {
        diagonal dgn = new diagonal();
        dgn.input();
    }
}

public class diagonal {
    Scanner inp = new Scanner(System.in);

    void input() {
        System.out.print("Masukkan ukuran pola : ");
        int ukuran = inp.nextInt();

        System.out.println("Ukuran Pola : ");
        perulangan(ukuran);
    }

    void perulangan(int ukuran) {
        for (

                int i = 1; i <= ukuran; i++) {
            for (int j = 1; j <= ukuran; j++) {
                if (i == j) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        for (int i = ukuran - 1; i >= 1; i--) {
            for (int j = 1; j <= ukuran; j++) {
                if (i == j) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
