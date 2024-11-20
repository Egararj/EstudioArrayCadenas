package estudioArray;

import java.util.Arrays;
import java.util.Scanner;

public class LeyDhondt {
    public LeyDhondt(){
        System.out.println("Ley D'Hondt");

        Scanner sc;
        int censoElectoral=677904, escaños=10, VBLANCO, VNULO,VEMITIDOS;
        int[] VPARTIDOS =new int[7];

        //Introducción de votos
        do{
            for (int c=0; c<VPARTIDOS.length; c++){
                System.out.println("Introduzca el nº de votos del partido "+(c+1));
                sc= new Scanner(System.in);
                VPARTIDOS[c]= sc.nextInt();
                sc=null;
            }
            System.out.println("Introduzca el nº de votos en blanco");
            sc= new Scanner(System.in);
            VBLANCO= sc.nextInt();
            sc=null;

            System.out.println("Introduzca el nº de votos nulos");
            sc= new Scanner(System.in);
            VNULO= sc.nextInt();
            sc=null;

            VEMITIDOS=Arrays.stream(VPARTIDOS).sum()+VBLANCO+VNULO;
        }while(censoElectoral<VEMITIDOS);

        System.out.println("ACTA ELECTORAL");
        

    }
}
