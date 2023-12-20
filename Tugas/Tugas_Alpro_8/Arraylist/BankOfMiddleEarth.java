package Tugas.Tugas_Alpro_8.Arraylist;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class BankOfMiddleEarth {
    ArrayList<Rekening> aRek = new ArrayList<>();
    double saldoMinimal = 500000.0;
    static Scanner input;
    int no;
    static String inputCommand;

    static {
        input = new Scanner(System.in);
    }

    BankOfMiddleEarth() {
    }

    public static void main(String[] abcd) {
        BankOfMiddleEarth b = new BankOfMiddleEarth();

        do {
            System.out.println("\u001bc");
            b.menu();
            System.out.print("Kembali ke Menu Awal (Y / N)? : ");
            inputCommand = input.next();
            System.out.println();
        } while (inputCommand.equalsIgnoreCase("y"));

    }

    private void menu() {
        System.out.println("<====PILIH MENU====>");
        System.out.println("1. Buat Rekening Baru");
        System.out.println("2. Cek Rekening");
        System.out.println("3. Tabung");
        System.out.println("4. Tarik Uang");
        System.out.println("5. Transfer");
        System.out.println("6. Info Rekening");
        System.out.println("7. Keluar");
        System.out.print("Masukkan Angka : ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("\u001bc");
                this.buatRekening();
                break;
            case 2:
                System.out.println("\u001bc");
                this.cekRekening(this.no);
                break;
            case 3:
                System.out.println("\u001bc");
                this.tabung();
                break;
            case 4:
                System.out.println("\u001bc");
                this.tarik();
                break;
            case 5:
                System.out.println("\u001bc");
                this.transfer();
                break;
            case 6:
                System.out.println("\u001bc");
                this.infoRekening(this.no);
                break;
            default:
                System.out.println("Terima Kasih Telah Menggunakan Layanan Kami :)");
        }

    }

    private void buatRekening() {
        System.out.println("<====Buat Rekening Baru====>");
        System.out.println();
        System.out.print("Masukkan Nama  : ");
        String nama = input.next();
        System.out.print("Masukkan Saldo : ");
        double saldo = input.nextDouble();
        if (saldo < this.saldoMinimal) {
            System.out.println("Saldo awal tidak mencukupi");
        } else {
            int no;
            if (!this.aRek.isEmpty()) {
                no = ((Rekening) this.aRek.get(this.aRek.size() - 1)).getNo() + 1;
            } else {
                no = 1;
            }

            Rekening rek = new Rekening(no, nama, saldo);
            this.aRek.add(rek);
            System.out.println("Nomor Rekening : " + no);
            System.out.println("Rekening telah ditambahkan");
        }

    }

    private int cekRekening(int no) {
        System.out.println("<====Cek Saldo====>");
        System.out.println();
        System.out.print("Masukkan Nomor Rekening : ");
        no = input.nextInt();
        int ketemu = -1;
        System.out.println("\u001bc");

        for (int a = 0; a < this.aRek.size(); ++a) {
            double saldo = ((Rekening) this.aRek.get(a)).getSaldo();
            if (((Rekening) this.aRek.get(a)).getNo() == no) {
                ketemu = a;
                System.out.println("<====Bank Of Middle Earth====>");
                System.out.println();
                PrintStream var10000 = System.out;
                Object[] var10002 = new Object[] { saldo };
                var10000.println("Rekening Anda : \n" + String.format("Rp.%,.2f", var10002));
                break;
            }
        }

        System.out.println();
        return ketemu;
    }

    private void tabung() {
        System.out.println("<====Simpan Uang====>");
        System.out.println();
        System.out.print("Masukkan Nominal Uang : ");
        double jumlah = (double) input.nextInt();
        int pos = this.cekRekening(this.no);
        if (pos >= 0) {
            double saldoAkhir = ((Rekening) this.aRek.get(pos)).getSaldo() + jumlah;
            ((Rekening) this.aRek.get(pos)).setSaldo(saldoAkhir);
            System.out.println("Saldo telah ditambahkan");
        } else {
            System.out.println("No Rekening tidak ditemukan, Transaksi dibatalkan");
        }

    }

    private void tarik() {
        System.out.println("<====Tarik Uang====>");
        System.out.println();
        System.out.print("Masukkan Nominal Uang : ");
        double jumlah = (double) input.nextInt();
        int pos = this.cekRekening(this.no);
        if (pos >= 0) {
            double saldoAkhir = ((Rekening) this.aRek.get(pos)).getSaldo() - jumlah;
            if (jumlah < this.saldoMinimal) {
                ((Rekening) this.aRek.get(pos)).setSaldo(saldoAkhir);
                System.out.println("Transaksi Selesai");
            } else {
                System.out.println("Saldo tidak cukup, Transaksi dibatalkan");
            }
        } else {
            System.out.println("No Rekening tidak ditemukan, Transaksi dibatalkan");
        }

    }

    private void transfer() {
        System.out.println("<====Transfer Uang====>");
        System.out.println();
        System.out.print("Masukkan Jumlah Tranfer : ");
        double kirim = input.nextDouble();
        int posAsal = this.cekRekening(this.no);
        int posTujuan = this.cekRekening(this.no);
        if (posAsal >= 0 && posTujuan >= 0) {
            double saldoAkhirAsal = ((Rekening) this.aRek.get(posAsal)).getSaldo() - kirim;
            if (saldoAkhirAsal >= 0.0) {
                ((Rekening) this.aRek.get(posAsal)).setSaldo(saldoAkhirAsal);
                double SaldoAkhirTujuan = ((Rekening) this.aRek.get(posTujuan)).getSaldo() + kirim;
                ((Rekening) this.aRek.get(posTujuan)).setSaldo(SaldoAkhirTujuan);
                System.out.println("Transfer telah dilaksanakan");
            } else {
                System.out.println("Saldo tidak cukup, Transaksi dibatalkan");
            }
        } else {
            System.out.println("No Rekening tidak ditemukan");
        }

    }

    private void infoRekening(int no) {
        int pos = this.cekRekening(no);
        if (pos >= 0) {
            System.out.println("Informasi Rekening");
            PrintStream var10000 = System.out;
            Object var10001 = this.aRek.get(pos);
            var10000.println("No Rek : " + ((Rekening) var10001).getNo());
            var10000 = System.out;
            var10001 = this.aRek.get(pos);
            var10000.println("Nama   : " + ((Rekening) var10001).getNama());
            var10000 = System.out;
            Object[] var10002 = new Object[] { ((Rekening) this.aRek.get(pos)).getSaldo() };
            var10000.println("Saldo  : " + String.format("Rp.%,.2f", var10002));
        }

    }
}
