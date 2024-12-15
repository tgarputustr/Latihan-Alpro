package Bab1;
import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan jari-jari lingkaran: ");
            double r = scanner.nextDouble();
            
            double phi = 3.14;
            double luas = phi * r * r;

            System.out.println("Luas Lingkaran: " + luas);
        }
    }
    
}