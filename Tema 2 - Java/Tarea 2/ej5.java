import java.util.Scanner;

public class ej5 {

  public static void main(String[] args) {

      System.out.println("Crea un programa que pida al usuario una temperatura en" +
              " grados centígrados y calcule (y muestre) a cuántos grados Fahrenheit equivalen (F = 9*C/5 + 32)");


      double numF;
      Scanner sc = new Scanner(System.in);

      System.out.println("Introduce la temperatura en grados Fahrenheit");

      numF = sc.nextDouble();


      System.out.println(numF+" grados Fahrenheit son "+(numF-32)*5/9+" grados Celsius");

  }
}
