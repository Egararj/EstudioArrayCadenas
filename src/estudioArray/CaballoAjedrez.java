package estudioArray;

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

        movimientosCaballos(tablero);
                
        }
        
        private void movimientosCaballos(int[][] tablero) {


        }

}
