import java.util.Scanner;
public class PositivoNegativo{
       public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);
                  int numero;
                  System.out.println("¿Cual es el numero?");
                  numero = entrada.nextInt();
                  
                  if(numero==0){
                         System.out.println("SU NUMERO ES 0");
                  }else if(numero<0){
                         System.out.println("SU NUMERO ES NEGATIVO");
                  }else if(numero>0){
                         System.out.println("SU NUMERO ES POSITIVO");
                  }
       }


}