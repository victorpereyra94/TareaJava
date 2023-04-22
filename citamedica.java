public class citamedica{

    public static void main(String[] args){

           String paymentMethod = "visa";
           String bankName = "bancoLeon";
    
            if(paymentMethod == "visa"){
                     System.out.println("hacer cita medica");
                        if(bankName == "bancoLeon"){
                                 System.out.println("puede pagar cita medica en 2 pagos sin intereses");
                        
                        }else{
                                 System.out.println("no puede pagar cita medica en cuotas");
                        }
                    
                    
                       }else{
                     System.out.println("escalar al departamento principal para verificar metodo de pago");
            }
    
    
    
    
        }

}