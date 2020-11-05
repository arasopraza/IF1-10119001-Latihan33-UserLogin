import java.util.Scanner;
/**
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: Program ini menampilkan daftar film
 * sesuai dengan implementasi OOP dan class diagram
 */

public class Latihan33Login {
    private static String usName, passWord;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Username : ");
        usName = scanner.next();
        System.out.print("Masukkan Password : ");
        passWord = scanner.next();

        User user = new User();
        user.pengecekanLogin(usName, passWord);
    }
}

