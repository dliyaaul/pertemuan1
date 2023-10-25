package Tugas.Tugas_Alpro_4;

import java.util.Scanner;

public class Ritel2 {
    static String kode, Action;
    static String nama;
    static int stock;
    static int hargaJual;
    static int tmbh, Pilihan, Menu;
    static private boolean MembuatBarang;
    static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Selamat Datang di Aplikasi Ritel 2");
        System.out.println("<---Masukkan Pilihan di Menu Utama--->");
        System.out.println("1. Menginput Barang Baru");
        System.out.println("2. Menjual Barang");
        System.out.println("3. Menambah Barang");
        System.out.println("4. Melihat Data Barang");
        System.out.print("Masukkan pilihan anda [1-4] : ");
        Menu = inp.nextInt();

        switch (Menu) {
            case 1:
                MembuatBarang();
                break;
            case 2:
                System.out.println("\nJika Anda Ingin Menjual Barang");
                System.out.println("Harus Menginput Barang Terlebih Dahulu!");
                System.out.print("\nIngin Menginput Barang Sekarang? [y/n] : ");
                Action = inp.next();
                MembuatBarang = Action.equals("y");
                if (MembuatBarang == true) {
                    MembuatBarang();
                } else {
                    System.out.println("Keluar Aplikasi...");
                }
                break;
            case 3:
                System.out.println("\nJika Anda Ingin Menambah Barang");
                System.out.println("Harus Menginput Barang Terlebih Dahulu!");
                System.out.print("\nIngin Menginput Barang Sekarang? [y/n] : ");
                Action = inp.next();
                MembuatBarang = Action.equals("y");
                if (MembuatBarang == true) {
                    MembuatBarang();
                } else {
                    System.out.println("Keluar Aplikasi...");
                }
                break;
            case 4:
                System.out.println("\nJika Anda Ingin Melihat Data Barang");
                System.out.println("Harus Menginput Barang Terlebih Dahulu!");
                System.out.print("\nIngin Menginput Barang Sekarang? [y/n] : ");
                Action = inp.next();
                MembuatBarang = Action.equals("y");
                if (MembuatBarang == true) {
                    MembuatBarang();
                } else {
                    System.out.println("Keluar Aplikasi...");
                }
                break;
            default:
                System.out.println("Kode Tidak Valid!");
        }
    }

    static void menu() {
        System.out.println("\n<-----Menu Selanjutnya----->");
        System.out.println("1. Menginput Barang Baru");
        System.out.println("2. Menjual Barang");
        System.out.println("3. Menambah Barang");
        System.out.println("4. Melihat Data Barang");
        System.out.println("5. Keluar");
        System.out.print("Masukkan pilihan anda [1-5] : ");
        Pilihan = inp.nextInt();

        switch (Pilihan) {
            case 1:
                MembuatBarang();
                break;
            case 2:
                MenjualBarang(24);
                break;
            case 3:
                MenambahBarang(tmbh);
                break;
            case 4:
                MelihatBarang();
                break;
            case 5:
                System.out.println("Keluar Aplikasi...");
                break;
            default:
                System.out.println("Kode Tidak Valid!");
                break;
        }
    }

    static void MembuatBarang() {
        System.out.println("\n<-----Menu Input Data Barang----->");
        System.out.print("Silahkan Masukkan Nama Barang : ");
        nama = inp.next();
        System.out.print("Silahkan Masukkan Kode Barang : ");
        kode = inp.next();
        System.out.print("Silahkan Masukkan Stock Awal  : ");
        stock = inp.nextInt();
        System.out.print("Silahkan Masukkan Harga Jual  : ");
        hargaJual = inp.nextInt();
        menu();
    }

    static void MenambahBarang(int tambah) {
        System.out.println("\n<-----Menu Menambah Stock Barang----->");
        System.out.println("Stok awal   : " + stock);
        System.out.println("Penambahan  : " + tambah);
        stock = stock + tambah;
        System.out.println("Stok akhir : " + stock);
        System.out.println("Data telah diubah");
        MelihatBarang();
    }

    static void MenjualBarang(int ubah) {
        System.out.println("\n<-----Menu Menjual Stock Barang----->");
        System.out.println("Stok awal   : " + stock);
        System.out.println("Pengurangan : " + ubah);
        if ((stock - ubah) < 0) {
            System.out.println("Jumlah stock tidak mencukupi");
            System.out.println("Transaksi dibatalkan");
            MelihatBarang();
        } else {
            stock = stock - ubah;
            System.out.println("Stok akhir  : " + stock);
            System.out.println("Data telah diubah");
            MelihatBarang();
        }
    }

    static void MelihatBarang() {
        tmbh = 20;
        System.out.println("\nMenampilkan detil barang");
        System.out.println("Nama : " + nama);
        System.out.println("Kode : " + kode);
        System.out.println("Jumlah Stok : " + stock);
        System.out.println("Harga Jual : " + hargaJual);

        if (stock <= 5) {
            System.out.println("\nBarang sudah hampir habis, segera lakukan penambahan stok");
            MenambahBarang(tmbh);
        } else {
            menu();
        }
    }
}
