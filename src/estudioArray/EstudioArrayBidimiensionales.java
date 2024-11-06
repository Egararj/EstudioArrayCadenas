package estudioArray;

import java.util.Scanner;

public class EstudioArrayBidimiensionales {
    public EstudioArrayBidimiensionales(){
        System.out.println("Estudio array bidimensionales");
        Scanner leer = new Scanner(System.in);
        leer=null;

        //int [][] notas;
        //notas= new int[3][4];
        //notas[0][0]=3; notas[0][1]=2;
/*         for(int x=0; x<notas.length; x++){
            for(int y=0; y<notas[x].length; y++){
                leer = new Scanner(System.in);
                notas[x][y]=leer.nextInt();
            }

        } */
        int[][]notas2=new int[4][10];
        int[][]notas3=new int[3][];
        notas3[0]=new int[4];//instanciar la primera fila
        notas3[1]=new int[3];//instancia la segunda
        notas3[2]=new int[4];

        int[][]notas={
            {5,6,7,5,7,3,4,6,8,1},
            {2,4,5,3,7,6,8,4,9,10},
            {1,2,3,4,5,6,7,8,9,10},
            {5,4,3,2,1,5,4,3,2,1}
        };

        int [] notaUni=notas[0];
    }

}
