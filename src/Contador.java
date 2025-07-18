import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numero1;
        int numero2;
      boolean entradaValida = false;
      while (!entradaValida) {
          try {
              System.out.println("Digite um valor: ");
              numero1 = input.nextInt();
              System.out.println("Digite outro valor: ");
              numero2 = input.nextInt();

              contar(numero1,numero2);
              entradaValida = true;
          }catch (InputMismatchException e){
              System.out.println("Digite um valor que seja um numero inteiro");
              input.nextLine();
          }
          catch(ParametrosInvalidosException e){
              System.out.println(e.getMessage());
          }

      }



    }
    static void contar(int numero1, int numero2) throws ParametrosInvalidosException{
        if(numero1>numero2){
            throw  new ParametrosInvalidosException();
        }
        int contador = numero2-numero1;
        for(int i= 1; i<=contador; i++){
            System.out.println("imprimindo o numero" + i);
        }
    }
}
