package Tugas.Tugas_Alpro_5.tugas_jurnal;

import java.util.Scanner;

public class pecahan {
    static Scanner pchn = new Scanner(System.in);
    static boolean ulang;

    public static void main(String[] args) {
        int[] pecahan = { 100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100 };
        int uang, sisa;

        System.out.println("\nProgram Menghitung Pecahan Uang");
        System.out.print("Masukkan Jumlah Uang : Rp ");
        uang = pchn.nextInt();
        System.out.println("------------------------------");
        for (int i = 0; i < pecahan.length; i++) {
            if (uang >= 2000) {
                if (uang / pecahan[i] != 0) {
                    System.out.println(uang / pecahan[i] + " Lembar uang Rp" + pecahan[i] + ",-");
                } else if (uang >= 100) {
                    if (uang / pecahan[i] != 0) {
                        System.out.println(uang / pecahan[i] + " Keeping uang Rp" + pecahan[i] + ",-");
                    }
                }
            }
            sisa = uang % pecahan[i];
            uang = sisa;
        }
        if (uang != 0) {
            System.out.println("Sisa Uang : " + uang + ",- tidak mungkin dipecah, Ikhlaskan saja. :)");
        }
        ulang();
    }

    public static void ulang() {
        System.out.print("\nApakah Ingin Mengulang (y/n)? ");
        String pilihan = pchn.next();
        ulang = pilihan.equals("y");
        if (ulang == true) {
            main(null);
        } else {
            System.exit(0);
        }
    }
}
