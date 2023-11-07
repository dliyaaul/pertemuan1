package Tugas.UTS;

import java.util.Scanner;

class Main2 {
    public static void main(String[] args) {
        soal2 uts2 = new soal2();
        uts2.input2();
    }
}

public class soal2 {
    Scanner inp1 = new Scanner(System.in);
    String Nama, SKI, IndeksNilai;
    int semester, EPRT, NIM;
    double ipk;
    boolean ulang;

    public void input2() {
        System.out.print("\nMasukkan Nama     = ");
        Nama = inp1.next();
        System.out.print("Masukkan NIM      = ");
        NIM = inp1.nextInt();
        System.out.print("Total Semester    = ");
        semester = inp1.nextInt();
        System.out.print("Total IPK (3.50)  = ");
        ipk = inp1.nextDouble();
        System.out.print("Total EPRT        = ");
        EPRT = inp1.nextInt();
        System.out.print("Memiliki SKI ? (ada / tidak) = ");
        SKI = inp1.next();

        switch (SKI) {
            case "ada":
                if ((semester <= 6) && semester >= 5) {
                    if ((ipk >= 3.51) && ipk <= 4.0) {
                        if (EPRT >= 450) {
                            IndeksNilai = "Cumlaude";
                        }
                    } else if ((ipk >= 3.01) && ipk <= 3.50) {
                        IndeksNilai = "Sangat Memuaskan";
                    } else if ((ipk >= 2.76) && ipk <= 3.0) {
                        IndeksNilai = "Memuaskan";
                    } else {
                        IndeksNilai = "Gagal Karena, IPK Anda Tidak Valid";
                    }
                } else if (semester > 6) {
                    if ((ipk >= 3.51) && ipk <= 4.0) {
                        IndeksNilai = "Sangat Memuaskan";
                    } else if ((ipk >= 3.01) && ipk <= 3.50) {
                        IndeksNilai = "Sangat Memuaskan";
                    } else if ((ipk >= 2.76) && ipk <= 3.0) {
                        IndeksNilai = "Memuaskan";
                    } else {
                        IndeksNilai = "Gagal Karena, IPK Anda Tidak Valid";
                    }
                } else if (semester < 5) {
                    System.out.println("Total Semester Anda Masih Kurang");
                }
                System.out.println("\nNama    = " + Nama);
                System.out.println("Nim     = " + NIM);
                System.out.println(semester + " " + ipk + " " + EPRT + " " + SKI);
                System.out.println("Indeks Nilai Anda = " + IndeksNilai);
                break;
            case "tidak":
                if ((semester <= 6) && semester >= 5) {
                    if ((ipk >= 3.51) && ipk <= 4.0) {
                        IndeksNilai = "Sangat Memuaskan";
                    } else if ((ipk >= 3.01) && ipk <= 3.50) {
                        IndeksNilai = "Sangat Memuaskan";
                    } else if ((ipk >= 2.76) && ipk <= 3.0) {
                        IndeksNilai = "Memuaskan";
                    } else {
                        IndeksNilai = "Gagal Karena, IPK Anda Tidak Valid";
                    }
                } else if (semester > 6) {
                    if ((ipk >= 3.51) && ipk <= 4.0) {
                        IndeksNilai = "Sangat Memuaskan";
                    } else if ((ipk >= 3.01) && ipk <= 3.50) {
                        IndeksNilai = "Sangat Memuaskan";
                    } else if ((ipk >= 2.76) && ipk <= 3.0) {
                        IndeksNilai = "Memuaskan";
                    } else {
                        IndeksNilai = "Gagal Karena, IPK Anda Tidak Valid";
                    }
                } else if (semester < 5) {
                    System.out.println("Total Semester Anda Masih Kurang");
                }
                System.out.println("\nNama    = " + Nama);
                System.out.println("Nim     = " + NIM);
                System.out.println(semester + " " + ipk + " " + EPRT + " " + SKI);
                System.out.println("Indeks Nilai Anda = " + IndeksNilai);
                break;
            default:
                System.out.println("Error, Inputan harus ada / tidak!!");
                break;
        }

        ulang();
    }

    public void ulang() {
        System.out.print("\nApakah Ingin Mengulang (y/n)? ");
        String pilihan = inp1.next();
        ulang = pilihan.equals("y");
        if (ulang == true) {
            input2();
        } else {
            System.exit(0);
        }
    }
}
