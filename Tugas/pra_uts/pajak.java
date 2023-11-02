package Tugas.pra_uts;

import java.util.Scanner;

class pjk {
    public static void main(String[] args) {
        pajak pjk = new pajak();
        pjk.kndrn();
    }
}

public class pajak {
    Scanner scn = new Scanner(System.in);
    String jenis;
    int kap, tahun;
    double pajakTahun, pajak;
    double totalPajak;
    double penambahan;
    int totalTahun;
    private boolean ulang;

    public void kndrn() {
        System.out.println("\nSilahkan Pilih Jenis Kendaraan yang Ingin Anda Pilih");
        System.out.println("==========================================================");
        System.out.println("|| Jenis || || Kapasitas Mesin (cc) || ||     Pajak     ||");
        System.out.println("==========================================================");
        System.out.println("|| Motor || ||       kap<100cc      || || Rp. 200.000   ||");
        System.out.println("||       || ||      100<=kap<250    || || Rp. 1.000.000 ||");
        System.out.println("||       || ||       Kap>=250cc     || || Rp. 4.000.000 ||");
        System.out.println("==========================================================");
        System.out.println("|| Mobil || ||      kap<1000cc      || || Rp. 2.000.000 ||");
        System.out.println("||       || ||    1000<=kap<1500    || || Rp. 3.000.000 ||");
        System.out.println("||       || ||    1500<=Kap<=2500   || || Rp. 6.000.000 ||");
        System.out.println("||       || ||       Kap>=2500      || || Rp. 12.000.000||");
        System.out.println("==========================================================");
        System.out.print("\nPilih Jenis Kendaraan             : ");
        jenis = scn.next();
        System.out.print("Masukkan Kapasitas Mesin (cc)     : ");
        kap = scn.nextInt();
        System.out.print("Masukkan Tahun Pembuatan (2020)   : ");
        tahun = scn.nextInt();
        if (tahun > 2023) {
            System.out.println("\nTahun Tidak Boleh Lebih dari 2023");
        } else {
            switch (jenis) {
                case "Motor":
                    if (kap < 100) {
                        pajak = 200000;
                        totalTahun = 2023 - tahun;
                        pajakTahun = totalTahun * 0.01;
                        penambahan = pajak * pajakTahun;
                        totalPajak = pajak + penambahan;
                    } else if (kap >= 100 && kap < 250) {
                        pajak = 1000000;
                        totalTahun = 2023 - tahun;
                        pajakTahun = totalTahun * 0.03;
                        penambahan = pajak * pajakTahun;
                        totalPajak = pajak + penambahan;
                    } else {
                        pajak = 4000000;
                        totalTahun = 2023 - tahun;
                        pajakTahun = totalTahun * 0.05;
                        penambahan = pajak * pajakTahun;
                        totalPajak = pajak + penambahan;
                    }
                    System.out.println("\nContoh Asumsi Sekarang Tahun 2023");
                    System.out.println(jenis + ", " + kap + "cc, Tahun " + tahun);
                    System.out.println("Maka Pajaknya Adalah    :");
                    System.out.println("Pajak Pokok             : " + pajak);
                    System.out.println("Penambahan Pokok        : " + pajak + " * " + pajakTahun);
                    System.out.println("Total Penambahan        : " + penambahan);
                    System.out.println("Total Pajak             : " + totalPajak);

                    break;
                case "Mobil":
                    if (kap < 1000) {
                        pajak = 2000000;
                        totalTahun = 2023 - tahun;
                        pajakTahun = totalTahun * 0.01;
                        penambahan = pajak * pajakTahun;
                        totalPajak = pajak + penambahan;
                    } else if (kap >= 1000 && kap < 1500) {
                        pajak = 3000000;
                        totalTahun = 2023 - tahun;
                        pajakTahun = totalTahun * 0.02;
                        penambahan = pajak * pajakTahun;
                        totalPajak = pajak + penambahan;
                    } else if (kap >= 1500 && kap <= 2500) {
                        pajak = 6000000;
                        totalTahun = 2023 - tahun;
                        pajakTahun = totalTahun * 0.04;
                        penambahan = pajak * pajakTahun;
                        totalPajak = pajak + penambahan;
                    } else {
                        pajak = 12000000;
                        totalTahun = 2023 - tahun;
                        pajakTahun = totalTahun * 0.08;
                        penambahan = pajak * pajakTahun;
                        totalPajak = pajak + penambahan;
                    }
                    System.out.println("\nContoh Asumsi Sekarang Tahun 2023");
                    System.out.println(jenis + ", " + kap + "cc, Tahun " + tahun);
                    System.out.println("Maka Pajaknya Adalah    :");
                    System.out.println("Pajak Pokok         : " + pajak);
                    System.out.println("Penambahan Pokok    : " + pajak + " * " + pajakTahun);
                    System.out.println("Total Penambahan    : " + penambahan);
                    System.out.println("Total Pajak         : " + totalPajak);

                    break;

                default:
                    System.out.println("Jenis Kendaraan yang Anda Masukkan Salah");
                    break;
            }
        }
        ulang();
    }

    public void ulang() {
        System.out.print("\nApakah Ingin Mengulang (y/n)? ");
        String pilihan = scn.next();
        ulang = pilihan.equals("y");
        if (ulang == true) {
            kndrn();
        } else {
            System.exit(0);
        }
    }
}
