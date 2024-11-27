package estudioArray;

import java.util.Scanner;

public class EjercicioCadenas1 {
    public EjercicioCadenas1(){
        System.out.println("Ejercicio cadenas 1");

        System.out.println("Introduzca una frase");
        Scanner sc=new Scanner(System.in);
        String frase = sc.nextLine();
        sc=null;
        char y=' ';
        boolean salto=false, salto2=false;
        for (int x=0; x<frase.length(); x++){
            if(frase.charAt(x)!=y){
                System.out.print(frase.charAt(x));
                salto=false;
                salto2=true;
            }
            else {
                salto=true;
            }
            if(salto && salto2){
                System.out.printf("%n");
                salto2=false;
            }
        }
    }
}
