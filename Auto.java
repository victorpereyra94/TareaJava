public class Auto{
       String marca;
       int velocidad;

       public Auto(String marca, int velocidad){
              this.marca = marca;
              this.velocidad = velocidad;

       }

       public void acelerador(){
       System.out.println("La marca " + this.marca + " se mueve a" + this.velocidad + "km/h");  
       }


    }