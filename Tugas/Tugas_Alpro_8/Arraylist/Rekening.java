package Tugas.Tugas_Alpro_8.Arraylist;

// Source code is decompiled from a .class file using FernFlower decompiler.
public class Rekening {
    private int no;
    private String nama;
    private double saldo;

    public Rekening(int no, String nama, double saldo) {
        this.no = no;
        this.nama = nama;
        this.saldo = saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNo() {
        return this.no;
    }

    public String getNama() {
        return this.nama;
    }
}
