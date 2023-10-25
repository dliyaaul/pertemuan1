package Tugas.Tugas_Alpro_5.tugas_pendahuluan;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        nextTgl nt = new nextTgl();
        nt.Tanggal();
    }
}

public class nextTgl {
    Scanner input = new Scanner(System.in);

    String Hari[] = { "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu" };
    String hariInput, hariNext;
    int day = -1;
    int tanggal, nextTgl;
    int bulan;
    int tahun;
    int indeksTglLusa, indeksBln, indeksTahun;
    boolean ulang = true;

    public void Tanggal() {
        System.out.print("\nMasukkan nama hari, Contoh (Senin)    : ");
        hariInput = input.next();

        System.out.print("Masukkan tanggal (1-31)               : ");
        tanggal = input.nextInt();

        System.out.print("Masukkan bulan (1-12)                 : ");
        bulan = input.nextInt();

        System.out.print("Masukkan tahun                        : ");
        tahun = input.nextInt();

        System.out.print("Masukkan next tanggal (1-31)          : ");
        nextTgl = input.nextInt();

        boolean isTanggalValid = tanggal >= 1 && tanggal <= 31;
        boolean isBulanValid = bulan >= 1 && bulan <= 12;
        boolean isTahunValid = tahun > 0;
        boolean isNextTgl = nextTgl >= 1 && nextTgl <= 31;

        hariInput = hariInput.toLowerCase();

        for (int i = 0; i < Hari.length; i++) {
            if (Hari[i].toLowerCase().equals(hariInput)) {
                day = i;
                break;
            }
        }

        if (isTanggalValid && isBulanValid && isTahunValid && isNextTgl) {
            System.out.println(
                    "\nSekarang Adalah Hari " + hariInput + ", Tanggal   : " + tanggal + "-" + bulan + "-" + tahun);
            tanggal = nextTgl + tanggal;

            for (int i = 0; i < 1; i++) {
                if (day >= 0) {
                    int indeksHariLusa = (day + nextTgl) % Hari.length;
                    hariNext = Hari[indeksHariLusa];
                    if (tanggal > 31) {
                        if (tanggal == 31 && (bulan == 1 || bulan == 3 || bulan == 5 || bulan == 7 || bulan == 8
                                || bulan == 10 || bulan == 12)) {
                            int newTanggal = tanggal - 31;
                            if (bulan == 12) {
                                tahun++;
                                bulan = 1;
                                tanggal = newTanggal;
                            } else {
                                bulan++;
                                tanggal = newTanggal;
                            }
                        } else if (tanggal > 31 && (bulan == 1 || bulan == 3 || bulan == 5 || bulan == 7 || bulan == 8
                                || bulan == 10 || bulan == 12)) {
                            int newTanggal = tanggal - 31;
                            if (bulan == 12) {
                                tahun++;
                                bulan = 1;
                                tanggal = newTanggal;
                            } else {
                                bulan++;
                                tanggal = newTanggal;
                            }

                        } else if (tanggal >= 29 && bulan == 2) {
                            int newTanggal = tanggal - 29;
                            bulan++;
                            tanggal = newTanggal;
                        } else if (tanggal >= 30 && (bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11)) {
                            int newTanggal = tanggal - 30;
                            bulan++;
                            tanggal = newTanggal;
                        } else {
                            int newTanggal = tanggal - 31;
                            tanggal = newTanggal;
                        }
                    }
                } else {
                    System.out.println("\nHari yang Anda masukkan tidak valid.");
                }
                System.out.println(
                        "Dan Next " + nextTgl + " Hari Adalah Hari " + hariNext + ", Tanggal " + tanggal + "-" + bulan
                                + "-"
                                + tahun);
            }
        } else {
            System.out.println("\nInput tanggal, next tanggal, bulan, atau tahun tidak valid.");
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
