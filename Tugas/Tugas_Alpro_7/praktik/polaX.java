package Tugas.Tugas_Alpro_7.praktik;

import java.util.Scanner;

class runPolaX {
    public static void main(String[] args) {
        polaX plx = new polaX();
        plx.EksekusiMenu();
    }
}

public class polaX {
    Scanner scanner = new Scanner(System.in);
    String jenis;

    void menu() {
        System.out.println("\nAplikasi Pola X");
        System.out.println("Menu Perulangan");
        System.out.println("1. Perulangan Do While");
        System.out.println("2. Perulangan While");
        System.out.println("3. Perulangan For");
        System.out.println("4. Keluar");
        System.out.print("Masukkan pilihan anda [1-4] : ");
    }

    void EksekusiMenu() {
        int pilihan = 0;
        while (pilihan != 4) {
            menu();
            pilihan = scanner.nextInt();
            switch (pilihan) {
                case 1:
                    input(pilihan);
                    break;
                case 2:
                    input(pilihan);
                    break;
                case 3:
                    input(pilihan);
                    break;
                case 4:
                    System.out.println("Keluar dari aplikasi...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Inputan Yang Anda Masukkan Tidak Valid!");
                    break;
            }
        }
    }

    void input(int pilihan) {
        System.out.print("\nMasukkan tinggi pola X: ");
        int tinggi = scanner.nextInt();
        if (pilihan == 1) {
            cetakPolaXDoWhile(tinggi);
        } else if (pilihan == 2) {
            cetakPolaXWhile(tinggi);
        } else if (pilihan == 3) {
            cetakPolaXFor(tinggi);
        }
    }

    void cetakPolaXDoWhile(int tinggi) {
        System.out.println("\nJenis Perulangan DoWhile");
        int baris = 0;

        do {
            int kolom = 0;

            do {
                if (kolom == baris || kolom == tinggi - baris + 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                kolom++;
            } while (kolom <= tinggi);

            System.out.println();
            baris++;
        } while (baris <= tinggi);
    }

    void cetakPolaXWhile(int tinggi) {
        System.out.println("\nJenis Perulangan While");
        int baris = 0;
        while (baris <= tinggi) {
            int kolom = 0;
            while (kolom <= tinggi) {
                if (kolom == baris || baris + kolom == tinggi + 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
                kolom++;
            }
            System.out.println();
            baris++;
        }
    }

    void cetakPolaXFor(int tinggi) {
        System.out.println("\nJenis Perulangan For");
        for (int baris = 0; baris <= tinggi; baris++) {
            for (int kolom = 0; kolom <= tinggi; kolom++) {
                if (kolom == baris || kolom == tinggi - baris + 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
