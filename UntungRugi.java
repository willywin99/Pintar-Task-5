import java.util.Scanner;

public class UntungRugi {
  public static void main(String[] args) {
    try (Scanner inputScanner = new Scanner(System.in)) {
      System.out.print("Masukkan harga beli : ");
      double beli = inputScanner.nextDouble();
      System.out.print("Masukkan harga jual : ");
      double jual = inputScanner.nextDouble();

      if (jual > beli) {
        System.out.print("untung sebesar : " + (jual - beli));
      } else if (beli > jual) {
        System.out.print("rugi sebesar : " + (beli - jual));
      } else {
        System.out.print("sama aja");
      }
    }

    System.out.println();
  }
}
