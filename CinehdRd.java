public class CinehdRd{
       public static void main(String[] args){
       boolean iniciaSesion = true;
       boolean descargarPeliculas = true;

       if(iniciaSesion){
               System.out.println("si utiliza email address puede disfrutar peliculas en hd");
                        if(descargarPeliculas){
                                 System.out.println("si se puede loguear normalmente puede descargar peliculas");
                        }else{
                                 System.out.println("no puede descargar peliculas");
                        }
       
            }else{
               System.out.println("puede ver peliculas pero en formato estandar");
       }
    
    }