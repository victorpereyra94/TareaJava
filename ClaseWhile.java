import java.util.Scanner;
public class ClaseWhile{
       public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int option =5;
        while(option!=5){
                 System.out.println ("1); Lavar");
                 System.out.println ("2); Secado Regular");
                 System.out.println ("3); Secado Rapido");
                 System.out.println ("4); Vaciar Lavadora");
                 System.out.println ("5); EXIT");
                 option = entrada.nextInt();

                switch(option){
                case 1:
                        System.out.println("Lavando...");
                        break;
                case 2:        
                        System.out.println("Secando Regular...");
                        break;
                case 3:
                        System.out.println("Secando Rapido...");
                        break;
                case 4:
                        System.out.println("Vaciando Lavadora...");
                        break;
                case 5:
                        System.out.println("EXIT");
                        break;
               
                }


        
        
                } 
    }

}