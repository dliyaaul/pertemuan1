package Tugas.Tugas_Alpro_6.jurnal;

import java.util.Scanner;

/**
 * Innerganjil_genap
 */
class DeretBilangan {
    public static void main(String[] args) {
        ganjil_genap gnp = new ganjil_genap();
        gnp.gnp();
    }
}

public class ganjil_genap {
    Scanner inp = new Scanner(System.in);
    int batas;

    void gnp() {
        System.out.println("Deret nilai");
        System.out.print("Masukkan Batas : ");
        batas = inp.nextInt();
        daftarGenap(batas);

    }

    void daftarGenap(int batas) {
        int counter = 1;
        System.out.print("Daftar Nilai Genap : ");
        while (counter <= batas) {
            if ((counter % 2) == 0) {
                System.out.print(counter + " ");
            }
            counter++;
        }
    }
}
