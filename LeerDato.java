/*determina el horoscopo de la persona*/

import java.util.Scanner;
public class LeerDato{
       public static void main(String[] args){
              String name;
              int edad;
              int mes;
              int dia;
              Scanner entrada = new Scanner(System.in);

              System.out.println("¿Cual es tu nombre?");
              name = entrada.nextLine();
              System.out.println("Hola " + name);
              System.out.println("¿Cual es tu edad?");
              edad = entrada.nextInt();
              System.out.println("¿Cual es tu mes?");
              mes = entrada.nextInt();
              System.out.println("¿Cual es tu dia?");
              dia = entrada.nextInt();

              if(mes == 4){
                     if(dia>=20){
                             System.out.println("Tauro");
                     }
                      else{
                             System.out.println("No es Tauro");
                      }
              

              }else{
                     if(mes==5){
                             if(dia>=20){
                                     System.out.println("Geminis");
                             }else{
                                     System.out.println("No Geminis");
                             }       
                     }     
              }
              
}

}
