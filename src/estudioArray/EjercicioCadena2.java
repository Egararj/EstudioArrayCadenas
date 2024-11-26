package estudioArray;

public class EjercicioCadena2 {
    public EjercicioCadena2(){
        System.out.println("Ejercicio cadena 2");
        String frase= "ana asa an";
        frase=frase.trim();


        String frase2= volteaFrase(frase);
        if(frase.equalsIgnoreCase(frase2))
        System.out.println("Es palíndroma");
        else
        System.out.println("No es palíndroma");
            }
        
            private String volteaFrase(String frase) {
                String frase2= "";

                for (int x=frase.length()-1; x>=0; x--){
                    frase2=frase2+frase.charAt(x);
                }
                return frase2;
            }
}
