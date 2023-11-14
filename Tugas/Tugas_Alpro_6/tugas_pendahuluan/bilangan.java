package Tugas.Tugas_Alpro_6.tugas_pendahuluan;

import java.util.Scanner;

/**
 * Innerbilangan
 */
class MainBilangan {
    public static void main(String[] args) {
        bilangan blngn = new bilangan();
        blngn.menu();
    }
}

/**
 * bilangan
 */
public class bilangan {
    Scanner inp = new Scanner(System.in);
    int menu, bil = 0;
    boolean ulang = true;

    void menu() {
        System.out.println("\nSilahkan Pilih Menu Dibawah Ini");
        System.out.println("1. Biner");
        System.out.println("2. Prima");
        System.out.println("3. Faktorial");
        System.out.println("4. Permutasi");
        System.out.println("5. Jarak");
        System.out.println("6. Keluar");

        System.out.print("Pilihan Anda [1-6] : ");
        menu = inp.nextInt();

        switch (menu) {
            case 1:
                biner();
                break;
            case 2:
                prima();
                break;
            case 3:
                faktorial();
                break;
            case 4:
                permutasi();
                break;
            case 5:
                jarak();
                break;
            case 6:
                System.exit(0);
                break;
            default:
                System.out.println("\nPilihan Anda Tidak Valid!");
                ulang();
                break;
        }
    }

    void biner() {
        System.out.println("\nMenghitung Bilangan Biner");
        System.out.print("Masukkan nilai : ");
        int nilai = inp.nextInt();

        String biner = "";
        if (nilai == 0) {
            biner = "0";

            System.out.println("Nilai dalam basis 2 adalah : " + biner);
        } else if (nilai < 0) {
            System.out.println("Nilai Tidak Boleh Min");
        } else {
            while (nilai > 0) {
                biner = (nilai % 2) + biner;
                nilai = nilai / 2;
            }

            System.out.println("Nilai dalam basis 2 adalah : " + biner);
        }

        ulang();

    }

    void prima() {
        int bil1;
        System.out.println("\nMenghitung Bilangan Prima");
        System.out.print("Masukkan Angka = ");
        bil1 = inp.nextInt();

        for (int i = 2; i <= bil1; i++) {
            if (bil1 % i == 0) {
                bil++;
            }
        }

        if (bil == 1) {
            System.out.println(bil1 + " adalah bilangan prima");
        } else {
            System.out.println(bil1 + " bukan bilangan prima");
        }
        ulang();
    }

    void faktorial() {

    }

    void permutasi() {

    }

    void jarak() {

    }

    public void ulang() {
        System.out.print("\nApakah Ingin Mengulang (y/n)? ");
        String pilihan = inp.next();
        ulang = pilihan.equals("y");
        if (ulang == true) {
            menu();
        } else {
            System.exit(0);
        }
    }
}