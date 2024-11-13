package estudioArray;

import java.util.Scanner;

public class EjerciciosArray {
    public EjerciciosArray(){
        System.out.println("Ejercicios Array");
        Scanner leer=new Scanner(System.in);
        leer=null;
        //Ejercicio 1
        System.out.println("Ejercicio 1. Valores máximos y mínimos de cada fila y de la tabla");
        int[][]tablaSeisNumeros={
            {6,2},
            {1,8},
            {7,9}
        };
        int max=0, min=999;
        for (int maxF=0, minF=9999, f=0; f<tablaSeisNumeros.length; f++){
            maxF=0;
            minF=9999;
            for (int  c=0; c<tablaSeisNumeros[f].length; c++){
                if(tablaSeisNumeros[f][c]>maxF){
                    maxF=tablaSeisNumeros[f][c];
                }
                if(tablaSeisNumeros[f][c]<minF){
                    minF=tablaSeisNumeros[f][c];
                }
                if(maxF>max)
                max=maxF;
                if(minF<min)
                min=minF;
            }
            System.out.println("Máximo de la fila "+(f+1)+" = "+maxF);
            System.out.println("Mínimo de la fila "+(f+1)+" = "+minF);
        }
        System.out.println("Máximo de la tabla = "+max);
        System.out.println("Mínimo de la tabla = "+min);

        //Ejercicio 2
        System.out.println("Ejercicio 2. Diagonal con números 1");

        int[][] diagonal= new int[4][4];

        for (int f=0; f<diagonal.length; f++){
            for (int  c=0; c<diagonal[f].length; c++){
                if(f==c){
                    diagonal[f][c]=1;
                }
                else{
                    diagonal[f][c]=0;
                }
            }
        }
        for (int f=0; f<diagonal.length; f++){
            for (int  c=0; c<diagonal[f].length; c++){
                System.out.printf("%d",diagonal[f][c]);
            }
            System.out.printf("%n");
        }

        //Ejercicio 3
        System.out.println("Ejercicio 3. Cuadrado mágico");

        boolean filas=true, columnas=true, diagonalPrincipal=true, diagonalSecundaria=true;
        int[][] cuadradoMagico={
            {3,4,21,22,25},
            {20,18,11,16,10},
            {23,13,15,17,7},
            {24,14,19,12,8},
            {5,26,9,8,27}
        };
        int sumColumna=0, sumColumna2=0;
        int sumFilas=0, sumFilas2=0;
        int sumDiagonalPrincipal=0;
        int sumDiagonalSecundaria=0;

        //compara Columnas
        for (int c=0; c<cuadradoMagico[c].length; c++){
            sumColumna=0;
            for (int f=0; f<cuadradoMagico.length; f++){
                if(c==0)
                sumColumna+=cuadradoMagico[f][c];
                else
                sumColumna2+=cuadradoMagico[f][c];
                if(c>0){
                    if(sumColumna!=sumColumna2)
                    columnas=false;
                }
            }
        }

        //compara Filas
        for (int f=0; f<cuadradoMagico.length; f++){
            sumFilas2=0;
            for (int c=0; c<cuadradoMagico[f].length; c++){
                if(f==0)
                    sumFilas+=cuadradoMagico[f][c];
                else
                    sumFilas2+=cuadradoMagico[f][c];
                if(f>0){
                    if(sumFilas!=sumFilas2)
                    filas=false;
                }
            }
        }

        //suma Diagonal Principal
        for (int f=0; f<cuadradoMagico.length; f++){
            for (int c=0; c<cuadradoMagico[f].length; c++){
                if(f==c)
                sumDiagonalPrincipal+=cuadradoMagico[f][c];
            }
        }

        //suma Diagonal Secundaria
        for (int f=0; f<cuadradoMagico.length; f++){
            for (int c=0; c<cuadradoMagico[f].length; c++){
                   
            }
        }
    }
}
