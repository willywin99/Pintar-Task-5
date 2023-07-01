import java.util.Scanner;

public class LuasSegitiga {
  public static void main(String[] args) {
    try (Scanner inputScanner = new Scanner(System.in)) {
      System.out.print("Masukkan alas : ");
      double alas = inputScanner.nextInt();
      System.out.print("Masukkan tinggi : ");
      double tinggi = inputScanner.nextInt();

      System.out.print("Luas Segitiga : " + alas * tinggi / 2);
    }

    System.out.println();
  }
}
