import java.util.Scanner;

public class LuasLingkaran {
  public static void main(String[] args) {
    try (Scanner inputScanner = new Scanner(System.in)) {
      final double phi = 3.14;

      System.out.print("Masukkan jari-jari(r) : ");
      double r = inputScanner.nextDouble();

      System.out.print("Luas Lingkaran = " + phi * r * r);
    }

    System.out.println();
  }
}
