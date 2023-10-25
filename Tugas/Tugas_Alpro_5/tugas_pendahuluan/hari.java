package Tugas.Tugas_Alpro_5.tugas_pendahuluan;

import java.util.Scanner;

class day {
    public static void main(String[] args) {
        hari hr = new hari();
        hr.HariIni();
    }
}

public class hari {
    String Hari[] = { "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu" };
    int day = -1;
    boolean ulang = true;

    Scanner bln = new Scanner(System.in);

    public void HariIni() {
        System.out.print("\nMasukkan nama hari, Contoh (Senin): ");
        String HariInput = bln.nextLine();

        HariInput = HariInput.toLowerCase();

        for (int i = 0; i < Hari.length; i++) {
            if (Hari[i].toLowerCase().equals(HariInput)) {
                day = i;
                break;
            }
        }

        if (day >= 0) {
            int indeksHariLusa = (day + 2) % Hari.length;
            String hariLusa = Hari[indeksHariLusa];
            System.out.println("\nSekarang Hari         : " + HariInput);
            System.out.println("Dan Lusa Adalah Hari  : " + hariLusa);
        } else {
            System.out.println("\nHari yang Anda masukkan tidak valid.");
        }

        ulang();
    }

    public void ulang() {
        System.out.print("\nApakah Ingin Mengulang (y/n)? ");
        String pilihan = bln.nextLine();
        ulang = pilihan.equals("y");
        if (ulang == true) {
            HariIni();
        } else {
            System.exit(0);
        }
    }
}
