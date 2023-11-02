package Tugas.pra_uts;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        produk prdk = new produk();
        prdk.prdk();
    }
}

public class produk {
    Scanner scn = new Scanner(System.in);
    String namaPrdk, kodePrdk;
    double hargaUnit, discount, totalDiscount, jumlah, totalHarga, totalBayar;
    boolean ulang;

    public void prdk() {
        System.out.println("\n<-------Selamat Datang di PT. Java Jaya------->");
        System.out.println("\nSilahkan Pilih Kode Produk yang Ingin Anda Beli");
        System.out.println("======================================================");
        System.out.println("|| Kode Produk || || Nama Produk  || || Harga/Unit  ||");
        System.out.println("===================================================");
        System.out.println("||      A      || ||   Cupboard   || || Rp. 250.000 ||");
        System.out.println("||      B      || ||Computer Desk || || Rp. 200.000 ||");
        System.out.println("||      C      || ||  Study Desk  || || Rp. 150.000 ||");
        System.out.println("======================================================");
        System.out.print("\nPilih Kode Produk         : ");
        kodePrdk = scn.next();
        System.out.print("Masukkan Jumlah (Max 30)  : ");
        jumlah = scn.nextDouble();
        if (jumlah > 30) {
            System.out.println("\nJumlah Tidak Boleh Lebih Dari 30");
        } else {
            switch (kodePrdk) {
                case "A":
                    namaPrdk = "Cupboard";
                    hargaUnit = 250000;
                    discount = 5.0;
                    totalHarga = jumlah * hargaUnit;
                    totalDiscount = 0.05 * totalHarga;
                    totalBayar = totalHarga - totalDiscount;
                    System.out.println("\nPembelian Furnitur di PT. Java Jaya");
                    System.out.println("kode Produk     : " + kodePrdk);
                    System.out.println("Nama Produk     : " + namaPrdk);
                    System.out.println("Harga Tiap Unit : " + hargaUnit);
                    System.out.println("Jumlah Beli     : " + jumlah);
                    System.out.println("Total Harga     : " + totalHarga);
                    System.out.println("Besar Diskon    : " + discount + " persen");
                    System.out.println("Total Diskon    : " + totalDiscount);
                    System.out.println("Total Bayar     : " + totalBayar);
                    break;
                case "B":
                    namaPrdk = "Computer Desk";
                    hargaUnit = 200000;
                    discount = 3.0;
                    totalHarga = jumlah * hargaUnit;
                    totalDiscount = 0.03 * totalHarga;
                    totalBayar = totalHarga - totalDiscount;
                    System.out.println("\nPembelian Furnitur di PT. Java Jaya");
                    System.out.println("kode Produk     : " + kodePrdk);
                    System.out.println("Nama Produk     : " + namaPrdk);
                    System.out.println("Harga Tiap Unit : " + hargaUnit);
                    System.out.println("Jumlah Beli     : " + jumlah);
                    System.out.println("Total Harga     : " + totalHarga);
                    System.out.println("Besar Diskon    : " + discount + " persen");
                    System.out.println("Total Diskon    : " + totalDiscount);
                    System.out.println("Total Bayar     : " + totalBayar);
                    break;
                case "C":
                    namaPrdk = "Study Desk";
                    hargaUnit = 150000;
                    discount = 2.0;
                    totalHarga = jumlah * hargaUnit;
                    totalDiscount = 0.02 * totalHarga;
                    totalBayar = totalHarga - totalDiscount;
                    System.out.println("\nPembelian Furnitur di PT. Java Jaya");
                    System.out.println("kode Produk     : " + kodePrdk);
                    System.out.println("Nama Produk     : " + namaPrdk);
                    System.out.println("Harga Tiap Unit : " + hargaUnit);
                    System.out.println("Jumlah Beli     : " + jumlah);
                    System.out.println("Total Harga     : " + totalHarga);
                    System.out.println("Besar Diskon    : " + discount + " persen");
                    System.out.println("Total Diskon    : " + totalDiscount);
                    System.out.println("Total Bayar     : " + totalBayar);
                    break;

                default:
                    System.out.println("\nKode Produk Yang Anda Masukkan Salah");
                    break;
            }
        }

        ulang();
    }

    public void ulang() {
        System.out.print("\nApakah Ingin Mengulang (y/n)? ");
        String pilihan = scn.next();
        ulang = pilihan.equals("y");
        if (ulang == true) {
            prdk();
        } else {
            System.exit(0);
        }
    }
}
