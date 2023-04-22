import java.util.Scanner;
public class TresNumeros{
       public static void main(String[] args){
    
              Scanner entrada = new Scanner(System.in);
              int a;
              int b;
              int c;
              System.out.println("¿Cual es el primer numero");
              a = entrada.nextInt();
              System.out.println("¿Cual es el segundo numero");
              b = entrada.nextInt();
              System.out.println("¿Cual es el tercer numero");
              c = entrada.nextInt();
        
              if(a>b && a>c){
                   System.out.println("El numero mayor es a");

              }else if(b>a && b>c){
                   System.out.println("El numero mayor es b");
              }else if(c>a && c>b){
                   System.out.println("El numero mayor es c");  
              }else{
                   System.out.println("todos los numeros son iguales");   
              }

    }

}