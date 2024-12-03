package estudioArray;

import java.util.Arrays;

public class Tute {
    public Tute(){
        System.out.println("Tute");

        String[] baraja={"1O","2O","3O","4O","5O","6O","7O","10O","11O","12O",//Oro de 0 a 9
                         "1E","2E","3E","4E","5E","6E","7E","10E","11E","12E",//Espada de 10 a 19
                         "1B","2B","3B","4B","5B","6B","7B","10B","11B","12B",//Basto de 20 a 29
                         "1C","2C","3C","4C","5C","6C","7C","10C","11C","12C"};//Copa de 30 a 39

        String[] barajaRepartida = reparteCartas(baraja);

        //Muestra las manos
        for(int x=0; x<4; x++){
        System.out.println(barajaRepartida[x]);
        }

        //Selecciona el palo Triunfo
        String paloTriunfo=paloTriunfo();
        System.out.println("Palo triunfo = "+paloTriunfo);

        //Mira cada mano de cada jugador si contiene 11 y 12 del mismo palo
        boolean canta = false;
        boolean cantó = false;
        for (int x=0; x<barajaRepartida.length; x++){
            canta=cantaManos(x,barajaRepartida,paloTriunfo);
            if(canta) cantó = true;
        }
        if(!cantó) System.out.println("Nadie puede cantar");
        System.out.println("Fin");
    }
                            
            private boolean cantaManos(int x, String[] barajaRepartida, String paloTriunfo) {
            String mano = barajaRepartida[x];
            boolean cantar = false;
            //Cada if es un palo
            if(mano.contains("11O") && mano.contains("12O")){
                if(paloTriunfo.contains("O")){
                    System.out.println("Jugador "+(x+1)+" puede cantar 40 en Oros");
                    cantar = true;
                }
                else{
                    System.out.println("Jugador "+(x+1)+" puede cantar 20 en Oros");
                    cantar = true;
                }
            }
            if(mano.contains("11C") && mano.contains("12C")){
                if(paloTriunfo.contains("C")){
                    System.out.println("Jugador "+(x+1)+" puede cantar 40 en Copas");
                    cantar = true;
                }
                else{
                    System.out.println("Jugador "+(x+1)+" puede cantar 20 en Copas");
                    cantar = true;
                }
            }
            if(mano.contains("11B") && mano.contains("12B")){
                if(paloTriunfo.contains("B")){
                    System.out.println("Jugador "+(x+1)+" puede cantar 40 en Bastos");
                    cantar = true;
                }
                else{
                    System.out.println("Jugador "+(x+1)+" puede cantar 20 en Bastos");
                    cantar = true;
                }
            }
            if(mano.contains("11E") && mano.contains("12E")){
                if(paloTriunfo.contains("E")){
                    System.out.println("Jugador "+(x+1)+" puede cantar 40 en Espadas");
                    cantar = true;
                }
                else{
                    System.out.println("Jugador "+(x+1)+" puede cantar 20 en Espadas");
                    cantar = true;
                }
            }
            return cantar;
        }
            
            private String paloTriunfo() {
                String paloTriunfo="";
                int ale = (int) Math.floor(Math.random()*4);
                if(ale==0) paloTriunfo+="O";
                if(ale==1) paloTriunfo+="C";
                if(ale==2) paloTriunfo+="B";
                if(ale==3) paloTriunfo+="E";
                return paloTriunfo;
        }
        
            private String[] reparteCartas(String[] baraja) {
                String[] barajaRepartida={"Jugador 1 ","Jugador 2 ","Jugador 3 ","Jugador 4 "};
                int[]numAleRepetidos=new int[40];
                Arrays.fill(numAleRepetidos, -1);
                boolean repetido=false;
                int ale=0;
                for (int x=0; x<baraja.length; x++){
                    do{
                        repetido=false;
                        ale=(int) Math.floor(Math.random()*40);
                        for (int y=0; y<baraja.length; y++){
                            if(ale==numAleRepetidos[y])
                            repetido=true;
                        }
                    }while(repetido);
                    numAleRepetidos[x] = ale;
                    if (x<10) barajaRepartida[0]+=baraja[ale];
                    if (x>=10 && x<20) barajaRepartida[1]+=baraja[ale];
                    if (x>=20 && x<30) barajaRepartida[2]+=baraja[ale];
                    if (x>=30) barajaRepartida[3]+=baraja[ale];
                }
                return barajaRepartida;
    }
}
