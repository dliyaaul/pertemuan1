package Tugas.Tugas_Alpro_6.jurnal;

import java.util.Scanner;

class MainPrima {
    public static void main(String[] args) {
        prima prm = new prima();
        prm.blngnPrima();
    }
}

public class prima {
    Scanner inp = new Scanner(System.in);
    int nilai;

    void blngnPrima() {
        System.out.println("Bilangan Prima");
        System.out.print("Masukkan Nilai Batas : ");
        nilai = inp.nextInt();
        daftarPrima(nilai);

    }

    void daftarPrima(int batas) {
        boolean bukti;
        int counter = 1;
        System.out.print("Daftar Nilai Prima : ");
        while (counter <= batas) {
            bukti = cekBilanganPrima(counter);
            if (bukti && counter != 1) {
                System.out.print(counter + " ");
            }
            counter++;
        }
        System.out.println();

    }

    boolean cekBilanganPrima(int bilangan) {
        int counter = 2;
        int cekPrima = 0;
        while (counter <= bilangan) {
            if ((bilangan % counter) == 0) {
                cekPrima++;
            }
            counter++;
        }
        if (cekPrima > 1) {
            return false;
        } else {
            return true;
        }
    }
}
