package Tugas.Tugas_Alpro_6.tugas_akhir;

import java.util.Scanner;

import Tugas.Tugas_Alpro_6.tugas_akhir.perulangan1.menu;

/**
 * MainLoop
 */
class MainLoop {
    public static void main(String[] args) {
        menu mn = new menu();
        mn.EksekusiMenu();
    }
}

public class perulangan1 {
    static Scanner inp = new Scanner(System.in);

    static class menu {
        void Menu() {
            System.out.println("\nAplikasi perhitungan nilai");
            System.out.println("Menu Utama");
            System.out.println("1. Bilangan Prima");
            System.out.println("2. Ritel Makanan");
            System.out.println("3. PerBankkan");
            System.out.println("4. Bilangan Kuadrat");
            System.out.println("5. Bilangan Divergen");
            System.out.println("6. Bilangan Faktorial");
            System.out.println("7. Keluar");
            System.out.print("Masukkan pilihan anda [1-7] : ");
        }

        void EksekusiMenu() {
            int pilihan = 0;
            while (pilihan != 7) {
                Menu();
                pilihan = inp.nextInt();
                switch (pilihan) {
                    case 1:
                        bilanganPrima prima = new bilanganPrima();
                        prima.bilangan();
                        break;
                    case 2:
                        ritel rtl = new ritel();
                        rtl.EksekusiMenuRitel();
                        break;
                    case 3:
                        bank bnk = new bank();
                        bnk.EksekusiMenuBank();
                        break;
                    case 4:
                        kuadrat kdrt = new kuadrat();
                        kdrt.bilanganKuadrat();
                        break;
                    case 5:
                        divergen dvrg = new divergen();
                        dvrg.bilanganDivergen();
                        break;
                    case 6:
                        faktorial ftr = new faktorial();
                        ftr.daftarFaktorial();
                        break;
                    case 7:
                        System.out.println("Keluar dari aplikasi...");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Inputan Yang Anda Masukkan Tidak Valid!");
                        break;
                }
            }
        }

    }

    /**
     * bilanganPrima
     */
    static class bilanganPrima {
        int nilai;

        void bilangan() {
            System.out.println("\nBilangan Prima");
            System.out.print("Masukkan Nilai Batas : ");
            nilai = inp.nextInt();
            daftarPrima(nilai);
        }

        void daftarPrima(int batas) {
            boolean bukti;
            int counter = 1;
            System.out.print("Daftar Nilai Prima : ");
            while (counter <= batas) {
                bukti = cekBilanganPrima(counter);
                if (bukti && counter != 1) {
                    System.out.print(counter + " ");
                }
                counter++;
            }
            System.out.println();

        }

        boolean cekBilanganPrima(int bilangan) {
            int counter = 2;
            int cekPrima = 0;
            while (counter <= bilangan) {
                if ((bilangan % counter) == 0) {
                    cekPrima++;
                }
                counter++;
            }
            if (cekPrima > 1) {
                return false;
            } else {
                return true;
            }
        }
    }

    static class ritel {
        String kode, Action;
        String nama;
        int stock;
        int hargaJual;
        int tmbh, Pilihan, Menu, tambah, jual;
        private boolean MembuatBarang;

        void menuRitel() {
            System.out.println("\nSelamat Datang di Aplikasi Ritel");
            System.out.println("<---Masukkan Pilihan di Menu Ritel--->");
            System.out.println("1. Menginput Barang Baru");
            System.out.println("2. Menjual Barang");
            System.out.println("3. Menambah Barang");
            System.out.println("4. Melihat Data Barang");
            System.out.println("5. Kembali ke Menu Utama");
            System.out.print("Masukkan pilihan anda [1-5] : ");
        }

        void EksekusiMenuRitel() {
            int pilihan = 0;
            while (pilihan != 5) {
                menuRitel();
                pilihan = inp.nextInt();
                switch (pilihan) {
                    case 1:
                        MembuatBarang();
                        break;
                    case 2:
                        System.out.println("\nJika Anda Ingin Menjual Barang");
                        System.out.println("Harus Menginput Barang Terlebih Dahulu!");
                        System.out.print("\nIngin Menginput Barang Sekarang? [y/n] : ");
                        Action = inp.next();
                        MembuatBarang = Action.equals("y");
                        if (MembuatBarang == true) {
                            MembuatBarang();
                        } else {
                            System.out.println("Kembali ke Menu Ritel...");
                        }
                        break;
                    case 3:
                        System.out.println("\nJika Anda Ingin Menambah Barang");
                        System.out.println("Harus Menginput Barang Terlebih Dahulu!");
                        System.out.print("\nIngin Menginput Barang Sekarang? [y/n] : ");
                        Action = inp.next();
                        MembuatBarang = Action.equals("y");
                        if (MembuatBarang == true) {
                            MembuatBarang();
                        } else {
                            System.out.println("Kembali ke Menu Ritel...");
                        }
                        break;
                    case 4:
                        System.out.println("\nJika Anda Ingin Melihat Data Barang");
                        System.out.println("Harus Menginput Barang Terlebih Dahulu!");
                        System.out.print("\nIngin Menginput Barang Sekarang? [y/n] : ");
                        Action = inp.next();
                        MembuatBarang = Action.equals("y");
                        if (MembuatBarang == true) {
                            MembuatBarang();
                        } else {
                            System.out.println("Kembali ke Menu Ritel...");
                        }
                        break;
                    case 5:
                        System.out.println("Kembali ke Menu Utama...");
                        menu mn = new menu();
                        mn.EksekusiMenu();
                    default:
                        System.out.println("Kode Tidak Valid!");
                        System.out.println("Kembali ke Menu Ritel...");
                }
            }
        }

        void menu2() {
            System.out.println("\n<-----Menu Selanjutnya----->");
            System.out.println("1. Menginput Barang Baru");
            System.out.println("2. Menjual Barang");
            System.out.println("3. Menambah Barang");
            System.out.println("4. Melihat Data Barang");
            System.out.println("5. Kembali ke Menu Ritel");
            System.out.print("Masukkan pilihan anda [1-5] : ");
        }

        void menuRitel2() {
            int pilihan = 0;
            while (pilihan != 5) {
                menu2();
                pilihan = inp.nextInt();
                switch (pilihan) {
                    case 1:
                        MembuatBarang();
                        break;
                    case 2:
                        MenjualBarang();
                        break;
                    case 3:
                        MenambahBarang();
                        break;
                    case 4:
                        MelihatBarang();
                        break;
                    case 5:
                        System.out.println("Kembali ke Menu Ritel...");
                        EksekusiMenuRitel();
                        break;
                    default:
                        System.out.println("Kode Tidak Valid!");
                        break;
                }
            }
        }

        void MembuatBarang() {
            System.out.println("\n<-----Menu Input Data Barang----->");
            System.out.print("Silahkan Masukkan Nama Barang         : ");
            nama = inp.next();
            System.out.print("Silahkan Masukkan Kode Barang         : ");
            kode = inp.next();
            System.out.print("Silahkan Masukkan Stock Awal          : ");
            stock = inp.nextInt();
            System.out.print("Silahkan Masukkan Harga Jual / Stok   : ");
            hargaJual = inp.nextInt();
            menuRitel2();
        }

        void MenambahBarang() {
            System.out.println("\n<-----Menu Menambah Stock Barang----->");
            System.out.println("Stok awal   : " + stock);
            System.out.print("Penambahan  : ");
            tambah = inp.nextInt();
            stock = stock + tambah;
            System.out.println("Stok akhir : " + stock);
            System.out.println("Data telah diubah");
            MelihatBarang();
        }

        void MenjualBarang() {
            System.out.println("\n<-----Menu Menjual Stock Barang----->");
            System.out.println("Stok awal   : " + stock);
            System.out.print("Pengurangan : ");
            jual = inp.nextInt();
            if ((stock - jual) < 0) {
                System.out.println("Jumlah stock tidak mencukupi");
                System.out.println("Transaksi dibatalkan");
                MelihatBarang();
            } else {
                stock = stock - jual;
                System.out.println("Stok akhir  : " + stock);
                System.out.println("Data telah diubah");
                MelihatBarang();
            }
        }

        void MelihatBarang() {
            System.out.println("\n<-----Menampilkan Detail Barang----->");
            System.out.println("Nama : " + nama);
            System.out.println("Kode : " + kode);
            System.out.println("Jumlah Stok : " + stock);
            System.out.println("Harga Jual / Stok : " + hargaJual);

            if (stock <= 5) {
                System.out.println("\nBarang Tinggal " + stock + ", segera lakukan penambahan stok");
                MenambahBarang();
            } else {
                menuRitel2();
            }
        }
    }

    static class bank {
        String Nama, NIK, TmptTglLahir, JK, NoRek, Action;
        boolean MembuatRekening;
        int Saldo = 0, SaldoAwal;
        int Pilihan;
        int Menu;
        int TarikSaldo;
        int TambahSaldo;
        long totalVoucher;

        void menuBank() {
            System.out.println("\nSelamat Datang di Aplikasi Perbankkan");
            System.out.println("<---Masukkan Pilihan di Menu Bank--->");
            System.out.println("1. Membuat Rekening Baru");
            System.out.println("2. Melihat Saldo");
            System.out.println("3. Menambah Saldo");
            System.out.println("4. Menarik Saldo");
            System.out.println("5. Kembali ke Menu Utama");
            System.out.print("Masukkan pilihan anda [1-5] : ");
        }

        void EksekusiMenuBank() {
            int Menu = 0;
            while (Menu != 5) {
                menuBank();
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
                            System.out.println("Kembali ke Menu Bank...");
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
                            System.out.println("Kembali ke Menu Bank...");
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
                            System.out.println("Kembali ke Menu Bank...");
                        }
                        break;
                    case 5:
                        System.out.println("Kembali ke Menu Utama...");
                        menu mn = new menu();
                        mn.EksekusiMenu();
                    default:
                        System.out.println("Kode Tidak Valid!");
                        System.out.println("Kembali ke Menu Bank...");
                        EksekusiMenuBank();

                }
            }
        }

        void menuBank2() {
            System.out.println("\n<-----Menu Selanjutnya----->");
            System.out.println("1. Membuat Rekening Baru");
            System.out.println("2. Melihat Saldo");
            System.out.println("3. Menambah Saldo");
            System.out.println("4. Menarik Saldo");
            System.out.println("5. Kembali ke Menu Bank");
            System.out.print("Masukkan pilihan anda [1-5] : ");
        }

        void EksekusiMenuBank2() {
            int Pilihan = 0;
            while (Pilihan != 5) {
                menuBank2();
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
                            EksekusiMenuBank2();
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
                        System.out.println("Kembali ke Menu Bank...");
                        EksekusiMenuBank();
                        break;
                    default:
                        System.out.println("Kode Tidak Valid!");
                        break;
                }
            }
        }

        void MembuatRekening() {
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

        void MelihatSaldo() {
            System.out.println("\n<-----Menu Menampilkan Saldo----->");
            System.out.println("Saldo Anda Saat Ini     : " + Saldo + " Rb");
            EksekusiMenuBank2();
        }

        void MenambahSaldo() {
            System.out.println("\n<-----Menu Menambah Saldo----->");
            System.out.println("Saldo Anda Saat Ini             : " + Saldo);
            System.out.print("Silahkan Masukkan Jumlah Nilai  : ");
            TambahSaldo = inp.nextInt();
            SaldoAwal = TambahSaldo + Saldo;
            Saldo = SaldoAwal;
            viewData();
        }

        void MenarikSaldo() {
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
                EksekusiMenuBank2();
            } else {
                System.out.println("\nPenarikan Saldo Berhasil");
                Saldo = SaldoAwal;
                viewData();
            }
        }

        void viewData() {
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
            EksekusiMenuBank2();
        }
    }

    static class kuadrat {
        int nilai, sum = 0;

        void bilanganKuadrat() {
            System.out.println("\nBilangan Kuadrat");
            System.out.print("Masukkan Nilai Batas [1-100] : ");
            nilai = inp.nextInt();
            if (nilai < 1) {
                System.out.println("Inputan Tidak Valid!");
            } else {
                daftarKuadrat(nilai);
            }
        }

        void daftarKuadrat(int batas) {
            System.out.print("Daftar kuadrat dari 1 sampai " + nilai + " : ");
            for (int i = 1; i <= batas; i++) {
                sum += i * i;
                if (i == batas) {
                    System.out.print(i * i);
                } else {
                    System.out.print(i * i + " + ");
                }
            }
            System.out.println(" = " + sum);
        }
    }

    static class divergen {
        int nilai, sum = 0;

        void bilanganDivergen() {
            System.out.println("\nBilangan Divergen");
            System.out.print("Masukkan Nilai Batas : ");
            nilai = inp.nextInt();
            if (nilai < 1) {
                System.out.println("Inputan Tidak Valid!");
            } else {
                daftarDivergen(nilai);
            }
        }

        void daftarDivergen(int batas) {
            System.out.print("Daftar Divergen dari 1 sampai " + nilai);

            if (batas != 0) {
                int hasil = 0;
                System.out.print(" adalah : ");

                for (int i = 1; i <= batas; i++) {
                    if ((i % 2) != 0) {
                        hasil = hasil + i;
                        if (i == batas) {
                            System.out.print(i + "");
                        } else {
                            System.out.print(i + " - ");
                        }
                    } else {
                        hasil = hasil - i;
                        if (i == batas) {
                            System.out.print(i + "");
                        } else {
                            System.out.print(i + " + ");
                        }
                    }
                }

                System.out.println(" = " + hasil);
            } else {
                System.out.println("Inputan tidak valid.");
            }
        }

    }

    static class faktorial {
        long hitungFactorial(int n) {
            if (n < 0) {
                return -1; // Menandakan input tidak valid
            } else if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * hitungFactorial(n - 1);
            }
        }

        void daftarFaktorial() {
            System.out.println("\nBilangan Faktorial");
            System.out.print("Masukkan Bilangan Bulat: ");
            int inputAngka = inp.nextInt();

            if (inputAngka >= 0) {
                long hasilFactorial = hitungFactorial(inputAngka);

                if (hasilFactorial != -1) {
                    System.out.print(inputAngka + "! = ");
                    for (int i = inputAngka; i >= 1; i--) {
                        System.out.print(i);
                        if (i > 1) {
                            System.out.print(" x ");
                        }
                    }
                    System.out.println(" = " + hasilFactorial);
                } else {
                    System.out.println("Inputan tidak valid.");
                }
            } else {
                System.out.println("Inputan tidak valid.");
            }
        }
    }
}
