package Tugas.Tugas_Alpro_7.praktikArray;

import java.util.Scanner;

class MainPraktik {
    public static void main(String[] args) {
        praktik1 prk = new praktik1();
        prk.input();
    }
}

public class praktik1 {
    Scanner inp = new Scanner(System.in);
    int arr[] = new int[10];

    void input() {
        System.out.print("Masukkan Berapa Nilai yang Ingin di Input : ");
        int nilai = inp.nextInt();
        if (nilai != 0 || nilai > 0) {
            // While
            // int a = 0;
            // System.out.println("Input Data");
            // while (a < nilai) {
            // System.out.print("Nilai " + (a + 1) + " : ");
            // arr[a] = inp.nextInt();
            // a++;
            // }
            // System.out.println();

            // view(nilai);

            // For
            System.out.println("Input Data");
            for (int a = 0; a < nilai; a++) {
                System.out.print("Nilai " + (a + 1) + " : ");
                arr[a] = inp.nextInt();
            }
            System.out.println();
            view(nilai);
        } else {
            System.out.println("Inputan Tidak Memenuhi Kondisi");
        }
    }

    void view(int n) {
        // While
        // int a = 0;
        // System.out.println("View Data");
        // while (a < n) {
        // System.out.println("Nilai " + (a + 1) + " : " + arr[a]);
        // a++;
        // }
        // System.out.println();

        // For
        System.out.println("View Data");
        for (int a = 0; a < n; a++) {
            System.out.println("Nilai " + (a + 1) + " : " + arr[a]);
        }
        System.out.println();
    }
}
