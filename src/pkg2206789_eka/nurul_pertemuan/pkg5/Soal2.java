package pkg2206789_eka.nurul_pertemuan.pkg5;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai batasAwal: ");
        int batasAwal = scanner.nextInt();

        System.out.print("Masukkan nilai batasAkhir: ");
        int batasAkhir = scanner.nextInt();

        tampilkanBanyakBilanganGanjil(batasAwal, batasAkhir);
    }

    //Fungsi untuk menampilkan banyaknya bilangan ganjil
    static void tampilkanBanyakBilanganGanjil(int batasAwal, int batasAkhir) {
        int jumlahGanjil = 0;

        //Menghitung banyaknya bilangan ganjil
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 != 0) {
                jumlahGanjil++;
            }
        }
        
        System.out.println("Banyaknya bilangan ganjil dari " + batasAwal + " hingga " + batasAkhir + " adalah: " + jumlahGanjil);
    }
}

