package Tugas.Tugas_Alpro_7.praktik;

import java.util.Scanner;

class runFaktorial {
    public static void main(String[] args) {
        nilaiFaktorial ftr = new nilaiFaktorial();
        ftr.input();
    }
}

public class nilaiFaktorial {
    Scanner scanner = new Scanner(System.in);

    void input() {
        System.out.print("Masukkan sebuah nilai: ");
        int batasAtas = scanner.nextInt();

        int sigma = hitungDanJumlahkanFaktorial(batasAtas);

        System.out.println("Sigma dari faktorial adalah: " + sigma);

        scanner.close();
    }

    int hitungDanJumlahkanFaktorial(int batasAtas) {
        int sigma = 0;

        for (int i = batasAtas; i >= 1; i--) {
            int faktorial = hitungFaktorial(i);
            sigma += faktorial;

            System.out.print(faktorial);

            if (i > 1) {
                System.out.print(" + ");
            }
        }

        System.out.println();
        return sigma;
    }

    int hitungFaktorial(int nilai) {
        int faktorial = 1;
        for (int i = 1; i <= nilai; i++) {
            faktorial *= i;
        }
        return faktorial;
    }
}
