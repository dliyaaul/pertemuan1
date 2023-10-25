package Tugas.Tugas_Alpro_4;

import java.util.Scanner;

public class Nilai_Matkul1 {
    private String nim;
    private int a1;
    private int a2;
    private int a3;
    private int tugas;
    private int prakt;
    private double nilai;
    private char index;
    private double khdrn;
    private double khdrnPoin;
    Scanner inp = new Scanner(System.in);

    char cekIndeks(double nilaiAkhir) {
        char idx = '\u0000';

        if ((nilai >= 80) && (khdrn >= 50))
            idx = 'A';
        else if ((nilai >= 60) && (khdrn >= 50))
            idx = 'B';
        else if ((nilai >= 40) && (khdrn >= 50))
            idx = 'C';
        else if ((nilai >= 20) && (khdrn >= 50))
            idx = 'D';
        else if ((nilai >= 10) && (khdrn >= 50))
            idx = 'E';
        else {
            idx = 'F';
        }
        return idx;
    }

    void hitungNilai(int a1, int a2, int a3, int tugas, int prakt, double khdrn, double khdrnPoin) {
        if (khdrn >= 80) {
            this.nilai = (0.15 * a1) + (0.15 * a2) + (0.1 * a3) + (0.2 * tugas) + (0.4 * prakt);
        } else if (khdrn >= 50) {
            khdrnPoin = 0.8;
            this.nilai = (0.15 * a1) + (0.15 * a2) + (0.1 * a3) + (0.2 * tugas) + (0.4 * prakt);
            this.nilai *= khdrnPoin;
        } else {
            khdrnPoin = 0.8;
            this.nilai = (0.15 * a1) + (0.15 * a2) + (0.1 * a3) + (0.2 * tugas) + (0.4 * prakt);
            this.nilai *= khdrnPoin;
        }

        this.index = cekIndeks(this.nilai);
    }

    void inputData() {
        System.out.println("Nilai Algoritma dan Pemrograman");
        System.out.print("NIM : ");
        this.nim = inp.next();
        System.out.print("Nilai assessment 1 : ");
        this.a1 = inp.nextInt();
        System.out.print("Nilai assessment 2 : ");
        this.a2 = inp.nextInt();
        System.out.print("Nilai assessment 3 : ");
        this.a3 = inp.nextInt();
        System.out.print("Nilai tugas : ");
        this.tugas = inp.nextInt();
        System.out.print("Nilai praktikum : ");
        this.prakt = inp.nextInt();
        System.out.print("Jumlah kehadiran(%) : ");
        this.khdrn = inp.nextDouble();

        hitungNilai(this.a1, this.a2, this.a3, this.tugas, this.prakt, this.khdrn, this.khdrnPoin);
    }

    void viewNilai() {
        System.out.println("\n\n\nNilai Assessment");
        System.out.println("NIM             : " + this.nim);
        System.out.println("Assessment 1    : " + this.a1);
        System.out.println("Assessment 2    : " + this.a2);
        System.out.println("Assessment 3    : " + this.a3);
        System.out.println("Tugas           : " + this.tugas);
        System.out.println("Praktikum       : " + this.prakt);
        System.out.println("Nilai Akhir     : " + this.nilai);
        System.out.println("Kehadiran       : " + this.khdrn + " %");
        System.out.println("Indeks nilai    : " + this.index);
    }

    public static void main(String[] xyz) {
        Nilai_Matkul1 nmk = new Nilai_Matkul1();
        nmk.inputData();
        nmk.viewNilai();
    }

}
