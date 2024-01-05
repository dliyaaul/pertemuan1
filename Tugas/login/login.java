package Tugas.login;

import java.util.ArrayList;
import java.util.Scanner;

class User {
    private String username;
    private String password, confirm_password;

    public User(String username, String password, String confirm_password) {
        this.username = username;
        this.password = password;
        this.confirm_password = confirm_password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirm_password;
    }
}

public class login {
    private static ArrayList<User> users = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Exit");
        System.out.print("Pilih menu: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                register();
                break;
            case 2:
                loginUser();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }

    private static void register() {
        System.out.println();
        System.out.print("Masukkan Username : ");
        String username = scanner.next();
        System.out.print("Masukkan Password : ");
        String password = scanner.next();
        System.out.print("Masukkan Confirm Password : ");
        String confirm_password = scanner.next();

        if (confirm_password == password) {
            User newUser = new User(username, password, confirm_password);
            users.add(newUser);
            System.out.println("Registrasi berhasil.");
            System.out.println();
            // System.out.println("Ingin Logout?");
            // String logout = scanner.next();
            // if (logout == "ya") {
            // main(null);
            // } else {
            // System.out.println("Kode tidak valid");
            // }
        } else if (password != confirm_password) {
            System.out.println();
            System.out.println("Confirm Password harus sama dengan Password!");
        }
    }

    private static void loginUser() {
        users.add(new User("admin", "12345", "12345"));
        System.out.println();
        System.out.print("Masukkan username: ");
        String username = scanner.next();
        System.out.print("Masukkan password: ");
        String password = scanner.next();

        boolean isLoggedIn = false;
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("Login berhasil. Selamat datang, " + username + "!");
                isLoggedIn = true;
                break;
            }
        }

        if (!isLoggedIn) {
            System.out.println();
            System.out.println("Login gagal. Username atau password salah.");
            loginUser();
        }
    }
}
