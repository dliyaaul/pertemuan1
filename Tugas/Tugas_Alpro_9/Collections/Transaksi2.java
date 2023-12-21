package Tugas.Tugas_Alpro_9.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Soal 2 – Collections Kelas Comparator
class CollectionsComparator {
    public static void main(String[] args) {
        CollectionsComparator cs = new CollectionsComparator();
        ArrayList<Transaksi2> arr = new ArrayList<>();
        arr.add(new Transaksi2(1, 752000.0, "2023-12-13"));
        arr.add(new Transaksi2(2, 647000.0, "2023-12-14"));
        arr.add(new Transaksi2(3, 872000.0, "2023-12-14"));
        arr.add(new Transaksi2(4, 90000.0, "2023-12-15"));
        arr.add(new Transaksi2(5, 123450.0, "2023-12-16"));
        cs.traversal(arr, "Original data");

        Collections.sort(arr, new MyObjectComparatorByTotal());
        cs.traversal(arr, "Ascending");

        Collections.reverse(arr);
        cs.traversal(arr, "Descending");
    }

    void traversal(ArrayList<Transaksi2> data, String jenis) {
        System.out.println("Transaksi 2 - Collections Kelas Comparator");
        System.out.println("Data Transaksi sort " + jenis + " : ");
        for (int a = 0; a < data.size(); a++) {
            System.out.print(data.get(a) + " ");
            System.out.println();
        }
        System.out.println();
    }
}

class MyObjectComparatorByTotal implements Comparator<Transaksi2> {
    @Override
    // byDouble
    public int compare(Transaksi2 obj1, Transaksi2 obj2) {
        return Double.compare(obj1.getTotal(), obj2.getTotal());
    }

    // byString
    // public int compare(Transaksi2 obj1, Transaksi2 obj2) {
    // return obj1.getTanggal().compareTo(obj2.getTanggal());
    // }

    // public int compare(Transaksi2 obj1, Transaksi2 obj2) {
    // return obj1.getNoTransaksi().compareTo(obj2.getNoTransaksi());
    // }
}

public class Transaksi2 {
    Integer noTransaksi;
    Double total;
    String tanggal;

    public Transaksi2(Integer noTransaksi, Double total, String tanggal) {
        this.noTransaksi = noTransaksi;
        this.total = total;
        this.tanggal = tanggal;
    }

    Integer getNoTransaksi() {
        return noTransaksi;
    }

    String getTanggal() {
        return tanggal;
    }

    Double getTotal() {
        return total;
    }

    public String toString() {
        return noTransaksi + " " + tanggal + " " + total;
    }
}
