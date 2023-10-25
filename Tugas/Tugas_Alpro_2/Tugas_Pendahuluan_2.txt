import java.util.Scanner;

public class tukarNilai {
    public static void main(String[] args) {
        int A = 100;
        int B = 99;
        int C = 0;
        boolean nilai = true;

        Scanner input = new Scanner(System.in);

        System.out.println("Nilai Variabel A adalah " + A);
        System.out.println("Nilai Variabel B adalah " + B);
        System.out.print("Tukar Nilai Variabel (y/n)? ");
        String tukar = input.nextLine();
        nilai = tukar.equals("y");

        if (nilai == true) {
            A = A ^ B;
            B = A ^ B;
            C = B ^ C;
            A = A ^ B;

            System.out.println("<-----Nilai Sesudah di Tukar----->");
            System.out.println("Nilai Variabel A adalah " + A);
            System.out.println("Nilai Variabel B adalah " + B);
        } else {
            System.out.println("Silahkan Ulangi Kode Program!");
        }
    }
}
