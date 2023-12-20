package Tugas.Tugas_Alpro_7.praktikArray;

import java.util.Random;

class MainPraktik2 {
    public static void main(String[] args) {
        praktik2 prtk = new praktik2();
        prtk.runThis();
    }
}

public class praktik2 {
    int[] arrNilai = new int[1000];
    Random getRandom = new Random();

    void runThis() {
        inputDoWhile();
        view();
    }

    void inputFor() {
        for (int a = 0; a < arrNilai.length; a++) {
            arrNilai[a] = getRandom.nextInt(101);
            if (arrNilai[a] > 100 || arrNilai[a] < 0) {
                break;
            }
        }
    }

    void inputWhile() {
        int a = 0;
        while (a < arrNilai.length) {
            arrNilai[a] = getRandom.nextInt(101);
            a++;
        }
    }

    void inputDoWhile() {
        int a = 0;
        do {
            arrNilai[a] = getRandom.nextInt(101);
            a++;
        } while (a < arrNilai.length);
    }

    void view() {
        System.out.println("\n\nDaftar Nilai");
        for (int a = 0; a < arrNilai.length; a++) {
            System.out.print(arrNilai[a] + " ");
        }
    }
}
