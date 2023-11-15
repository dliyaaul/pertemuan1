package Tugas.Tugas_Alpro_6.jurnal;

import java.util.Scanner;

class MainDeret {
    public static void main(String[] args) {
        deret_nilai drt = new deret_nilai();
        drt.EksekusiMenu();
    }
}

public class deret_nilai {
    int a = 0;
    Scanner inp = new Scanner(System.in);

    void menu() {
        System.out.println("\nAplikasi Deret Nilai");
        System.out.println("Menu Utama");
        System.out.println("1. Hitung Penjumlahan");
        System.out.println("2. Keluar");
        System.out.print("Masukkan pilihan anda [1-2] : ");
    }

    void EksekusiMenu() {
        int pilihan = 0;
        while (pilihan != 2) {
            menu();
            pilihan = inp.nextInt();
            switch (pilihan) {
                case 1:
                    penjumlahan();
                    break;
                case 2:
                    System.out.println("Keluar dari aplikasi...");
                    inp.close();
                    break;
                default:
                    System.out.println("Inputan Yang Anda Masukkan Tidak Valid!");
                    break;
            }
        }
    }

    void penjumlahan() {
        int batas, sum = 0;
        System.out.print("\nMasukkan nilai batas atas : ");
        batas = inp.nextInt();

        for (int a = 1; a <= batas; a++) {
            if ((a % 2) == 0) {
                sum = sum + a;
                if ((a == batas) || ((a + 1) == batas)) {
                    System.out.print(a);
                } else {
                    System.out.print(a + " + ");
                }
            } else if ((a % 2) != 0) {
                System.out.print("");
            }
        }
        System.out.println(" = " + sum);
    }

    public void ulang() {
        System.out.print("\nIngin Kembali ke Menu (y/n)? ");
        String pilihan = inp.next();
        boolean ulang = pilihan.equals("y");
        if (ulang == true) {
            EksekusiMenu();
        } else {
            System.exit(0);
        }
    }
}
