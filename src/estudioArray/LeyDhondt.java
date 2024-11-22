package estudioArray;

import java.util.Arrays;
import java.util.Scanner;

public class LeyDhondt {
    public LeyDhondt(){
        System.out.println("Ley D'Hondt");

        Scanner sc;
        int censoElectoral=677904, escaños=10;
        double VBLANCO, VNULO,VEMITIDOS;
        int[] VPARTIDOS =new int[7];
        String[] partidos = {"PACA","PASON","PECA","PRISA","PALO","PEDO","PACO"};

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

        actaElectoral(censoElectoral,VEMITIDOS,VBLANCO,VNULO, VPARTIDOS);
        
        distribucionDeEscaños(escaños, partidos, VPARTIDOS, censoElectoral,VEMITIDOS);
                
    }
                
        private void distribucionDeEscaños(int escaños, String[] partidos, int[] vPARTIDOS, int censoElectoral, double vEMITIDOS) {
            int [][] escañosRepartidos =new int [vPARTIDOS.length][escaños];
            


        return;
    }
        
        private void actaElectoral(int censoElectoral, double vEMITIDOS, double vBLANCO, double vNULO, int[] VPARTIDOS) {
            double abstencion=censoElectoral-vEMITIDOS;
            double VVALIDOS=Arrays.stream(VPARTIDOS).sum();
            double VEMITIDOSPORCENTAJE=(vEMITIDOS/censoElectoral)*100;
            double abstencionPORCENTAJE=(abstencion/censoElectoral)*100;
            double VVALIDOSPORCENTAJE=(VVALIDOS/vEMITIDOS)*100;
            double VBLANCOPORCENTAJE=(vBLANCO/vEMITIDOS)*100;
            double VNULOPORCENTAJE=(vNULO/vEMITIDOS)*100;
        
            System.out.println("ACTA ELECTORAL");
            System.out.printf("Votos emitidos %-10.0f %.2f %% sobre el censo %n",vEMITIDOS,VEMITIDOSPORCENTAJE);
            System.out.printf("Abstención %-10.0f %.2f %% sobre el censo %n",abstencion,abstencionPORCENTAJE);
            System.out.printf("Votos válidos %-10.0f %.2f %% sobre emitidos %n",VVALIDOS,VVALIDOSPORCENTAJE);
            System.out.printf("Votos en blanco %-10.0f %.2f %% sobre emitidos %n",vBLANCO,VBLANCOPORCENTAJE);
            System.out.printf("Votos nulos %-10.0f %.2f %% sobre emitidos %n",vNULO,VNULOPORCENTAJE);

            return;
    }
}
