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
                mostrarAsignatura(opcion, notas, alumnos, asignaturas);
            break;
            case 2:
                mostrarAsignatura(opcion, notas, alumnos, asignaturas);
                break;
            case 3:
                mostrarAsignatura(opcion, notas, alumnos, asignaturas);              
                break;
            case 4:
                mostrarAsignatura(opcion, notas, alumnos, asignaturas);  
            default:
                break;
             }
                
    }
                
    private void mostrarAsignatura(int opcion, int[][] notas, String[] alumnos, String[] asignaturas) {
        System.out.println("Notas "+asignaturas[opcion-1]);
        for (int i=0; i<notas[opcion-1].length; i++){
            System.out.printf("Alumno: %-8s. Nota: %d %n",alumnos[i], notas[opcion-1][i]);
        }
        return;
    }
}
