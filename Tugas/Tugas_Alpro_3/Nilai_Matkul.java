package Tugas.Tugas_Alpro_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Matkul {
    public static void main(String[] xyz) {
        NilaiMk nmk = new NilaiMk();
        nmk.inputData();
        nmk.viewNilai();
    }
}

class NilaiMk {
    private String nim;
    private int a1;
    private int a2;
    private int a3;
    private int tugas;
    private int praktek;
    private double nilai;

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader inp = new BufferedReader(isr);

    public void inputData() {
        System.out.println("Nilai Algoritma dan Pemrograman");

        try {
            System.out.print("NIM               : ");
            this.nim = inp.readLine();
            System.out.print("Nilai Assesment 1 : ");
            this.a1 = Integer.parseInt(inp.readLine());
            System.out.print("Nilai Assesment 2 : ");
            this.a2 = Integer.parseInt(inp.readLine());
            System.out.print("Nilai Assesment 3 : ");
            this.a3 = Integer.parseInt(inp.readLine());
            System.out.print("Nilai Tugas       : ");
            this.tugas = Integer.parseInt(inp.readLine());
            System.out.print("Nilai Praktikum   : ");
            this.praktek = Integer.parseInt(inp.readLine());

        } catch (Exception e) {
            System.out.println("Error : " + e);
        }

        hitungNilai(this.a1, this.a2, this.a3, this.tugas, this.praktek);
    }

    public void hitungNilai(int a1, int a2, int a3, int tugas, int praktek) {
        this.nilai = (0.15 * a1);
        this.nilai = nilai + (0.15 * a2);
        this.nilai = nilai + (0.1 * a3);
        this.nilai = nilai + (0.2 * tugas);
        this.nilai = nilai + (0.4 * praktek);
    }

    public void viewNilai() {
        System.out.println("\n\n<----Nilai Assesment---->");
        System.out.println("NIM             : " + this.nim);
        System.out.println("Assesment 1     : " + this.a1);
        System.out.println("Assesment 2     : " + this.a2);
        System.out.println("Assesment 3     : " + this.a3);
        System.out.println("Tugas           : " + this.tugas);
        System.out.println("Praktikum       : " + this.praktek);
        System.out.println("Nilai AKhir     : " + this.nilai);
    }
}
