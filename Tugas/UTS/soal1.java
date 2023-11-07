package Tugas.UTS;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        soal1 uts = new soal1();
        uts.input();
    }
}

public class soal1 {
    Scanner inp = new Scanner(System.in);
    int totalInp;
    int angka;
    String validasi;

    public void input() {
        System.out.print("\nIngin Berapa Kali Input? = ");
        totalInp = inp.nextInt();
        System.out.println("\nAngka Harus min/max 3 digit!");
        for (int i = 1; i <= totalInp; i++) {
            System.out.print("Masukkan Angka = ");
            angka = inp.nextInt();
            if ((angka <= 999) && angka >= 100) {
                String angkaStr = Integer.toString(angka);
                int posisi = 0, posisi1 = 1, posisi2 = 2;
                char charPosisi0 = angkaStr.charAt(posisi);
                char charPosisi1 = angkaStr.charAt(posisi1);
                char charPosisi2 = angkaStr.charAt(posisi2);
                if ((charPosisi1 > charPosisi0) && charPosisi2 > charPosisi1) {
                    if (charPosisi2 % 2 != 0) {
                        validasi = "Valid";
                    } else {
                        validasi = "Tidak Valid";
                    }
                } else {
                    validasi = "Tidak Valid";
                }

                System.out.println(angka + " = " + validasi);
            } else {
                System.out.println("Angka Harus diatas / dibawah 3 digit!");
            }
        }
    }
}