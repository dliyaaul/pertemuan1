package Tugas.Tugas_Alpro_4;

import java.util.Scanner;

public class tugas_pendahuluan {
    public static boolean Bilangan(int bil) {
        if (bil % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan Angka : ");
            int a = input.nextInt();

            boolean hasil = Bilangan(a);

            if (hasil) {
                System.out.println("Hasil Bilangan = " + a + " Adalah Bilangan Genap");
            } else {
                System.out.println("Hasil Bilangan = " + a + " Adalah Bilangan Ganjil");
            }
        }
    }
}

/*
 * Pertanyaan Pendahuluan
 * 1. Sebutkan operator relasional yang terdapat dalam Java,
 * 2. Tentukan tipe data operator dan keluaran yang dimungkinakan untuk
 * digunakan dalam pada operator relasinal.
 * 
 * Jawaban
 * 1. Sebutkan operator relasional yang terdapat dalam Java!
 * 
 * ==: Operator ini digunakan untuk memeriksa apakah dua nilai sama.
 * !=: Operator ini digunakan untuk memeriksa apakah dua nilai tidak sama.
 * <: Operator ini digunakan untuk memeriksa apakah nilai sebelah kiri lebih
 * kecil dari nilai sebelah kanan.
 * >: Operator ini digunakan untuk memeriksa apakah nilai sebelah kiri lebih
 * besar dari nilai sebelah kanan.
 * <=: Operator ini digunakan untuk memeriksa apakah nilai sebelah kiri lebih
 * kecil dari atau sama dengan nilai sebelah kanan.
 * >=: Operator ini digunakan untuk memeriksa apakah nilai sebelah kiri lebih
 * besar dari atau sama dengan nilai sebelah kanan.
 * 
 * 2. Operator relasional dalam Java digunakan untuk membandingkan dua nilai,
 * dan hasilnya adalah nilai boolean, yaitu true atau false.
 * Oleh karena itu, tipe data operator dan keluaran yang dimungkinkan untuk
 * digunakan dalam operator relasional adalah sebagai berikut:
 * 
 * A. Tipe Data Operator:
 * Angka (Numerik): Operator relasional dapat digunakan dengan tipe data numerik
 * seperti int, double, float, dan sebagainya.
 * Karakter (Char): Operator relasional juga dapat digunakan dengan tipe data
 * karakter (char).
 * Objek: Anda juga dapat menggunakan operator relasional untuk membandingkan
 * objek dalam Java,
 * asalkan objek tersebut mengimplementasikan antarmuka Comparable atau
 * menggunakan pembanding yang disediakan oleh pengguna.
 * B. Keluaran Operator:
 * Hasil dari operator relasional adalah nilai boolean, yaitu true atau false.
 * Operator relasional akan menghasilkan true jika pernyataan perbandingan benar
 * dan false jika pernyataan perbandingan salah.
 * 
 */
