package estudioArray;

import java.util.Arrays;

public class FraseEncriptada {
    public FraseEncriptada(){
        System.out.println("Frase encriptada");

        int[] clave = {3,4,9,7,2,0,1,8,6,5};
        String frase = "Atacaremos al amanecer en la primera luna de Marzo, Paco";

        System.out.println(frase);
        String fraseEncriptada = cifrado(frase,clave);
        System.out.println(fraseEncriptada);
        System.out.println("==============================");
        String fraseDesencriptada = descifrado(fraseEncriptada,clave);
        System.out.println(fraseDesencriptada);
        }
                
                    private String descifrado(String fraseEncriptada, int[] clave) {
                        String fraseDesencriptada="";
                        int posicionClave=0;

                        for (int x=0, y=0, trozo10=0; x<fraseEncriptada.length()+9; x++, y++){
                            if(y==10) {
                                y=0;
                                trozo10+=10;
                            }
                            for (int cont=0; cont<10; cont++){
                                if(cont==clave[y]) {
                                    posicionClave=cont;
                                    break;
                                }
                            }
                            try{
                            fraseDesencriptada+=fraseEncriptada.charAt(posicionClave+trozo10);
                            }
                            catch (Exception e){}
                        }
                        return fraseDesencriptada;
            }
        
                    private String cifrado(String frase, int[] clave) {
                        frase+="         ";
                        String fraseEncriptada="";
                        int posicionClave=0;

                        for (int x=0, y=0, trozo10=0; x<frase.length()+9; x++, y++){
                            if(y==10) {
                                y=0;
                                trozo10+=10;
                            }
                            for (int cont=0; cont<10; cont++){
                                if(y==clave[cont]) {
                                    posicionClave=cont;
                                    break;
                                }
                            }
                            try{
                            fraseEncriptada+=frase.charAt(posicionClave+trozo10);
                            }
                            catch (Exception e){}
                        }
                        return fraseEncriptada;
            }
}
