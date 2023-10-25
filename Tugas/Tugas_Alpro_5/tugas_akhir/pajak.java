package Tugas.Tugas_Alpro_5.tugas_akhir;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        pajak pjk = new pajak();
        pjk.Pajak();
    }
}

public class pajak {
    Scanner pjk = new Scanner(System.in);
    int pajak;
    String tarif1 = "5%";
    String tarif2 = "15%";
    String tarif3 = "25%";
    String tarif4 = "30%";
    String tarif5 = "35%";
    int pnghsln = 60000000;
    long Pnghsln4 = 5000000000L;
    long penghasilan;
    boolean ulang;

    public void Pajak() {
        System.out.print("\nMasukkan Penghasilan Anda / Tahun = ");
        penghasilan = pjk.nextLong();

        if (penghasilan == 60000000) {
            double total = pnghsln * 0.05;
            System.out.println("\n<-----Tarif Pajak----->");
            System.out.println(penghasilan + " * " + tarif1 + " : " + total);
            System.out.println("60 - 250 Jt     : " + tarif2);
            System.out.println("250 - 500 Jt    : " + tarif3);
            System.out.println("500 Jt - 5M     : " + tarif4);
            System.out.println("Lebih Dari 5M   : " + tarif5);
        } else if ((penghasilan > 60000000) && penghasilan <= 250000000) {
            System.out.println("Penghasilan : " + penghasilan);
            long pnghsln2 = penghasilan - pnghsln;
            double total = pnghsln * 0.05;
            double total2 = pnghsln2 * 0.15;
            long totalLong = (long) total;
            long totalLong2 = (long) total2;
            System.out.println("\n<-----Tarif Pajak----->");
            System.out.println(pnghsln + " * " + tarif1 + " : " + totalLong);
            System.out.println(pnghsln2 + " * " + tarif2 + " : " + totalLong2);
        } else if ((penghasilan > 250000000) && penghasilan <= 500000000) {
            System.out.println("Penghasilan : " + penghasilan);
            int pnghsln2 = 250000000 - pnghsln;
            long pnghsln3 = penghasilan - 250000000;
            double total = pnghsln * 0.05;
            double total2 = pnghsln2 * 0.15;
            double total3 = pnghsln3 * 0.25;
            long totalLong = (long) total;
            long totalLong2 = (long) total2;
            long totalLong3 = (long) total3;
            System.out.println("\n<-----Tarif Pajak----->");
            System.out.println(pnghsln + " * " + tarif1 + " : " + totalLong);
            System.out.println(pnghsln2 + " * " + tarif2 + " : " + totalLong2);
            System.out.println(pnghsln3 + " * " + tarif3 + " : " + totalLong3);
        } else if ((penghasilan > 500000000) && penghasilan <= Pnghsln4) {
            System.out.println("Penghasilan : " + penghasilan);
            int pnghsln2 = 250000000 - pnghsln;
            int pnghsln3 = 500000000 - 250000000;
            long pnghsln4 = penghasilan - 500000000;
            double total = pnghsln * 0.05;
            double total2 = pnghsln2 * 0.15;
            double total3 = pnghsln3 * 0.25;
            double total4 = pnghsln4 * 0.30;
            long totalLong = (long) total;
            long totalLong2 = (long) total2;
            long totalLong3 = (long) total3;
            long totalLong4 = (long) total4;
            System.out.println("\n<-----Tarif Pajak----->");
            System.out.println(pnghsln + " * " + tarif1 + " : " + totalLong);
            System.out.println(pnghsln2 + " * " + tarif2 + " : " + totalLong2);
            System.out.println(pnghsln3 + " * " + tarif3 + " : " + totalLong3);
            System.out.println(pnghsln4 + " * " + tarif4 + " : " + totalLong4);
        } else if (penghasilan > Pnghsln4) {
            System.out.println("Penghasilan : " + penghasilan);
            int pnghsln2 = 250000000 - pnghsln;
            int pnghsln3 = 500000000 - 250000000;
            long pnghsln4 = Pnghsln4 - 500000000;
            long pnghsln5 = penghasilan - Pnghsln4;
            double total = pnghsln * 0.05;
            double total2 = pnghsln2 * 0.15;
            double total3 = pnghsln3 * 0.25;
            double total4 = pnghsln4 * 0.30;
            double total5 = pnghsln5 * 0.35;
            long totalLong = (long) total;
            long totalLong2 = (long) total2;
            long totalLong3 = (long) total3;
            long totalLong4 = (long) total4;
            long totalLong5 = (long) total5;
            System.out.println("\n<-----Tarif Pajak----->");
            System.out.println(pnghsln + " * " + tarif1 + " : " + totalLong);
            System.out.println(pnghsln2 + " * " + tarif2 + " : " + totalLong2);
            System.out.println(pnghsln3 + " * " + tarif3 + " : " + totalLong3);
            System.out.println(pnghsln4 + " * " + tarif4 + " : " + totalLong4);
            System.out.println(pnghsln5 + " * " + tarif5 + " : " + totalLong5);
        } else if (penghasilan < 60000000) {
            System.out.println("Angka Gaji Tidak Boleh Kurang Dari 60jt!");
        } else {
            System.out.println("Angka yang anda masukkan tidak sesuai format!");
        }

        ulang();
    }

    public void ulang() {
        System.out.print("\nApakah Ingin Mengulang (y/n)? ");
        String pilihan = pjk.next();
        ulang = pilihan.equals("y");
        if (ulang == true) {
            Pajak();
        } else {
            System.exit(0);
        }
    }
}
