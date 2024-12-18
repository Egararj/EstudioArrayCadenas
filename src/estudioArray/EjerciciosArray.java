package estudioArray;

import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosArray {
    public EjerciciosArray(){
        System.out.println("Ejercicios Array");
        Scanner leer=new Scanner(System.in);
        leer=null;
        //Ejercicio 1
/*         System.out.println("Ejercicio 1. Valores máximos y mínimos de cada fila y de la tabla");
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
        } */

        //Ejercicio 3
        System.out.println("Ejercicio 3. Cuadrado mágico");

        boolean filas=true, columnas=true, diagonalPrincipal=true, diagonalSecundaria=true, magico=false;
        int[][] cuadradoMagico={
            {19,21,3,10,12},
            {25,2,9,11,18},
            {1,8,15,17,24},
            {7,14,16,23,5},
            {13,20,22,4,6}
        };
        int sumColumna=0, sumColumna2=0;
        int sumFilas=0, sumFilas2=0;
        int sumDiagonalPrincipal=0;
        int sumDiagonalSecundaria=0;

        //compara Columnas
        for (int c=0; c<cuadradoMagico[c].length-1; c++){
            sumColumna2=0;
            for (int f=0; f<cuadradoMagico.length; f++){
                if(c==0)
                sumColumna+=cuadradoMagico[f][c];
                else
                sumColumna2+=cuadradoMagico[f][c];
            }
            if(c>0){
                if(sumColumna!=sumColumna2)
                columnas=false;
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
            }
            if(f>0){
                if(sumFilas!=sumFilas2)
                filas=false;
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
            sumDiagonalSecundaria+=cuadradoMagico[f][(cuadradoMagico.length-1)-f];
        }

        //compara Diagonales
        if(sumDiagonalPrincipal!=sumDiagonalSecundaria ||sumDiagonalPrincipal!=sumColumna || sumDiagonalPrincipal!=sumFilas)
        diagonalPrincipal=false;
        if(sumDiagonalSecundaria!=sumDiagonalPrincipal || sumDiagonalSecundaria!=sumColumna || sumDiagonalSecundaria!=sumFilas)
        diagonalSecundaria=false;

        if(filas && columnas && diagonalPrincipal && diagonalSecundaria)
        magico=true;

        if(magico)
            System.out.println("El cuadrado es mágico");
        else
            System.out.println("El cuadrado no es mágico");

        //Ejercicio 4
        System.out.println("Ejercicio 4. Array rellenado");

        int[][] arrayRellenado= new int[5][5];
        int suma=0;
        
        for (int f=0; f<arrayRellenado.length; f++){
            for (int c=0; c<arrayRellenado[f].length; c++){
                suma=f+c;
                if(suma<arrayRellenado.length)
                arrayRellenado[f][c]=suma;
                else
                arrayRellenado[f][c]=arrayRellenado.length-(suma-arrayRellenado.length)-2;
            }
            System.out.println(Arrays.toString(arrayRellenado[f]));
        }
        System.out.println("pausa");

        //Ejercicio 5
        System.out.println("Ejercicio 5. Crear cuadrado mágico 5x5");

        int[][] arrayM =new int [5][5];
        int f=0, c=2;

        int cont=1;
        while(cont<26){
            if(cont>5){
                if ((cont-1)%5==0){
                    f+=2;
                    c--;
                }
            }
            if (f<0) f=4;
            if (f>4) f=0;
            if (c>4) c=0;
            arrayM[f][c]=cont;

            cont++;
            f--;
            c++;
        }
        for (int fila=0; fila<arrayM.length; fila++){
            System.out.println(Arrays.toString(arrayM[fila]));
        }


    }
}
