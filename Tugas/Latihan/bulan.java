package Tugas.Latihan;

import java.util.Scanner;

class Moon {
    public static void main(String[] args) {
        bulan buln = new bulan();
        buln.NoBulan();
    }
}

class bulan {
    String NoBulan;
    boolean ulang = true;

    Scanner bln = new Scanner(System.in);

    public void NoBulan() {
        System.out.print("Silahkan Input No Bulan : ");
        NoBulan = bln.nextLine();
        NamaBulan();
    }

    public void NamaBulan() {
        switch (NoBulan) {
            case "1":
                System.out.println("Bulan Januari");
                break;
            case "2":
                System.out.println("Bulan Februari");
                break;
            case "3":
                System.out.println("Bulan Maret");
                break;
            case "4":
                System.out.println("Bulan April");
                break;
            case "5":
                System.out.println("Bulan Mei");
                break;
            case "6":
                System.out.println("Bulan Juni");
                break;
            case "7":
                System.out.println("Bulan Juli");
                break;
            case "8":
                System.out.println("Bulan Agustus");
                break;
            case "9":
                System.out.println("Bulan September");
                break;
            case "10":
                System.out.println("Bulan Oktober");
                break;
            case "11":
                System.out.println("Bulan November");
                break;
            case "12":
                System.out.println("Bulan Desember");
                break;
            default:
                System.out.println("Bulan Tidak Tersedia");
                break;
        }
        ulang();
    }

    public void ulang() {
        System.out.print("\nApakah Ingin Mengulang (y/n)? ");
        String pilihan = bln.nextLine();
        ulang = pilihan.equals("y");
        if (ulang == true) {
            NoBulan();
        } else {
            System.exit(0);
        }
    }
}
