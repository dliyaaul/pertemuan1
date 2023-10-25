package Tugas.Tugas_Alpro_2;

//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.Scanner;

class RitelRevisi {
    public static void main(String[] args) {
        Barang brg = new Barang();
        brg.inputData();
        brg.viewData();
    }
}

class BarangRevisi {
    String KodeBarang;
    String NamaBarang;
    String Produsen;
    int BeratBersih;
    double HargaBeli;
    double HargaJual;

    // InputStreamReader isr = new InputStreamReader(System.in);
    // BufferedReader input2 = new BufferedReader(isr);

    Scanner input = new Scanner(System.in);

    public void inputData() {
        try {
            System.out.println("Inputan Data Barang ");
            System.out.print("Kode : ");
            KodeBarang = input.nextLine();
            System.out.print("Nama : ");
            NamaBarang = input.nextLine();
            System.out.print("Produsen : ");
            Produsen = input.nextLine();
            System.out.print("Berat Bersih : ");
            BeratBersih = input.nextInt();
            System.out.print("Harga Beli : ");
            HargaBeli = input.nextDouble();
            System.out.print("Harga Jual : ");
            HargaJual = input.nextDouble();
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