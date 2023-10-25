package Tugas.Latihan;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Waktu {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan waktu awal (HH:mm:ss): ");
        String waktuAwalStr = scanner.nextLine();

        System.out.print("Masukkan waktu akhir (HH:mm:ss): ");
        String waktuAkhirStr = scanner.nextLine();

        try {
            // Waktu awal
            Date waktuAwal = dateFormat.parse(waktuAwalStr);
            // Waktu akhir
            Date waktuAkhir = dateFormat.parse(waktuAkhirStr);

            // Menghitung selisih waktu dalam milidetik
            long selisihMilidetik = waktuAkhir.getTime() - waktuAwal.getTime();

            // Menghitung selisih waktu dalam jam
            long selisihJam = selisihMilidetik / (60 * 60 * 1000);

            // Menghitung selisih waktu dalam menit
            long selisihMenit = (selisihMilidetik / (60 * 1000)) % 60;

            // Menghitung selisih waktu dalam detik
            long selisihDetik = (selisihMilidetik / 1000) % 60;

            System.out.println(
                    "Selisih waktu: " + selisihJam + " jam, " + selisihMenit + " menit, " + selisihDetik + " detik");
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
