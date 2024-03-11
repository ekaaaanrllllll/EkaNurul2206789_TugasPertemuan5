package pkg2206789_eka.nurul_pertemuan.pkg5;
import java.util.Scanner;

public class Soal1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int N = scanner.nextInt();

        // Memanggil fungsi untuk menampilkan hasil penjumlahan deret
        tampilkanPenjumlahanDeret(N);
    }

    // Fungsi untuk menampilkan hasil penjumlahan deret
    static void tampilkanPenjumlahanDeret(int N) {
        int hasil = 0;

        // Untuk menjumlahkan nilai dari 1 hingga N
        for (int i = 1; i <= N; i++) {
            hasil += i;

            // Menampilkan setiap penambahan dalam deret
            if (i == 1) {
                System.out.print(i);
            } else {
                System.out.print(" + " + i);
            }
        }
        System.out.println(" = " + hasil);
    }
}
