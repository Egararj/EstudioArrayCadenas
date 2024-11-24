package estudioArray;

import java.util.Arrays;
import java.util.Scanner;

public class LeyDhondt {
    public LeyDhondt(){
        System.out.println("Ley D'Hondt");

        Scanner sc;
        int censoElectoral=1017958, escaños=7;
        double VBLANCO, VNULO,VEMITIDOS;   
        String[] partidos = {"PACA","PASON","PECA"/* ,"PRISA","PALO","PEDO","PACO" */};
        int[] VPARTIDOS =new int[partidos.length];

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
        sc= new Scanner(System.in);
        sc.nextLine();
        sc=null;
        distribucionDeEscaños(escaños, partidos, VPARTIDOS, censoElectoral,VEMITIDOS);
                
    }
                
        private void distribucionDeEscaños(int escaños, String[] partidos, int[] vPARTIDOS, int censoElectoral, double vEMITIDOS) {
            int [][] repartoDeEscaños =new int [vPARTIDOS.length][escaños];
            int [] escañosRepartidos =new int [vPARTIDOS.length];
            int [] copiaVPARTIDOS =new int [vPARTIDOS.length];
            int mayorVoto=0, mayorVotoC=0, mayorVotoF=0, opcion1=0, opcion2=0;
            double censoPorcentaje=0, emitidosPorcentaje=0;

            //Reparto de escaños
            for (int f=0; f<repartoDeEscaños.length; f++){
                for(int c=0; c<repartoDeEscaños[f].length; c++){
                    if(c==0) repartoDeEscaños[f][c]=vPARTIDOS[f];
                    else repartoDeEscaños[f][c]=vPARTIDOS[f]/(c+1);
                }
            }

            //Añade los escaños a cada partido
            for(int x=0; x<escaños; x++){
                mayorVoto=0;
                opcion1=0;
                opcion2=0;
                for(int f=0; f<repartoDeEscaños.length; f++){
                    for(int c=0; c<repartoDeEscaños[f].length; c++){
                        if(mayorVoto<repartoDeEscaños[f][c]){
                            mayorVoto=repartoDeEscaños[f][c];
                            mayorVotoF=f;
                            mayorVotoC=c;
                            opcion1=vPARTIDOS[f];
                        }
                        else if(mayorVoto==repartoDeEscaños[f][c]){
                            opcion2=vPARTIDOS[f];
                            if(opcion2>opcion1){
                                mayorVoto=repartoDeEscaños[f][c];
                                mayorVotoF=f;
                                mayorVotoC=c;
                            }
                        }
                    }
                }
                escañosRepartidos[mayorVotoF]++;
                repartoDeEscaños[mayorVotoF][mayorVotoC]=0;
            }

            //Copia array
            for (int c=0; c<vPARTIDOS.length; c++){
                copiaVPARTIDOS[c]=vPARTIDOS[c];
            }

            //Salida por pantalla
            System.out.println("Distribución de escaños");
            System.out.println("NOMBRE     VOTOS      %CENSO     %EMITIDOS  ESCAÑOS");
            for (int x=0; x<vPARTIDOS.length; x++){
                mayorVoto=0;
                for (int c=0; c<vPARTIDOS.length; c++){
                    if(mayorVoto<copiaVPARTIDOS[c]) {
                        mayorVoto=copiaVPARTIDOS[c];
                        mayorVotoC=c;
                    }
                }
                censoPorcentaje = (copiaVPARTIDOS[mayorVotoC]/(double)censoElectoral)*100;
                emitidosPorcentaje = (copiaVPARTIDOS[mayorVotoC]/vEMITIDOS)*100;
                System.out.printf("%-10s %-10d %-10.2f %-10.2f %-10d %n", partidos[mayorVotoC], vPARTIDOS[mayorVotoC], censoPorcentaje, emitidosPorcentaje, escañosRepartidos[mayorVotoC]);
                copiaVPARTIDOS[mayorVotoC]=0;
            }

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
