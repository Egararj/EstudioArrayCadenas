package estudioArray;

import java.util.Arrays;

public class Primitiva {
    public Primitiva(){
        System.out.println("Sorteo para 10 boletos de primitiva");

        //Genera 10 boletos
        int [][] boletos=new int [10][6];
        for (int f=0; f<boletos.length; f++){
            boletos[f]=generadorBoleto();
        }

        //Genera el premio
        int[] premio=generadorBoleto();

        //Comparación
        for (int f=0, aciertos=0; f<boletos.length; f++){
            aciertos=0;
            for (int c=0; c<boletos[f].length; c++){
                for (int c1=0; c1<premio.length; c1++){
                    if (boletos[f][c]==premio[c1]) aciertos++;
                }
            }
            System.out.println("El boleto "+f+" tiene "+aciertos+" aciertos");
        }

        System.out.println("Genera boletos hasta que coincida con el boleto premiado");

        int[] premio2=generadorBoleto();
        int[] boletoGanador;
        long totalBoletos=0;
        boolean Iguales=true;

        do{
            boletoGanador=generadorBoleto();
            Iguales=Arrays.equals(premio2, boletoGanador);
            totalBoletos++;
        }
        while(!Iguales);
        System.out.println("El premio es:");
        System.out.println(Arrays.toString(premio2));
        System.out.println("Han hecho falta generar "+totalBoletos+" boletos para acertar");
        }
        
        private int[] generadorBoleto() {
            int[] boleto=new int [6];
            int numero=0;
            boolean repetido=false;
           
            for (int c=0; c<boleto.length; c++){
                repetido=true;
                while (repetido){
                    numero=(int) Math.floor(Math.random()*49+1);
                    for (int c1=0; c1<boleto.length; c1++){
                        if (numero==boleto[c1]){
                        repetido=true;
                        break;
                        }
                        else repetido=false;
                    }
                }
                boleto[c]=numero;
            }
            Arrays.sort(boleto);
            return boleto;
        }


}
