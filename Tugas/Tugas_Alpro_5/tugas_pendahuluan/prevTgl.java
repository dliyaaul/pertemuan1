package Tugas.Tugas_Alpro_5.tugas_pendahuluan;

import java.util.Scanner;

class prev {
    public static void main(String[] args) {
        prevTgl pt = new prevTgl();
        pt.Tanggal();
    }
}

public class prevTgl {
    Scanner input = new Scanner(System.in);

    String Hari[] = { "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu" };
    String hariInput, hariPrev, indeksHariPrev;
    int[] angkaHari = { 0, 1, 2, 3, 4, 5, 6 };
    int dayPrev;
    int day = -1;
    int tanggal, prevTgl;
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

        System.out.print("Masukkan prev tanggal (1-31)          : ");
        prevTgl = input.nextInt();

        boolean isTanggalValid = tanggal >= 1 && tanggal <= 31;
        boolean isBulanValid = bulan >= 1 && bulan <= 12;
        boolean isTahunValid = tahun > 0;
        boolean isprevTgl = prevTgl >= 1 && prevTgl <= 31;

        for (int i = 0; i < Hari.length; i++) {
            if (Hari[i].equalsIgnoreCase(hariInput)) {
                day = angkaHari[i];
                indeksHariPrev = Hari[(prevTgl - day + 7) % 6];
                break;
            }
        }

        if (isTanggalValid && isBulanValid && isTahunValid && isprevTgl) {
            System.out.println(
                    "\nSekarang Adalah Hari " + hariInput + ", Tanggal   : " + tanggal + "-" + bulan + "-" + tahun);
            tanggal = tanggal - prevTgl;

            for (int i = 0; i < 1; i++) {
                if (day >= 0) {
                    if (tanggal < 1) {
                        if (tanggal == 1 && (bulan == 1 || bulan == 3 || bulan == 5 || bulan == 7 || bulan == 8
                                || bulan == 10 || bulan == 12)) {
                            int newTanggal = tanggal + 30;
                            if (bulan == 1) {
                                tahun--;
                                bulan = 12;
                                tanggal = newTanggal;
                            } else {
                                bulan--;
                                tanggal = newTanggal;
                            }
                        } else if (tanggal < 1 && (bulan == 1 || bulan == 5 || bulan == 7 || bulan == 8
                                || bulan == 10 || bulan == 12)) {
                            int newTanggal = tanggal + 30;
                            if (bulan == 1) {
                                tahun--;
                                bulan = 12;
                                tanggal = newTanggal;
                            } else {
                                bulan--;
                                tanggal = newTanggal;
                            }
                        } else if (tanggal < 1 && bulan == 3) {
                            int newTanggal = tanggal + 29;
                            bulan--;
                            tanggal = newTanggal;
                        } else if (tanggal < 1 && bulan == 2) {
                            int newTanggal = tanggal + 30;
                            bulan--;
                            tanggal = newTanggal;
                        } else if (tanggal < 1 && (bulan == 4 || bulan == 6 || bulan == 9 || bulan == 11)) {
                            int newTanggal = tanggal + 31;
                            bulan--;
                            tanggal = newTanggal;
                        } else {
                            int newTanggal = tanggal + 31;
                            tanggal = newTanggal;
                        }
                    }
                } else {
                    System.out.println("\nHari yang Anda masukkan tidak valid.");
                }
                System.out.println(
                        "Dan Prev " + prevTgl + " Hari Adalah Hari " + indeksHariPrev + ", Tanggal " + tanggal
                                + "-" + bulan
                                + "-"
                                + tahun);
            }
        } else {
            System.out.println("\nInput tanggal, prev tanggal, bulan, atau tahun tidak valid.");
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
