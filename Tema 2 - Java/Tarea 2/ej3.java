import java.util.Scanner;

public class ej3 {

  public static void main(String[] args) {
    //


      Scanner sc = new Scanner(System.in);
      int num1;
      int num2;
      int resultado;




    System.out.println("Introduce un número: ");
    num1 = sc.nextInt();

    System.out.println("Introduce otro número: ");
    num2 = sc.nextInt();

    resultado = num1 % num2;

    System.out.println("El resto de dividir "+num1+" y "+num2+" es de: "+resultado );
  }
}
