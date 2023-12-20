package Tugas.Tugas_Alpro_7.tugas_pendahuluan;

import java.util.Scanner;

class stringMain {
    public static void main(String[] args) {
        stringAngka str = new stringAngka();
    }
}

public class stringAngka {
    Scanner inp = new Scanner(System.in);
    String angka;

    void input() {
        System.out.print("Masukkan Angka : ");
        angka = inp.next();

    }

}
