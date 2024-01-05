package Tugas.login;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

class Admin {
    private int id;
    private String username;
    private String password;

    public Admin(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

// class customer {
// private String username, password, confirmPass;

// Scanner inp = new Scanner(System.in);

// public customer(String username, String password, String confirmPass) {

// }

// public String getUsernameCustomer() {
// return username;
// }

// public String getPasswordCustomer() {
// return password;
// }

// public String getConfirmPassCustomer() {
// return confirmPass;
// }
// }

class Pembeli {
    private int id;
    private String nama;
    private boolean statusPemenang;

    public Pembeli(int id, String nama) {
        this.id = id;
        this.nama = nama;
        this.statusPemenang = false;
    }

    public void setPassword(String nama) {
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public void setStatusPemenang(boolean status) {
        this.statusPemenang = status;
    }

    public boolean getStatusPemenang() {
        return statusPemenang;
    }
}

class Barang {
    private int idBarang;
    private String namaBarang;
    private double hargaAwal;
    private String status;

    public Barang(int idBarang, String namaBarang, double hargaAwal, String status) {
        this.idBarang = idBarang;
        this.namaBarang = namaBarang;
        this.hargaAwal = hargaAwal;
        this.status = status;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public void setHargaAwal(double hargaAwal) {
        this.hargaAwal = hargaAwal;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIdBarang() {
        return idBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public double getHargaAwal() {
        return hargaAwal;
    }

    public String getStatus() {
        return status;
    }

    public void setMinimalPenawaran(double minimalPenawaran) {
    }

    public void setMaximalPenawaran(double maximalPenawaran) {
    }
}

class Penawaran {
    private int id;
    private double hargaTawar;

    public Penawaran(int id, double hargaTawar) {
        this.id = id;
        this.hargaTawar = hargaTawar;
    }

    public int getId() {
        return id;
    }

    public double getHargaTawar() {
        return hargaTawar;
    }
}

public class Lelang {
    int id;
    String un, pw;
    ArrayList<Barang> listBarang = new ArrayList<>();
    ArrayList<Pembeli> listPembeli = new ArrayList<>();
    ArrayList<Admin> admins = new ArrayList<>();

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(isr);
    Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
        Lelang l = new Lelang();
        l.menu();
    }

    public void menu() {
        int pilihan = 0;
        boolean loggedIn = false;
        admins.add(new Admin(1, "admin", "admin"));

        while (pilihan != 3) {
            System.out.println("=== SELAMAT DATANG DI APLIKASI LELANG ===");
            System.out.println("| 1. Login                              |");
            System.out.println("| 2. Daftar                             |");
            System.out.println("| 3. Keluar Aplikasi                    |");
            System.out.println("=========================================");
            System.out.println();
            System.out.print("Masukkan pilihan [1-3] : ");
            pilihan = inp.nextInt();

            if (pilihan == 1) {
                loggedIn = loginAdmin();
                if (loggedIn) {
                    System.out.println("\nUsername Ditemukan, Login Success!");
                    menuUtama();
                } else {
                    System.out.println("Login gagal. Periksa Kembali Username / Password Anda.");
                }
            } else if (pilihan == 2) {
                loggedIn = loginCustomer();
                if (loggedIn) {
                    System.out.println("\nDaftar Success!");
                    System.out.println("Silahkan Login Kembali!");
                    menuUtama();
                } else {
                    System.out.println("Pendaftaran gagal. Kembali ke menu awal.");
                }
            } else if (pilihan == 3) {
                System.out.println("Keluar dari aplikasi lelang...");
            } else {
                System.out.println("Terima Kasih");
                break;
            }
        }
    }

    public boolean loginAdmin() {
        System.out.println();
        System.out.print("Masukkan username : ");
        un = inp.next();
        System.out.print("Masukkan password : ");
        pw = inp.next();
        for (Admin admin : admins) {
            if (admin.getUsername().equals(un) && admin.getPassword().equals(pw)) {
                System.out.println("Login berhasil. Selamat datang, " + un + "!");
                return true;
            }
        }
        return false;
    }

    public boolean loginCustomer() {
        id = 0;
        System.out.println();
        System.out.print("Masukkan username : ");
        un = inp.next();
        System.out.print("Masukkan password : ");
        pw = inp.next();
        while (id <= admins.size()) {
            id++;
        }
        admins.add(new Admin(id, un, pw));
        Admin a = new Admin(id, un, pw);
        if (un.equals(a.getUsername()) && pw.equals(a.getPassword())) {
            return true; // Return true jika login berhasil
        } else {
            return false; // Return false jika login gagal
        }
    }

    // if (customers) {
    // return true; // Return true jika login berhasil
    // } else {
    // return false; // Return false jika login gagal
    // }

    public void menuUtama() {
        while (true) {
            System.out.println();
            System.out.println("==================================");
            System.out.println("|           MENU UTAMA           |");
            System.out.println("==================================");
            System.out.println("|1. Lihat Data login             |");
            System.out.println("|2. Tambahkan Barang Lelang      |");
            System.out.println("|3. Lihat Data Barang Lelang     |");
            System.out.println("|4. Edit Barang Lelang           |");
            System.out.println("|5. Tambahkan Pembeli            |");
            System.out.println("|6. Lihat Data Pembeli           |");
            System.out.println("|7. Tambah Data Pemenang         |");
            System.out.println("|8. Status Pemenang              |");
            System.out.println("|9. Kembali                      |");
            System.out.println("==================================");
            System.out.println();
            System.out.print("Masukkan Pilihan Anda [1-9] : ");
            int pilihan = inp.nextInt();

            switch (pilihan) {
                case 1:
                    dataLogin();
                    break;
                case 2:
                    tambahBarang();
                    break;
                case 3:
                    lihatBarang();
                    break;
                case 4:
                    editBarang();
                    break;
                case 5:
                    tambahPembeli();
                    break;
                case 6:
                    lihatDataPembeli();
                    break;
                case 7:
                    tambahPemenang();
                    break;
                case 8:
                    statusPemenang();
                    break;
                case 9:
                    System.out.println("Kembali ke Menu Lobby...");
                    return;
                default:
                    System.out.println("Inputan Tidak Valid...");
                    break;
            }
        }
    }

    private void dataLogin() {
        System.out.println("\n==================================");
        System.out.println("|            Data Login          |");
        System.out.println("==================================");

        if (admins.isEmpty()) {
            System.out.println("Belum ada data Login yang ditambahkan.");
        } else {
            System.out.println("|Daftar Data Login :             |");
            System.out.println("==================================");
            for (Admin admin : admins) {
                System.out.println("ID             : " + admin.getId());
                System.out.println("Username       : " + admin.getUsername());
                System.out.println("Password       : " + admin.getPassword());
                System.out.println("==================================");
            }
        }
        pressEnter();
    }

    private void statusPemenang() {
        System.out.println("===== Status Pemenang =====");
        boolean pemenangDitemukan = false;

        for (Pembeli pembeli : listPembeli) {
            if (pembeli.getStatusPemenang()) {
                pemenangDitemukan = true;
                System.out
                        .println("Pemenang: ID Pembeli - " + pembeli.getId() + ", Nama Pembeli - " + pembeli.getNama());
                break;
            }
        }

        if (!pemenangDitemukan) {
            System.out.println("Belum ada pemenang yang ditetapkan.");
            menuUtama();
        }
    }

    private void tambahPemenang() {
        JOptionPane.showMessageDialog(null, "===== Tetapkan Pemenang =====");

        String idPemenangStr = JOptionPane.showInputDialog("Masukkan ID Pembeli yang menjadi pemenang: ");
        int idPemenang;
        try {
            idPemenang = Integer.parseInt(idPemenangStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID Pembeli harus berupa angka.");
            return;
        }

        boolean found = false;
        for (Pembeli pembeli : listPembeli) {
            if (pembeli.getId() == idPemenang) {
                found = true;
                pembeli.setStatusPemenang(true);
                JOptionPane.showMessageDialog(null, "Pemenang telah ditetapkan.");
                break;
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(null, "Pembeli dengan ID tersebut tidak ditemukan.");
        }
    }

    private void lihatDataPembeli() {
        StringBuilder displayData = new StringBuilder("===== Data Pembeli =====\n");

        if (listPembeli.isEmpty()) {
            displayData.append("Belum ada data pembeli yang ditambahkan.");
        } else {
            displayData.append("Daftar Data Pembeli:\n");
            for (Pembeli pembeli : listPembeli) {
                displayData.append("ID Pembeli: ").append(pembeli.getId()).append("\n");
                displayData.append("Nama Pembeli: ").append(pembeli.getNama()).append("\n");
                displayData.append("===========================\n");
            }
        }

        JOptionPane.showMessageDialog(null, displayData.toString());
    }

    public void tambahPembeli() {
        JOptionPane.showMessageDialog(null, "===== Tambah Pembeli =====");

        String idPembeliStr = JOptionPane.showInputDialog("Masukkan ID Pembeli: ");
        int idPembeli;
        try {
            idPembeli = Integer.parseInt(idPembeliStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID Pembeli harus berupa angka.");
            return;
        }

        String namaPembeli = JOptionPane.showInputDialog("Masukkan Nama Pembeli: ");

        Pembeli pembeli = new Pembeli(idPembeli, namaPembeli);
        listPembeli.add(pembeli);

        JOptionPane.showMessageDialog(null,
                "Pembeli berhasil ditambahkan:\nID Pembeli: " + idPembeli + "\nNama Pembeli: " + namaPembeli);
    }

    public void editBarang() {
        JOptionPane.showMessageDialog(null, "===== Edit Barang Lelang =====");

        String idBarangEditStr = JOptionPane.showInputDialog("Masukkan ID barang yang akan diedit: ");
        int idBarangEdit;
        try {
            idBarangEdit = Integer.parseInt(idBarangEditStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID Barang harus berupa angka.");
            return;
        }

        boolean found = false;
        for (Barang barang : listBarang) {
            if (barang.getIdBarang() == idBarangEdit) {
                found = true;

                String editOptions = "Pilihan yang dapat diedit:\n" +
                        "1. Nama Barang\n" +
                        "2. Harga Awal\n" +
                        "3. Status Barang\n" +
                        "Masukkan pilihan untuk edit: ";
                String pilihanEditStr = JOptionPane.showInputDialog(editOptions);
                int pilihanEdit;
                try {
                    pilihanEdit = Integer.parseInt(pilihanEditStr);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Pilihan harus berupa angka.");
                    return;
                }

                switch (pilihanEdit) {
                    case 1:
                        String newNamaBarang = JOptionPane.showInputDialog("Masukkan Nama Barang Baru: ");
                        barang.setNamaBarang(newNamaBarang);
                        JOptionPane.showMessageDialog(null, "Nama Barang berhasil diubah.");
                        break;
                    case 2:
                        String hargaAwalStr = JOptionPane.showInputDialog("Masukkan Harga Awal Baru: ");
                        double newHargaAwal;
                        try {
                            newHargaAwal = Double.parseDouble(hargaAwalStr);
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(null, "Harga Awal harus berupa angka.");
                            return;
                        }
                        barang.setHargaAwal(newHargaAwal);
                        JOptionPane.showMessageDialog(null, "Harga Awal berhasil diubah.");
                        break;
                    case 3:
                        String newStatus = JOptionPane.showInputDialog("Masukkan Status Barang Baru: ");
                        barang.setStatus(newStatus);
                        JOptionPane.showMessageDialog(null, "Status Barang berhasil diubah.");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Pilihan tidak valid.");
                        break;
                }
                break;
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(null, "Barang dengan ID tersebut tidak ditemukan.");
        }
    }

    public void tambahBarang() {
        JOptionPane.showMessageDialog(null, "===== Tambah Barang Lelang =====");

        String idBarangStr = JOptionPane.showInputDialog("Masukkan ID barang: ");
        int idBarang;
        try {
            idBarang = Integer.parseInt(idBarangStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ID Barang harus berupa angka.");
            return;
        }

        String namaBarang = JOptionPane.showInputDialog("Masukkan Nama Barang: ");
        String hargaAwalStr = JOptionPane.showInputDialog("Masukkan Harga Awal: ");
        double hargaAwal;
        try {
            hargaAwal = Double.parseDouble(hargaAwalStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Harga Awal harus berupa angka.");
            return;
        }

        String status = JOptionPane.showInputDialog("Masukkan Status Barang: ");

        Barang barang = new Barang(idBarang, namaBarang, hargaAwal, status);
        listBarang.add(barang);

        JOptionPane.showMessageDialog(null, "Barang berhasil ditambahkan ke daftar lelang.");
    }

    public void lihatBarang() {
        StringBuilder displayData = new StringBuilder("===== Data Barang Lelang =====\n");

        if (listBarang.isEmpty()) {
            displayData.append("Belum ada barang yang ditambahkan.");
        } else {
            displayData.append("Daftar Barang Lelang:\n");
            for (Barang barang : listBarang) {
                displayData.append("ID Barang: ").append(barang.getIdBarang()).append("\n");
                displayData.append("Nama Barang: ").append(barang.getNamaBarang()).append("\n");
                displayData.append("Harga Awal: ").append(barang.getHargaAwal()).append("\n");
                displayData.append("Status Barang: ").append(barang.getStatus()).append("\n");
                displayData.append("===========================\n");
            }
        }

        JOptionPane.showMessageDialog(null, displayData.toString());
    }

    public void pressEnter() {
        try {
            System.out.print("\nTekan enter untuk kembali ke Menu Utama!");
            input.readLine();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ArrayList<Barang> getListBarang() {
        return listBarang;
    }

    public void setListBarang(ArrayList<Barang> listBarang) {
        this.listBarang = listBarang;
    }

    public ArrayList<Pembeli> getListPembeli() {
        return listPembeli;
    }

    public void setListPembeli(ArrayList<Pembeli> listPembeli) {
        this.listPembeli = listPembeli;
    }

    public ArrayList<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(ArrayList<Admin> admins) {
        this.admins = admins;
    }

    public InputStreamReader getIsr() {
        return isr;
    }

    public void setIsr(InputStreamReader isr) {
        this.isr = isr;
    }

    public BufferedReader getInput() {
        return input;
    }

    public void setInput(BufferedReader input) {
        this.input = input;
    }

    public Scanner getInp() {
        return inp;
    }

    public void setInp(Scanner inp) {
        this.inp = inp;
    }
}
