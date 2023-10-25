/*
 * 1. Apakah yang dimaksud dengan :
 * a. Parameter formal
 * b. Parameter aktual
 * Berikan contoh minimal 3 implementasi dari kedua jenis parameter diatas
 * 
 * Jawaban
 * a. Parameter formal adalah parameter yang didefinisikan dalam deklarasi
 * sebuah fungsi atau prosedur sebagai bagian dari kerangka kerja atau template.
 * Contoh : function hitung(int lebar, int tinggi), float tambah(float a, float
 * b), public void hitung_segitiga(int panjang, int tinggi). parameter didalam
 * kurung adalah parameter formal.
 * 
 * b. Parameter aktual adalah nilai yang digunakan untuk memanggil fungsi atau
 * prosedur tersebut.
 * Contoh : double luas = Calculator.hitung(lebar:20, tinggi:10);, double
 * penjumlahan = Calculator.tambah(a:10, b:20);, double rumus_segitiga =
 * Calculator.hitung_segitiga(panjang:20, tinggi:10);
 * 
 * 
 * 2. Buatlah sebuah aplikasi yang dapat digunakan untuk menghitung rumus fungsi
 * berikut ini
 * Nilai F(x, y) untuk F(x, y) = xy +2x + 2y + 6
 * Gunakan Method untuk perhitungan fungsi diatas
 */
package Tugas.Tugas_Alpro_3;

public class tugas_pendahuluan {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        int hasil = hitungFungsi(x, y);
        System.out.println("Hasil F(" + x + ", " + y + ") = " + hasil);
    }

    public static int hitungFungsi(int x, int y) {
        return x * y + 2 * x + 2 * y + 6;
    }
}
