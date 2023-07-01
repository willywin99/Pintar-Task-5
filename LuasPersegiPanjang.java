import java.util.Scanner;

public class LuasPersegiPanjang {
  public static void main(String[] args) {
    try (Scanner inputScanner = new Scanner(System.in)) {
      System.out.print("Masukkan panjang : ");
      double panjang = inputScanner.nextDouble();
      System.out.print("Masukkan lebar : ");
      double lebar = inputScanner.nextDouble();

      System.out.println("Luas Persegi Panjang = " + panjang * lebar);
    }

    System.out.println();
  }
}
