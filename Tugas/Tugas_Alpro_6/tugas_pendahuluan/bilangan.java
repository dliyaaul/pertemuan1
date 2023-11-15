package Tugas.Tugas_Alpro_6.tugas_pendahuluan;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Mainbilangan
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
                Jarak();
                break;
            case 6:
                System.out.println("Keluar dari aplikasi...");
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
        System.out.println("\nMenghitung Bilangan Faktorial");
        System.out.print("Masukkan Angka : ");
        int angka = inp.nextInt();
        if (angka < 0) {
            System.out.println("Angka Harus Bilangan Bulat Positif!");
        } else if (angka > 20) {
            System.out.println("Angka Maksimal Yaitu 20");
        } else {
            long hasil = 1L;
            for (int i = 1; i <= angka; i++) {
                hasil = hasil * i;
            }
            System.out.println("Faktorial dari " + angka + "! adalah " + hasil);
        }
        ulang();
    }

    void permutasi() {
        System.out.println("\nMenghitung Bilangan Permuatasi");
        System.out.print("Masukkan Pembilang 1 = ");
        int m = inp.nextInt();
        System.out.print("Masukkan Pembilang 2 = ");
        int n = inp.nextInt();
        System.out.println("Permutasi (" + m + "," + n + ")");
        System.out.println("        " + m + "!");
        System.out.println("= ----------------------------");
        System.out.println("      (" + m + "-" + n + ") !");
        int o = 1;
        int p = 1;
        int q, r, s;
        for (q = m; q >= 1; q--) {
            o = o * q;
        }
        r = (m - n);
        for (s = r; s >= 1; s--) {
            p = p * s;
        }
        double hasil = o / p;
        System.out.println(hasil + "/1.0");
        System.out.println("Hasil : " + hasil);
        ulang();
    }

    void Jarak() {
        System.out.print("Jarak antara Budi dan Ani(km): ");
        double jarak = inp.nextDouble();
        System.out.print("Kecepatan mobil Budi (km/jam): ");
        double kBudi = inp.nextDouble();
        System.out.print("Kecepatan mobil Ani (km/jam): ");
        double kAni = inp.nextDouble();

        double jarak2 = jarak * 1000;

        DecimalFormat format1 = new DecimalFormat(" #0.0");

        if (kBudi <= 0 || kAni <= 0 || jarak < 0) {
            System.out.println("Nilai yang dimasukkan tidak valid.");
        } else {
            double jBudi = 0;
            double jAni = jarak2;
            int jam = 0;
            int menit = 0;
            int detik = 0;

            while (jBudi < jAni) {
                double temu = 1;
                detik += temu;

                double kBudi2 = kBudi / 3.6;
                double kAni2 = kAni / 3.6;

                if (detik >= 60) {
                    menit += detik / 60;
                    detik = menit % 60;
                }

                if (menit >= 60) {
                    jam += menit / 60;
                    menit = jam % 60;
                }

                jBudi += kBudi2;
                jAni -= kAni2;

                System.out.println("Waktu: " + jam + " jam " + menit + " menit " + detik + " detik" + "- Jarak Budi: "
                        + format1.format(jBudi) + " m, Jarak Ani: " + format1.format(jAni) + " m");

            }
            System.out.println("jadi waktu Budi dan Ani untuk saling bertemu adalah: " + jam + " jam " + menit
                    + " menit " + detik + " detik");
        }

        ulang();
    }

    public void ulang() {
        System.out.print("\nIngin Kembali ke Menu (y/n)? ");
        String pilihan = inp.next();
        ulang = pilihan.equals("y");
        if (ulang == true) {
            menu();
        } else {
            System.exit(0);
        }
    }
}