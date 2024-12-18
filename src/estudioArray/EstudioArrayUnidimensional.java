package estudioArray;

import java.util.Scanner;

public class EstudioArrayUnidimensional {
    public EstudioArrayUnidimensional(){
        Scanner leer=new Scanner(System.in);
        leer=null;

        System.out.println("Array Unidimensional");
        int[] enteros; //declaración
        enteros = new int[5]; //instanciamiento indicando la cantidad de elementos que tiene
        enteros[0]=1; enteros[1]=7; enteros[2]=0; enteros[3]=4; enteros[4]=5;
        System.out.println("El valor de la posición 0 es: "+enteros[0]);
        int[] enteros2 =new int [10]; //declaración e instanciamiento
        int[] notas={5,6,7,8,9,10,3,4,10,7}; //declarado, instanciado y rellenado
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

        //Genera números aleatorios sin repetirse
        int cantidad=6, limInf=1, limSup=49;     
        int[] primitiva=generaPrimitiva(cantidad,limInf,limSup);
        for(int i=0;i<primitiva.length;i++)
        System.out.println(primitiva[i]);
/* 
        //Arrays en paralelo
        String[] nombreAlumnos={"Pepe","Pablo","Ana","Antonio","Manolo","Juan","Jose","Maria","Jesus","Elena"};
        int sobresaliente=0, notable=0, suficiente=0;
        suspenso=0;
        for(int i=0;i<notas.length;i++){
            System.out.printf("%-7s : %s %n",nombreAlumnos[i],notas[i]);
            if(notas[i]>=9)
            sobresaliente++;
            else if(notas[i]>=7)
            notable++;
            else if(notas[i]>=5)
            suficiente++;
            else
            suspenso++;
        }
        System.out.println("Sobresaliente: "+sobresaliente);
        System.out.println("Notables: "+notable);
        System.out.println("Suficientes: "+suficiente);
        System.out.println("Suspensos: "+suspenso);
        System.out.println("pausa");

        //Ejercicio 1
        System.out.println("Ejercicio 1. Muestra el menor y el mayor número");

        int[] array10elementos= new int[10];
        int arrayMin=101, arrayMax=0;
        limSup=100;
        cantidad=10;

        array10elementos=generaArraysAleatorios(cantidad, limSup, limInf);
        for(int x=0;x<2;x++){
            for(int i=0; i<array10elementos.length;i++){
                if (array10elementos[i]>arrayMax)
                arrayMax=array10elementos[i];
                else if (array10elementos[i]<arrayMin)
                arrayMin=array10elementos[i];
            }
        }
        System.out.println("Valor máximo de la array : "+arrayMax);
        System.out.println("Valor mínimo de la array : "+arrayMin);
 */
        //Ejercicio 2
/*         System.out.println("Ejercicio 2. Cuenta números de una array");
        cantidad=20;
        limInf=1;
        limSup=10;
        int[] array20elementos=generaArraysAleatorios(cantidad, limSup, limInf);

        for (int i=1,repe=0; i<=limSup;i++){
            repe=0;
            for (int cont=0; cont<array20elementos.length; cont++){
                if(i==array20elementos[cont])
                repe++;
            }
        System.out.println(i+" hay "+repe+" repetidos");
        } */

        //Ejercicio 3
        System.out.println("Ejercicio 3. Ingresa 6 elementos y los muestra al revés");

        int[] SeisElementos = new int[6];

        for(int i=0; i<6; i++){
            System.out.println("Ingrese un elemento");
            leer= new Scanner(System.in);
            SeisElementos[i]=leer.nextInt();
            leer=null;
        }
        SeisElementos=arrayInvertido(SeisElementos);

        for (int i=0;i<SeisElementos.length; i++){
            System.out.println(SeisElementos[i]);
        }

        
        //Ejercicio 4
        System.out.println("Ejercicio 4. Array intercalado");

        int[] primerArray =new int[5];
        int[] segundoArray =new int[5];
        int[] tercerArray =new int[10];

        for(int i=0; i<5; i++){
            System.out.println("Ingrese un valor para el primer array (posición "+i+")");
            leer=new Scanner(System.in);
            primerArray[i]= leer.nextInt();
            leer=null;
        }
        
        for(int i=0; i<5; i++){
            System.out.println("Ingrese un valor para el segundo array (posición "+i+")");
            leer=new Scanner(System.in);
            segundoArray[i]= leer.nextInt();
            leer=null;
        }

        for(int cont=0, x=0; cont<tercerArray.length; cont++, x++){
            tercerArray[cont]=primerArray[x];
            cont++;
            tercerArray[cont]=segundoArray[x];
            }
        

        for (int i=0; i<tercerArray.length; i++){
            System.out.println(tercerArray[i]);
        }

    }

    private int[] arrayInvertido(int[] arrayBase) {
        int[] arrayInvertido;
        int cont=0;

        cont=arrayBase.length;
        arrayInvertido= new int[cont];

        for (int i=0; i<arrayBase.length; i++){
            arrayInvertido[i]=arrayBase[cont-1];
            cont--;
        }
        return arrayInvertido;
    }

    private int[] generaArraysAleatorios(int cantidad, int limSup, int limInf) {
        int [] array=new int[cantidad];
        int ale=0;
        for(int i=0;i<array.length;i++){
            ale=(int) Math.floor(Math.random()*(limSup-limInf+1)+limInf);
            array[i]=ale;
        }
        return array;
    }

    private int[] generaPrimitiva(int cantidad, int limInf, int limSup) {
        int[] primitiva = new int[cantidad];
        int ale=0;
        boolean repetido=false;
        for(int i=0;i<primitiva.length;i++){
            repetido=false;
            do{
                repetido=false;
                ale=(int) Math.floor(Math.random()*(limSup-limInf+1)+limInf);
                for(int a=0;a<primitiva.length;a++){
                    if(ale==primitiva[a])
                    repetido=true;
                }
            }while(repetido);
        primitiva[i]=ale;    
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
