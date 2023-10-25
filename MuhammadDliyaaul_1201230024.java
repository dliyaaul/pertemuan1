import java.util.Scanner;

public class MuhammadDliyaaul_1201230024 {
    public static void main(String[] args) {
        int bil;
        boolean ulang = true;

        while (ulang) {
            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan Bilangan : ");
            bil = input.nextInt();

            if (bil % 2 != 0) {
                System.out.println("Hasil Bilangan = " + bil + " Adalah Bilangan Ganjil");
            } else {
                System.out.println("Hasil Bilangan = " + bil + " Adalah Bilangan Genap");
            }

            System.out.print("Apakah Ingin Mengulang (y/n)? ");
            String pilihan = input.next();
            ulang = pilihan.equals("y");
        }

        return;
    }
}
