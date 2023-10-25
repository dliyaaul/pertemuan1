package Tugas.Tugas_Alpro_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class MatkulRev {
    public static void main(String[] xyz) {
        NilaiMkRev nmkr = new NilaiMkRev();
        nmkr.inputData();
        nmkr.viewNilai();
    }
}

class NilaiMkRev {
    private String nim;
    private int a1;
    private int a2;
    private int a3;
    private int tugas;
    private int praktek;
    private double nilai;
    private double nilaiAkhir;

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

        this.nilai = (0.15 * a1);
        this.nilaiAkhir = (nilai + (0.15 * a2) + (0.1 * a3) + (0.2 * tugas) + (0.4 * praktek));
    }

    public void viewNilai() {
        System.out.println("\n\n<----Nilai Assesment---->");
        System.out.println("NIM             : " + this.nim);
        System.out.println("Assesment 1     : " + this.a1);
        System.out.println("Assesment 2     : " + this.a2);
        System.out.println("Assesment 3     : " + this.a3);
        System.out.println("Tugas           : " + this.tugas);
        System.out.println("Praktikum       : " + this.praktek);
        System.out.println("Nilai AKhir     : " + this.nilaiAkhir);
    }
}
