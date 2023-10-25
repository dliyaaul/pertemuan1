import java.util.Scanner;

public class hello_word {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int nilaiSemester;
        System.out.print("Silahkan Input:");
        nilaiSemester = scanner.nextInt();
        System.out.print("Hasil Input : ");
        System.out.println(nilaiSemester);

        String nama = "Zidan";
        int nim = 1201230024;
        char nilai = 'A';
        String kelas;

        if (nim > 1) {
            System.out.println("Admin");
        }

        if (nama == "Zidan") {
            System.out.println("Hello Zidan");
        } else if (nama != "Zidan") {
            System.out.println("Hello Seta");
        } else {
            System.out.println("Kamu Siapa?");
        }

        System.out.println(nama + " " + nim + " " + nilai);
    }
}