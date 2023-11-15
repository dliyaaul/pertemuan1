package Tugas.Tugas_Alpro_6.jurnal;

import java.util.Random;
import java.util.Scanner;

public class tebak_angka {
    Scanner inp = new Scanner(System.in);
    int nilai;
    int tebakan;
    int max;
    int min;
    int counter;

    public static void main(String[] args) {
        tebak_angka db = new tebak_angka();
        db.runthis();
    }

    void runthis() {
        int tebak;
        Random gen = new Random();
        nilai = gen.nextInt(100);
        max = 100;
        min = 0;
        counter = 0;
        do {
            System.out.print("Tebak angka antara " + min + " - " + max + " : ");
            tebak = inp.nextInt();
            if ((tebak >= min) && (tebak <= max)) {
                if (tebak == nilai)
                    System.out.println("tebakan anda benar");
                else if (tebak > nilai) {
                    System.out.println("tebakan anda lebih besar");
                    max = tebak;
                } else {
                    System.out.println("tebakan anda lebih kecil");
                    min = tebak;
                }
            } else {
                System.out.println("Tebakan diluar rentang");
                System.out.println("Tebak antara " + min + " dan " + max);
            }
            counter = counter + 1;
        } while (tebak != nilai);
        System.out.println("Nilai yang dicari adalah : " + nilai);
        System.out.println("Berhasil menebak dalam " + counter + " kali");
    }
}
