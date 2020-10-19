import java.util.Scanner;

public class ej4 {

  public static void main(String[] args) {
      System.out.println("Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3) y " +
              "calcule su equivalencia en metros (1 milla = 1609 m)");

      int numMilla;
      Scanner sc = new Scanner(System.in);


      System.out.println("Por favor, introduzca una longitud en millas: ");
      numMilla = sc.nextInt();

      int equivalencia = numMilla*1609;

      if (numMilla == 1){
          System.out.println(numMilla+" milla son "+equivalencia+" metros");
      } else{
          System.out.println(numMilla+" millas son "+equivalencia+ " metros");
      }








      //
  }
}
