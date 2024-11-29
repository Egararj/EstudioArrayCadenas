package estudioArray;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TarjetaClave {
    public TarjetaClave(){
        System.out.println("Tarjeta clave");

        //Hace una nueva tarjeta
        int [][] tarjeta=tarjetaClave();

        //Imprime la tarjeta
        System.out.println("    A    B    C    D    E    F");
        for (int f=0; f<tarjeta.length; f++){
            System.out.printf((f+1)+" "+(Arrays.toString(tarjeta[f])));
            System.out.println();
        }
        //Obtiene la clave a acertar
        int clave=0;
        clave = posicionAleatoria(clave, tarjeta);
        
        //Intentos para acertar la clave
        boolean acierto=false;
        for (int x=3, intento=0; x>0; x--){
            System.out.println("Le quedan "+x+" intentos. Intruduzca la clave");
            Scanner sc=new Scanner(System.in);
            try{
            intento = sc.nextInt();
            if(intento==clave){
                acierto=true;
                break;
            }
            }
            catch (InputMismatchException e){
                System.out.println("Introduce solo números");
            }
            sc=null;
            
        }
        if(acierto) System.out.println("Has acertado");
        else System.out.println("Has fallado");
        
    }
                
            private int posicionAleatoria(int clave, int[][] tarjeta) {
                int f= (int) Math.floor(Math.random()*5);
                int c= (int) Math.floor(Math.random()*6);
                String columnaLetra="ABCDE";
                clave=tarjeta[f][c];
                System.out.println("La posición que tiene que acertar es: "+columnaLetra.charAt(c)+"-"+(f+1));
            
            return clave;
            }
        
            private int[][] tarjetaClave() {
                int [][] tarjeta= new int [5][6];
                int[] ale30= new int [30];
                boolean iguales=false;
                int ale=0;
        
                for (int x=0; x<30;x++){
                    do{
                        iguales=false;
                        ale=(int) Math.floor(Math.random()*(999-100+1)+100);
                        for (int y=0; y<=x; y++){
                            if(ale==ale30[y]) {
                                iguales=true;
                                break;
                            }
                        }
                    } while(iguales);
                    ale30[x]=ale;
                }    

                for (int f=0, x=0; f<tarjeta.length; f++){
                    for (int c=0; c<tarjeta[f].length; c++, x++){
                        tarjeta[f][c]=ale30[x];
                    }
                }
            return tarjeta;
            }
}
