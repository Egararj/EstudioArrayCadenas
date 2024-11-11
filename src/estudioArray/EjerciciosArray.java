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
        System.out.println("");

    }
}
