package Bab1;

import java.util.Scanner;

public class GanjilOrGenap {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan angka untuk dicek: ");
            int angka = scanner.nextInt();

            if (angka % 2 == 1) {
                System.out.print(angka + " adalah bilangan ganjil");
            } else {
                System.out.print(angka + " adalah bilangan genap");
            }
        }
    }
}
