package Tugas.Tugas_Alpro_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Ritel {
    public static void main(String[] args) {
        Barang brg = new Barang();
        brg.inputData();
        brg.viewData();
    }
}

class Barang {
    String KodeBarang;
    String NamaBarang;
    String Produsen;
    int BeratBersih;
    int HargaBeli;
    int HargaJual;

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(isr);

    public void inputData() {
        try {
            String temp = "";
            System.out.println("Inputan Data Barang ");
            System.out.print("Kode : ");
            KodeBarang = input.readLine();
            System.out.print("Nama : ");
            NamaBarang = input.readLine();
            System.out.print("Produsen : ");
            Produsen = input.readLine();
            System.out.print("Berat Bersih : ");
            temp = input.readLine();
            BeratBersih = Integer.parseInt(temp);
            System.out.print("Harga Beli : ");
            HargaBeli = Integer.parseInt(input.readLine());
            System.out.print("Harga Jual : ");
            HargaJual = Integer.parseInt(input.readLine());
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void viewData() {
        System.out.println("<----Menampilkan detail barang---->");
        System.out.println("Nama : " + NamaBarang);
        System.out.println("Kode : " + KodeBarang);
        System.out.println("Produsen : " + Produsen);
        System.out.println("Berat Bersih : " + BeratBersih);
        System.out.println("Harga Beli : " + HargaBeli);
        System.out.println("Harga Jual : " + HargaJual);
    }

}