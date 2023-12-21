package Tugas.Tugas_Alpro_9.TesAkhir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class CollectionsComparable {

    public static void main(String[] args) {
        CollectionsComparable cs = new CollectionsComparable();
        ArrayList<tesAkhir> arr = new ArrayList<>();
        Scanner inp = new Scanner(System.in);
        int pilih;

        System.out.print("Masukkan Jumlah Data Yang Ingin Dimasukkan : ");
        int jumlahData = inp.nextInt();
        inp.nextLine(); // Membersihkan karakter newline

        for (int i = 0; i < jumlahData; i++) {
            System.out.println();
            System.out.println("Masukkan Data ke-" + (i + 1));
            System.out.print("Masukkan Nama : ");
            String nama = inp.next();
            inp.nextLine();
            System.out.print("Masukkan NIM : ");
            int nim = inp.nextInt();
            inp.nextLine();
            System.out.print("Masukkan Program Studi : ");
            String program_studi = inp.next();
            inp.nextLine();
            System.out.print("Masukkan Alamat : ");
            String alamat = inp.next();
            inp.nextLine();
            arr.add(new tesAkhir(nim, nama, program_studi, alamat));
        }
        System.out.println();
        cs.traversal(arr, "Original data");

        System.out.println("Pilih Opsi Pengurutan!");
        System.out.println("1. Berdasarkan Nama");
        System.out.println("2. Berdasarkan NIM");
        System.out.print("Pilihan Anda [1/2] : ");
        pilih = inp.nextInt();
        switch (pilih) {
            case 1:
                System.out.println();
                System.out.println("Sort Berdasarkan Nama");
                Collections.sort(arr, new MyObjectComparatorByNama());
                cs.traversal(arr, "Ascending");
                Collections.reverse(arr);
                cs.traversal(arr, "Descending");
                break;
            case 2:
                System.out.println();
                System.out.println("Sort Berdasarkan NIM");
                Collections.sort(arr, new MyObjectComparatorByNim());
                cs.traversal(arr, "Ascending");
                Collections.reverse(arr);
                cs.traversal(arr, "Descending");
                break;
            default:
                System.out.println("Pilihan Anda Invalid!");
                break;
        }
    }

    void traversal(ArrayList<tesAkhir> data, String jenis) {
        System.out.println("Data Mahasiswa sort " + jenis + " : ");
        for (int a = 0; a < data.size(); a++) {
            System.out.print((a + 1) + ". " + data.get(a) + " ");
            System.out.println();
        }
        System.out.println();
    }
}

class MyObjectComparatorByNama implements Comparator<tesAkhir> {
    @Override
    // byDouble
    // public int compare(tesAkhir obj1, tesAkhir obj2) {
    // return Double.compare(obj1.getTotal(), obj2.getTotal());
    // }

    // byString
    public int compare(tesAkhir obj1, tesAkhir obj2) {
        return obj1.getNama().compareTo(obj2.getNama());
    }

    // public int compare(tesAkhir obj1, tesAkhir obj2) {
    // return obj1.getNoTransaksi().compareTo(obj2.getNoTransaksi());
    // }
}

class MyObjectComparatorByNim implements Comparator<tesAkhir> {
    @Override
    // byDouble
    // public int compare(tesAkhir obj1, tesAkhir obj2) {
    // return Double.compare(obj1.getTotal(), obj2.getTotal());
    // }

    // byString
    public int compare(tesAkhir obj1, tesAkhir obj2) {
        return obj1.getNim().compareTo(obj2.getNim());
    }

    // public int compare(tesAkhir obj1, tesAkhir obj2) {
    // return obj1.getNoTransaksi().compareTo(obj2.getNoTransaksi());
    // }
}

public class tesAkhir {
    Integer nim;
    String nama, program_studi, alamat;

    public tesAkhir(Integer nim, String nama, String program_studi, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.program_studi = program_studi;
        this.alamat = alamat;
    }

    Integer getNim() {
        return nim;
    }

    String getNama() {
        return nama;
    }

    String getProgramStudi() {
        return program_studi;
    }

    String getAlamat() {
        return alamat;
    }

    public String toString() {
        return nama + " " + nim + " " + program_studi + " " + alamat;
    }
}
