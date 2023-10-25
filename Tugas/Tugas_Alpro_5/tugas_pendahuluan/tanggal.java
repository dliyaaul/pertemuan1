package Tugas.Tugas_Alpro_5.tugas_pendahuluan;

import java.util.Scanner;

class tgl {
    public static void main(String[] args) {
        tanggal tnggl = new tanggal();
        tnggl.Tanggal();
    }
}

public class tanggal {
    Scanner input = new Scanner(System.in);

    int tanggal;
    int bulan;
    int tahun;
    int indeksTglLusa, indeksBln, indeksTahun;
    boolean ulang = true;

    public void Tanggal() {
        System.out.print("\nMasukkan tanggal (1-31): ");
        tanggal = input.nextInt();

        System.out.print("Masukkan bulan (1-12): ");
        bulan = input.nextInt();

        System.out.print("Masukkan tahun: ");
        tahun = input.nextInt();

        boolean isTanggalValid = tanggal >= 1 && tanggal <= 31;
        boolean isBulanValid = bulan >= 1 && bulan <= 12;
        boolean isTahunValid = tahun > 0;

        if (isTanggalValid && isBulanValid && isTahunValid) {
            System.out.println("\nSekarang Adalah Tanggal   : " + tanggal + "-" + bulan + "-" + tahun);
            for (int i = 0; i < 1; i++) {
                if (tanggal == 31) {
                    if (bulan == 12) {
                        tahun++;
                        bulan = 1;
                        tanggal = 2;
                    } else {
                        bulan++;
                        tanggal = 2;
                    }
                } else if (tanggal == 28 && bulan == 2
                        && ((tahun % 4 == 0 && tahun % 100 != 0) || (tahun % 400 == 0))) {
                    tanggal++;
                } else if (tanggal == 29 && bulan == 2) {
                    bulan++;
                    tanggal = 1;
                } else if (tanggal == 30 && (bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11)) {
                    bulan++;
                    tanggal = 1;
                } else {
                    tanggal = tanggal + 2;
                }
                System.out.println("Dan Lusa Adalah Tanggal  : " + tanggal + "-" + bulan + "-" + tahun);
            }
        } else {
            System.out.println("\nInput tanggal, bulan, atau tahun tidak valid.");
        }

        ulang();
    }

    public void ulang() {
        System.out.print("\nApakah Ingin Mengulang (y/n)? : ");
        String pilihan = input.next();
        ulang = pilihan.equals("y");
        if (ulang == true) {
            Tanggal();
        } else {
            System.exit(0);
        }
    }
}
