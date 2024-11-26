package estudioArray;

import excepciones.DniException;

public class EjercicioCadena3 {
    public EjercicioCadena3(){
        System.out.println("Ejercicio cadena 3");

        String dni ="21150568K";

        
        try {
            compruebaDni(dni);
        } catch (DniException e) {
            System.out.println("Error: "+e.getMessage());
        }
    
            }
        
            private void compruebaDni(String dni) throws DniException {
                int dniNumeros=0, resto=0;
                String dniLetra;
                String[] letras={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};

                //comprueba la longitud
                if(dni.length()!=9){
                    throw new DniException();
                }
                //comprueba los números
                try{
                dniNumeros=Integer.parseInt(dni.substring(0, 8));
                }
                catch (NumberFormatException e){
                    throw new DniException();
                }
                //obtiene la letra
                dniLetra=dni.substring(8,9);
                
                resto=dniNumeros%23;

                if(!letras[resto].equals(dniLetra)){
                    throw new DniException();
                }
                 
            }
}   