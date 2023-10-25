package Tugas.Tugas_Alpro_4;

import java.util.Scanner;

public class Perbankkan {
    static private String Nama, NIK, TmptTglLahir, JK, NoRek, Action;
    static private boolean MembuatRekening;
    static private int Saldo = 0, SaldoAwal;
    static private int Pilihan;
    static private int Menu;
    static private int TarikSaldo;
    static private int TambahSaldo;
    static private long totalVoucher;
    static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Selamat Datang di Aplikasi Perbankkan");
        System.out.println("<---Masukkan Pilihan di Menu Utama--->");
        System.out.println("1. Membuat Rekening Baru");
        System.out.println("2. Melihat Saldo");
        System.out.println("3. Menambah Saldo");
        System.out.println("4. Menarik Saldo");
        System.out.print("Masukkan pilihan anda [1-4] : ");
        Menu = inp.nextInt();

        switch (Menu) {
            case 1:
                MembuatRekening();
                break;
            case 2:
                System.out.println("\nJika Anda Ingin Melihat Saldo");
                System.out.println("Harus Membuat Rekening Terlebih Dahulu!");
                System.out.print("\nIngin Membuat Rekening Sekarang? [y/n] : ");
                Action = inp.next();
                MembuatRekening = Action.equals("y");
                if (MembuatRekening == true) {
                    MembuatRekening();
                } else {
                    System.out.println("Keluar Aplikasi...");
                }
                break;
            case 3:
                System.out.println("\nJika Anda Ingin Menambah Saldo");
                System.out.println("Harus Membuat Rekening Terlebih Dahulu!");
                System.out.print("\nIngin Membuat Rekening Sekarang? [y/n] : ");
                Action = inp.next();
                MembuatRekening = Action.equals("y");
                if (MembuatRekening == true) {
                    MembuatRekening();
                } else {
                    System.out.println("Keluar Aplikasi...");
                }
                break;
            case 4:
                System.out.println("\nJika Anda Ingin Menarik Saldo");
                System.out.println("Harus Membuat Rekening Terlebih Dahulu!");
                System.out.print("\nIngin Membuat Rekening Sekarang? [y/n] : ");
                Action = inp.next();
                MembuatRekening = Action.equals("y");
                if (MembuatRekening == true) {
                    MembuatRekening();
                } else {
                    System.out.println("Keluar Aplikasi...");
                }
                break;
            default:
                System.out.println("Kode Tidak Valid!");
        }
    }

    static void menu() {
        System.out.println("\n<-----Menu Selanjutnya----->");
        System.out.println("1. Membuat Rekening Baru");
        System.out.println("2. Melihat Saldo");
        System.out.println("3. Menambah Saldo");
        System.out.println("4. Menarik Saldo");
        System.out.println("5. Keluar");
        System.out.print("Masukkan pilihan anda [1-5] : ");
        Pilihan = inp.nextInt();

        switch (Pilihan) {
            case 1:
                System.out.println("Jika Ingin Membuat Rekening Baru");
                System.out.println("Anda Harus Setor Saldo Terlebih Dahulu!");
                System.out.println("Jumlah Setor Awal Minimal 100000 rb");
                System.out.print("Silahkan Masukkan Jumlah Saldo : ");
                SaldoAwal = inp.nextInt();
                if (SaldoAwal >= 100000) {
                    MembuatRekening();
                } else if (SaldoAwal < 100000) {
                    System.out.println("Gagal Membuat Rekening karena");
                    System.out.println("Jumlah Setor Dibawah 100000 rb");
                }
                break;
            case 2:
                MelihatSaldo();
                break;
            case 3:
                MenambahSaldo();
                break;
            case 4:
                MenarikSaldo();
                break;
            case 5:
                System.out.println("Keluar Aplikasi...");
                break;
            default:
                System.out.println("Kode Tidak Valid!");
                break;
        }
    }

    static void MembuatRekening() {
        System.out.println("\nJika Anda Ingin Membuat Rekening Baru");
        System.out.println("Harus Setor Saldo Terlebih Dahulu!");
        System.out.println("Jumlah Setor Awal Minimal 100000 rb");
        System.out.print("Silahkan Masukkan Jumlah Setor : ");
        SaldoAwal = inp.nextInt();
        if (SaldoAwal >= 100000) {
            System.out.println("\n<-----Menu Membuat Rekening----->");
            System.out.print("Silahkan Masukkan Nama                : ");
            Nama = inp.next();
            System.out.print("Silahkan Masukkan Nik                 : ");
            NIK = inp.next();
            System.out.print("Silahkan Masukkan Tmpt, Tgl Lahir     : ");
            TmptTglLahir = inp.next();
            System.out.print("Silahkan Masukkan Jenis Kelamin [L/P] : ");
            JK = inp.next();
            Saldo = SaldoAwal;
            viewData();
        } else if (SaldoAwal < 100000) {
            System.out.println("\nGagal Membuat Rekening Baru Karena");
            System.out.println("Jumlah Setor Dibawah 100000 rb");
        }
    }

    static void MelihatSaldo() {
        System.out.println("\n<-----Menu Menampilkan Saldo----->");
        System.out.println("Saldo Anda Saat Ini     : " + Saldo + " Rb");
        menu();
    }

    static void MenambahSaldo() {
        System.out.println("\n<-----Menu Menambah Saldo----->");
        System.out.println("Saldo Anda Saat Ini             : " + Saldo);
        System.out.print("Silahkan Masukkan Jumlah Nilai  : ");
        TambahSaldo = inp.nextInt();
        SaldoAwal = TambahSaldo + Saldo;
        Saldo = SaldoAwal;
        viewData();
    }

    static void MenarikSaldo() {
        System.out.println("\n<-----Menu Menarik Saldo----->");
        System.out.println("Saldo Anda Saat Ini             : " + Saldo);
        System.out.print("Silahkan Masukkan Jumlah Nilai  : ");
        TarikSaldo = inp.nextInt();
        SaldoAwal = Saldo - TarikSaldo;
        Saldo = SaldoAwal;
        if (Saldo < 100000) {
            System.out.println("\nPenarikan Saldo Gagal Karena");
            System.out.println("Saldo Tidak Boleh Kurang Dari 100000");
            SaldoAwal = Saldo + TarikSaldo;
            Saldo = SaldoAwal;
            menu();
        } else {
            System.out.println("\nPenarikan Saldo Berhasil");
            Saldo = SaldoAwal;
            viewData();
        }
    }

    static void viewData() {
        long voucher = 50000;
        long batasAtas = 1000000000;

        for (long i = 10000000; i <= batasAtas; i += 10000000) {
            if ((TambahSaldo < 1000000) && (Saldo > 1000000)) {
                System.out.println("\nSelamat Karena Anda Setor Dibawah 1.000.000");
                System.out.println("Anda Mendapatkan 1 Buah Bolpoin Cantik");
                break;
            } else if ((TambahSaldo <= 10000000) && (Saldo >= 10001000)) {
                System.out.println("\nSelamat Karena Anda Setor Diantara 1.000.000 - 10.000.000");
                System.out.println("Anda Mendapatkan Voucher Belanja Sebesar Rp. " + voucher);
                break;
            } else if ((TambahSaldo > 10000000) != (TambahSaldo % 10000000 == 0) && (Saldo >= 10000000)) {
                System.out.println("\nSelamat Karena Anda Setor Diatas 10.000.000");
                System.out.println("Anda Mendapatkan Voucher Belanja Sebesar Rp. " + voucher);
                break;
            } else if ((TambahSaldo > 10000000) && (TambahSaldo % 10000000 == 0) && (Saldo >= 10000000)) {
                long JumlahKelipatan = Saldo / 10000000;
                totalVoucher = voucher * JumlahKelipatan;
                System.out.println("\nSelamat Karena Anda Setor Diatas atau Dikelipatan 10.000.000");
                System.out.println("Anda Mendapatkan Voucher Belanja Sebesar Rp. " + totalVoucher);
                break;
            } else if ((TambahSaldo == 0) || (Saldo < 1000000)) {

            }
        }

        System.out.println("\n<-----Menu Menampilkan Data----->");
        System.out.println("Nama Lengkap            : " + Nama);
        System.out.println("NIK                     : " + NIK);
        switch (JK) {
            case "L":
                System.out.println("Jenis Kelamin           : Laki-Laki");
                break;
            case "P":
                System.out.println("Jenis Kelamin           : Perempuan");
                break;
            default:
                System.out.println("Jenis Kelamin           : Tidak Ada");
                break;
        }
        System.out.println("Tempat Tanggal Lahir    : " + TmptTglLahir);
        System.out.println("No Rekening Anda        : " + NoRek);
        System.out.println("Saldo Anda Saat Ini Rp. : " + Saldo);
        menu();
    }
}
