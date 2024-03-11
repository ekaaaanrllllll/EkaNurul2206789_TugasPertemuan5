package pkg2206789_eka.nurul_pertemuan.pkg5;
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        tampilkanFaktorial(n);
    }

    // Fungsi untuk menghitung faktorial dan menampilkannya
    static void tampilkanFaktorial(int n) {
        if (n == 0) {
            System.out.println("0! = 1");
            return;
        }

        int hasil = 1;
        System.out.print(n + "! = ");

        // Untuk menghitung faktorial
        for (int i = n; i >= 1; i--) {
            hasil *= i;

            // Menampilkan setiap perkalian dalam faktorial
            if (i == 1) {
                System.out.print(i);
            } else {
                System.out.print(i + "*");
            }
        }
        
        System.out.println(" = " + hasil);
    }
}
