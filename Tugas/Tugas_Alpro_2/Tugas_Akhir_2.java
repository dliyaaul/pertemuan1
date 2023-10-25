package Tugas.Tugas_Alpro_2;

import java.util.Scanner;

class Laundry {
    public static void main(String[] args) {
        dataPelanggan dpl = new dataPelanggan();
        dataTransaksi inp = new dataTransaksi();
        dpl.daftar();
        inp.catat();
        dpl.profile();
        inp.printStruk();
    }
}

class dataPelanggan {
    String namaLengkap;
    String alamat;
    String email;
    String jk;
    int noHp;

    Scanner inputDataPelanggan = new Scanner(System.in);

    public void daftar() {
        try {
            System.out.println("<----Inputkan Data Pelanggan---->");
            System.out.print("Nama Lengkap : ");
            namaLengkap = inputDataPelanggan.nextLine();
            System.out.print("Alamat : ");
            alamat = inputDataPelanggan.nextLine();
            System.out.print("Jenis Kelamin : ");
            jk = inputDataPelanggan.nextLine();
            System.out.print("Email : ");
            email = inputDataPelanggan.nextLine();
            System.out.print("No Hp : ");
            noHp = inputDataPelanggan.nextInt();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void profile() {
        System.out.println();
        System.out.println("<----Menampilkan Detail Pelanggan---->");
        System.out.println("Nama Lengkap : " + namaLengkap);
        System.out.println("No Hp : " + noHp);
        System.out.println("Alamat : " + alamat);
        System.out.println("Email : " + email);
        System.out.println("Jenis Kelamin : " + jk);
    }
}

class dataTransaksi {
    int beratLaundry;
    int harga;
    int totalHarga;
    String jamTanggalLaundry;
    String jamTanggalAmbil;

    Scanner inputDataTransaksi = new Scanner(System.in);

    public void catat() {
        try {
            System.out.println();
            System.out.println("<----Inputkan Data Transaksi---->");
            System.out.print("Berat Laundry (kg): ");
            beratLaundry = inputDataTransaksi.nextInt();
            System.out.print("Harga / kg: ");
            harga = inputDataTransaksi.nextInt();
            System.out.print("Jam Tanggal Ambil : ");
            jamTanggalAmbil = inputDataTransaksi.nextLine();
            System.out.print("Jam Tanggal Laundry : ");
            jamTanggalLaundry = inputDataTransaksi.nextLine();
        } catch (Exception e) {
            System.out.println(e);
        }

        totalHarga = beratLaundry * harga;
    }

    public void printStruk() {
        System.out.println();
        System.out.println("<----Menampilkan Detail Transaksi---->");
        System.out.println("Berat Laundry : " + beratLaundry);
        System.out.println("Harga : " + harga);
        System.out.println("Jam Tanggal Laundry :  " + jamTanggalLaundry);
        System.out.println("Jam Tanggal Ambil : " + jamTanggalAmbil);
        System.out.println("Total Harga : " + totalHarga);
    }
}
