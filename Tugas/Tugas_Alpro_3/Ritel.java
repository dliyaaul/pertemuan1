package Tugas.Tugas_Alpro_3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class Ritel {
    public static void main(String[] args) {
        Barang brg1 = new Barang();
        Barang brg2 = new Barang();
        brg1.inputData();
        brg2.inputData();

        brg1.jualStock(10);
        brg2.jualStock(5);

        brg1.hitungPembayaran(10);
        brg2.hitungPembayaran(5);

        brg1.viewData(10);
        brg2.viewData(5);

        brg1.tambahStock(20);
        brg2.tambahStock(20);
    }
}

class Barang {
    String kode;
    String nama;
    int stock;
    int hargaJual;
    int hargaBayar;
    int hargaTotal;
    int hargaKembalian;

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(isr);
    Scanner inp = new Scanner(System.in);

    public void inputData() {
        try {
            String temp = "";
            System.out.println("Menu Input Data Barang ");
            System.out.print("Kode : ");
            kode = input.readLine();
            System.out.print("Nama : ");
            nama = input.readLine();
            System.out.print("Stock Awal : ");
            temp = input.readLine();
            stock = Integer.parseInt(temp);
            System.out.print("Harga Jual : ");
            temp = input.readLine();
            hargaJual = Integer.parseInt(temp);
            pressEnter();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void viewData(int ubah) {
        System.out.println("Menampilkan detil barang");
        System.out.println("Nama : " + nama);
        System.out.println("Kode : " + kode);
        System.out.println("Jumlah Sisa Stok : " + stock);
        System.out.println("Jumlah Beli : " + ubah + " stok");
        System.out.println("Harga Jual per Stok : " + hargaJual);
        System.out.println("Harga Total : " + hargaTotal);
        System.out.println("Harga Bayar : " + hargaBayar);
        this.hargaKembalian = this.hargaBayar - hargaTotal;
        System.out.println("Kembalian : " + hargaKembalian);
        pressEnter();
    }

    public void jualStock(int ubah) {
        System.out.println("Menu Penjualan Barang");
        System.out.println("Nama Barang : " + nama);
        System.out.println("Stok awal : " + stock);
        this.stock = this.stock - ubah;
        System.out.println("Pengurangan : " + ubah);
        System.out.println("Stok akhir : " + stock);
        System.out.println("Data telah diubah");
        pressEnter();
    }

    public void tambahStock(int tambah) {
        System.out.println("Menu Penambahan Barang");
        System.out.println("Nama Barang : " + nama);
        System.out.println("Sisa Stok : " + stock);
        System.out.println("Tambah Stok : ");
        tambah = inp.nextInt();
        this.stock = this.stock + tambah;
        System.out.println("Total Stok : " + stock);
        System.out.println("Data telah diubah");
        pressEnter();
    }

    public void hitungPembayaran(int ubah) {
        System.out.println("Pembayaran Data Barang");
        System.out.println("Jumlah Beli : " + ubah);
        System.out.println("Harga Per Stok : " + hargaJual);
        this.hargaTotal = this.hargaJual * ubah;
        System.out.println("Harga Total : " + hargaTotal);
        System.out.print("Harga Bayar : ");
        hargaBayar = inp.nextInt();
        pressEnter();
    }

    void pressEnter() {
        try {
            System.out.println("Tekan enter untuk melanjutkan");
            input.readLine();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
