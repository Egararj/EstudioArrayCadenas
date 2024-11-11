package estudioArray;

import java.util.Scanner;

public class Notas {
    public Notas(){
        System.out.println("Clase notas");
        Scanner leer =new Scanner(System.in);
        leer=null;

        int[][]notas={
            {5,6,7,5,7,3,4,6,8,1},
            {8,4,5,3,7,6,8,4,9,10},
            {7,2,3,4,5,6,7,8,9,4},
            {5,4,3,2,1,5,4,3,2,10}
        };
        String [] alumnos={"Juan","Felipe","Ana","Maria","Antonio","Rosa","Pedro","Carmen","Pablo","Luis"};
        String [] asignaturas={"Programacion","Sistemas","BBDD","Entornos"};
        System.out.println("1.Mostrar notas de una asignatura");
        System.out.println("2.Mostrar boletín de un alumno con su nota media si ha aprobado");
        System.out.println("3.Mostrar los que han suspendido programación y BBDD. Los mostrados repiten curso");


        System.out.println("Elija una opción");
        int opcion=0;
        leer= new Scanner(System.in);
        opcion=leer.nextInt();
        leer=null;
        switch (opcion) {
            case 1:
                System.out.println("1.Programacion-2.Sistemas-3.BBDD-4.Entornos");
                leer= new Scanner(System.in);
                int asignatura=leer.nextInt();
                leer=null;
                asignatura--;
                mostrarAsignatura(asignatura, notas, alumnos, asignaturas);
            break;
            case 2:
                System.out.println("1.Juan-2.Felipe-3.Ana-4.Maria-5.Antonio-6.Rosa-7.Pedrp-8.Carmen-9.Pablo-10.Luis");
                leer= new Scanner(System.in);
                int alumno=leer.nextInt();
                leer=null;
                alumno--;
                mostrarBoletin(alumno, notas, alumnos, asignaturas);
                               
            break;
            case 3:
                mostrarSuspensos(notas,alumnos,asignaturas);                                              
            break;
            case 4:
    
            break;                 
            default:
            break;
            }
                                    
        }
                                    
    private void mostrarSuspensos(int[][] notas, String[] alumnos, String[] asignaturas) {
    boolean repite=false;
        for(int c=0; c<alumnos.length; c++){
            repite=false;
            for(int f=0, contSuspenso=0, contTroncal=0; f<notas.length;f++){
                if(f==0 || f==2){
                    if(notas[f][c]<5 || notas[f][c]<5){
                        contTroncal++;
                    }
                }
                if(notas[f][c]<5){
                    contSuspenso++;
                }
                if(contSuspenso>2 || contTroncal==2){
                    repite=true;
                    break;
                }
            }
            if(repite)
            System.out.println(alumnos[c]+" repite curso");
            else
            System.out.println(alumnos[c]+" aprueba");
        }
    

          
    }
    
    private void mostrarBoletin(int alumno, int[][] notas, String[] alumnos, String[] asignaturas) {
        System.out.println("Boletín de "+alumnos[alumno]);
        int media=0;
        boolean aprobado=true;

        for(int c=alumno, f=0; f<notas.length; f++){
            System.out.println(asignaturas[f]+" : "+notas[f][c]);
            media+=notas[f][c];
            if(notas[f][c]<5)
            aprobado=false;
        }
        if(aprobado)
        System.out.println("Nota media : "+media/4);
        return;
    }
                
    private void mostrarAsignatura(int asignatura, int[][] notas, String[] alumnos, String[] asignaturas) {
        System.out.println("Notas "+asignaturas[asignatura]);
        for (int c=0; c<notas[asignatura].length; c++){
            System.out.printf("Alumno: %-8s. Nota: %d %n",alumnos[c], notas[asignatura][c]);
        }
        return;
    }
}
