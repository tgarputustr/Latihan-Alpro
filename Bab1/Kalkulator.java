package Bab1;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            //pilih operasi hitung
            System.out.println("Kalkulator");
            System.out.println("1. Perkalian");
            System.out.println("2. Pembagian");
            System.out.println("3. Penjumlahan");
            System.out.println("4. Pengurangan");
            System.out.println("5. Modulus");
            System.out.print("Pilih opsi kalkulator: ");
            int pilihan = scanner.nextInt();

            //tentukan angka
            System.out.print("Masukkan angka ke 1: ");
            double angka1 = scanner.nextDouble();
            System.out.print("Masukkan angka ke 2: ");
            double angka2 = scanner.nextDouble();

            //pemilihan operasi
            switch (pilihan) {
                case 1:
                    double kali = angka1 * angka2;
                    System.out.println("Hasil Perkalian: " +kali);
                    break;
                case 2:
                    double bagi = angka1 / angka2;
                    System.out.println("Hasil Pembagian: " +bagi);
                    break;
                case 3:
                    double tambah = angka1 + angka2;
                    System.out.println("Hasil Penjumlahan: " +tambah);
                    break;
                case 4:
                    double kurang = angka1 - angka2;
                    System.out.println("Hasil Pengurangan: " +kurang);
                    break;
                case 5:
                    double mod = angka1 % angka2;
                    System.out.println("Hasil Modulus: " +mod);
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
    }
}
