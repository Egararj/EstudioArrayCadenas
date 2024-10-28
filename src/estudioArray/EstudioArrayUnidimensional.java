package estudioArray;

public class EstudioArrayUnidimensional {
    public EstudioArrayUnidimensional(){
        System.out.println("Array Unidimensional");
        int[] enteros; //declaración
        enteros = new int[5]; //instanciamiento indicando la cantidad de elementos que tiene
        enteros[0]=1; enteros[1]=7; enteros[2]=0; enteros[3]=4; enteros[4]=5;
        System.out.println("El valor de la posición 0 es: "+enteros[0]);
        int[] enteros2 =new int [10]; //declaración e instanciamiento
        int[] notas={5,6,7,8,9,10}; //declarado, instanciado y rellenado
        int suspenso=0;
        for(int i=0;i<notas.length;i++){
            if(notas[i]<5){
                suspenso++;
            }
        }
        System.out.println("Han suspendido "+suspenso+" alumnos");
        int[] notas2=notas; //notas2 y notas comparten el mismo espacio en la memoria. Son el mismo pero con distinto nombre, no es una copia aparte
        int numero=5;
        double media=calculaMedia(notas, numero);
        int[] primitiva=generaPrimitiva();
        System.out.println("pausa");
    }

    private int[] generaPrimitiva() {
        int[] primitiva = new int[6];
        for(int i=0;i<primitiva.length;i++){
            
        }

        return primitiva;
    }

    private double calculaMedia(int[] notasAsignatura, int numeroDePrueba) {//si los valores de notasAsignaturas cambian lo hará también notas, ojo con eso
        double media=0;
        for(int i=0;i<notasAsignatura.length;i++){
            media+=notasAsignatura[i];
        }
        numeroDePrueba=3;
        return media/notasAsignatura.length;
    }

}
