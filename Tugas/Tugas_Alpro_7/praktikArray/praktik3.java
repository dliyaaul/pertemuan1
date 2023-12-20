package Tugas.Tugas_Alpro_7.praktikArray;

import java.util.ArrayList;
import java.util.Random;

class MainPraktik3 {
    public static void main(String[] args) {
        praktik3 prtk = new praktik3();
        prtk.arrayListInteger();
        prtk.ViewArrayList();
    }
}

public class praktik3 {
    ArrayList<Integer> arrListInt = new ArrayList<Integer>();
    // ArrayList<String> arrListStr= new ArrList<String>();

    // . Data inputan dalam bentuk Kelas Entitas (jika kelas Mahasiswa telah
    // dibangun)
    // ArrayList<Mahasiswa> arrMahasiswa = new ArrList<Mahasiswa>();
    Random getRandom = new Random();

    void arrayListInteger() {
        int jml = 0;
        while (jml < 100) {
            System.out.print("No " + (jml + 1) + ". : ");
            int inputan = getRandom.nextInt(101);
            arrListInt.add(inputan); // Penambahan data ke ArrayList
            jml++;
        }
    }

    void ViewArrayList() {
        int a = 0;
        int arrMax = arrListInt.size();
        while (a < arrMax) {
            // Mengambil nilai dari ArrayList pada index ke-a
            int nilai = arrListInt.get(a);
            System.out.println("No " + (a + 1) + ". " + nilai);
            a++;
        }
    }
}
