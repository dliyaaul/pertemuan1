package Tugas.Tugas_Alpro_3;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        TugasAkhir bnk = new TugasAkhir();

        bnk.CreateAkun();
        bnk.TampilSaldo();
    }
}

class TugasAkhir {
    private String Nama;
    private String NIK;
    private String TmptTglLahir;
    private String NoRek = "2103104105";
    private char JK;
    private int TarikSaldo;
    private int TambahSaldo;
    private double Saldo;
    private boolean Pilihan = true;

    Scanner bank = new Scanner(System.in);

    public void CreateAkun() {
        System.out.println("<----Create Akun Bank---->");
        try {
            System.out.println("\nSilahkan Masukkan Data diBawah ini!");
            System.out.print("Nama Lengkap          : ");
            Nama = bank.nextLine();
            System.out.print("NIK                   : ");
            NIK = bank.nextLine();
            System.out.print("Tmpt, TGl Lahir       : ");
            TmptTglLahir = bank.nextLine();
            System.out.print("Jenis Kelamin (L/P)   : ");
            JK = bank.next().charAt(JK);
            pressEnter();
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }

    public void TampilSaldo() {
        System.out.println("\n<----Menampilkan Saldo---->");
        System.out.println("Saldo Anda Saat Ini     : " + Saldo);
        System.out.print("Apakah Anda Ingin Melanjutkan? (y/n) : ");
        String Operasi = bank.nextLine();
        Pilihan = Operasi.equals("y");
        if (Pilihan == true) {
            pressEnter();
            Action();
        } else {
            System.exit(0);
        }
    }

    public void Action() {
        System.out.print("\nSilahkan Masukkan Pilihan Anda (Setor / Tarik) : ");
        String Action = bank.nextLine();
        Pilihan = Action.equals("Setor");
        if (Pilihan == true) {
            SetorSaldo();
        } else {
            TarikSaldo();
        }
    }

    public void SetorSaldo() {
        System.out.println("\n<----Menu Setor Saldo---->");
        System.out.print("Masukkan Nilai yang Ingin diSetor : ");
        TambahSaldo = bank.nextInt();
        Saldo = Saldo + TambahSaldo;
        pressEnter();
        View();
    }

    public void TarikSaldo() {
        System.out.println("\n<----Menu Tarik Saldo---->");
        System.out.print("Masukkan Nilai yang Ingin Di Tarik : ");
        TarikSaldo = bank.nextInt();
        Saldo = Saldo - TarikSaldo;
        pressEnter();
        View();
    }

    public void View() {
        System.out.println("\n<----Menampilkan Data Akun Anda---->");
        System.out.println("Nama Lengkap            : " + Nama);
        System.out.println("NIK                     : " + NIK);
        if (JK == 'L') {
            System.out.println("Jenis Kelamin           : Laki-Laki");
        } else if (JK == 'P') {
            System.out.println("Jenis Kelamin           : Perempuan");
        } else {
            System.out.println("Jenis Kelamin           : Tidak Ada");
        }
        System.out.println("Tempat Tanggal Lahir    : " + TmptTglLahir);
        System.out.println("No Rekening Anda        : " + NoRek);
        System.out.println("Saldo Anda Saat Ini     : " + Saldo);
        pressEnter();
        TampilSaldo();
    }

    void pressEnter() {
        try {
            System.out.println("Tekan enter untuk melanjutkan");
            bank.nextLine();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
