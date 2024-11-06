package estudioArray;

import java.util.Scanner;

public class Notas {
    public Notas(){
        System.out.println("Clase notas");
        Scanner leer =new Scanner(System.in);
        leer=null;

        int[][]notas={
            {5,6,7,5,7,3,4,6,8,1},
            {2,4,5,3,7,6,8,4,9,10},
            {1,2,3,4,5,6,7,8,9,10},
            {5,4,3,2,1,5,4,3,2,1}
        };
        String [] alumnos={"Juan","Felipe","Ana","Maria","Antonio","Rosa","Pedro","Carmen","Pablo","Luis"};
        String [] asignaturas={"Programacion","Sistemas","BBDD","Entornos"};
        System.out.println("Mostrar notas de una asignatura");
        System.out.println("1.Programacion");
        System.out.println("2.Sistemas");
        System.out.println("3.BBDD");
        System.out.println("4.Entornos");

        System.out.println("Elija una opción");
        int opcion=0;
        leer= new Scanner(System.in);
        opcion=leer.nextInt();
        leer=null;
        switch (opcion) {
            case 1:
                mostrarAsignatura(opcion);
            break;
            case 2:
                mostrarAsignatura(opcion);
                break;
            case 3:
                mostrarAsignatura(opcion);              
                break;
            case 4:
                mostrarAsignatura(opcion);  
            default:
                break;
             }
                
    }
                
    private void mostrarAsignatura(int opcion) {

    }
}
