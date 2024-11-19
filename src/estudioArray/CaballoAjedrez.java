package estudioArray;

import java.util.Arrays;
import java.util.Scanner;

public class CaballoAjedrez {
    public CaballoAjedrez() {
        System.out.println("Caballo de Ajedrez");
        Scanner posicion=new Scanner(System.in);
        posicion=null;

        int[][] tablero = new int[8][8];
        int f=0, c=0;

        System.out.println("Indique la fila en la que está el caballo");
        posicion = new Scanner(System.in);
        f=posicion.nextInt()-1;
        System.out.println("Indique la columna en la que está el caballo");
        posicion = new Scanner(System.in);
        c=posicion.nextInt()-1;

        tablero[f][c]=1;

        movimientosCaballos(tablero, f, c);

        for (int i=0; i<tablero.length; i++){
            System.out.println(Arrays.toString(tablero[i]));
        }
                
        }
        
        private void movimientosCaballos(int[][] tablero, int f, int c) {
            //Hacia arriba
            if((f-2)>=0){
                if((c-1)>=0)
                    tablero[f-2][c-1]=5;
                if((c+1)<=7)
                    tablero[f-2][c+1]=5;
            }
            //Hacia abajo
            if((f+2)<=7){
                if((c-1)>=0)
                    tablero[f+2][c-1]=5;
                if((c+1)<=7)
                    tablero[f+2][c+1]=5;
            }
            //Hacia la derecha
            if((c+2)<=7){
                if((f-1)>=0)
                    tablero[f-1][c+2]=5;
                if((f+1)<=7)
                    tablero[f+1][c+2]=5;
            }
            //Hacia la izquierda
            if((c-2)>=0){
                if((f-1)>=0)
                    tablero[f-1][c-2]=5;
                if((f+1)<=7)
                    tablero[f+1][c-2]=5;
            }
            return;
        }

}
