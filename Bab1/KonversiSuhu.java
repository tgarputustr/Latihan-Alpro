package Bab1;

import java.util.Scanner;

public class KonversiSuhu {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan suhu (dalam celcius): ");
            double celcius = scanner.nextDouble();

            double fahrenheit = 9 * celcius / 5 + 32;
            System.out.println("Hasil konversi suhu dari celcius ke fahrenheit: " +fahrenheit);

            double reamur = 4 * celcius / 5;
            System.out.println("Hasil konversi suhu dari celcius ke reamur: " +reamur);

            double kelvin = celcius + 273;
            System.out.println("Hasil konversi suhu dari celcius ke kelvin: " +kelvin);
        }

    }

    
}
