package estudioArray;

import java.util.Arrays;

public class CartasRepartidas {
    public CartasRepartidas(){
        System.out.println("Cartas Repartidas");

        String[] baraja={"1 ORO", "2 ORO","3 ORO","4 ORO","5 ORO", "6 ORO", "7 ORO","J ORO","C ORO", "R ORO",
                         "1 ESPADA", "2 ESPADA","3 ESPADA","4 ESPADA","5 ESPADA", "6 ESPADA","7 ESPADA","J ESPADA","C ESPADA", "R ESPADA",
                         "1 COPA", "2 COPA","3 COPA","4 COPA","5 COPA", "6 COPA","7 COPA","J COPA","C COPA", "R COPA",
                         "1 BASTO", "2 BASTO","3 BASTO","4 BASTO","5 BASTO", "6 BASTO","7 BASTO","J BASTO","C BASTO", "R BASTO"
        };
        
        int[] cartasRobadas=roba16Cartas();

/*         System.out.println("JUGADOR 1");
        for(int c=0; c<4; c++){
            System.out.printf(": %s : ", baraja[cartasRobadas[c]]);
        }
        System.out.println("");
        
        System.out.println("JUGADOR 2");
        for(int c=4; c<8; c++){
            System.out.printf(": %s : ", baraja[cartasRobadas[c]]);
        }
        System.out.println("");

        System.out.println("JUGADOR 3");
        for(int c=8; c<12; c++){
            System.out.printf(": %s : ", baraja[cartasRobadas[c]]);
        }
        System.out.println("");

        System.out.println("JUGADOR 4");
        for(int c=12; c<16; c++){
            System.out.printf(": %s : ", baraja[cartasRobadas[c]]);
        }
        System.out.println(""); */

        //Repartir 10 veces a 2 jugadores
        int cartaGanadora = (int) Math.floor(Math.random()*39);
        int contadorJugador1=0, contadorJugador2=0;
        int[][] jugador1 =new int[10][4];
        int[][] jugador2 =new int[10][4];
        

        System.out.println("Carta ganadora : "+baraja[cartaGanadora]);
        System.out.println("JUGADOR1                                            JUGADOR2");
        for(int f=0; f<10; f++){
            cartasRobadas=roba8Cartas();
            for(int c=0; c<4; c++){ //Muestra la mano y suma si le ha tocado la carta ganadora
                System.out.printf(" %-8s  ", baraja[cartasRobadas[c]]);
                jugador1[f][c]=cartasRobadas[c];
                if(cartaGanadora==cartasRobadas[c]) contadorJugador1++;
            }

            System.out.printf("       ");
            
            for(int c=4; c<8; c++){//Muestra la mano y suma si le ha tocado la carta ganadora
                System.out.printf(" %-8s  ", baraja[cartasRobadas[c]]);
                jugador2[f][c-4]=cartasRobadas[c];
                if(cartaGanadora==cartasRobadas[c]) contadorJugador2++;
            }
            System.out.println("");

        }
        //Resultado
        System.out.println("Jugador 1 : "+baraja[cartaGanadora]+" = "+contadorJugador1);
        System.out.println("Jugador 2 : "+baraja[cartaGanadora]+" = "+contadorJugador2);
        if(contadorJugador1>contadorJugador2)
        System.out.println("Gana el jugador 1");
        else if(contadorJugador1<contadorJugador2)
        System.out.println("Gana el jugador 2");
        else
        System.out.println("Empate");
        System.out.println("pausa");             
    }
                    
        private int[] roba8Cartas() {
            int[] cartasRobadas =new int[8];
            Arrays.fill(cartasRobadas,-1);
            boolean repetido=false;
            for (int c=0, ale=0; c<cartasRobadas.length; c++){
                do {
                    repetido=false;
                    ale=(int) Math.floor(Math.random()*39);
                    for (int a=0; a<cartasRobadas.length; a++){
                        if(cartasRobadas[a]==ale)
                        repetido=true;
                    }
                } while (repetido);
                cartasRobadas[c]=ale;
                
            }
            return cartasRobadas; 

        }
            
        private int[] roba16Cartas() {
            int[] cartasRobadas =new int[16];
            Arrays.fill(cartasRobadas,-1);
            boolean repetido=false;
            for (int c=0, ale=0; c<cartasRobadas.length; c++){
                do {
                    repetido=false;
                    ale=(int) Math.floor(Math.random()*39);
                    for (int a=0; a<cartasRobadas.length; a++){
                        if(cartasRobadas[a]==ale)
                        repetido=true;
                    }
                } while (repetido);
                cartasRobadas[c]=ale;
                
            }
            return cartasRobadas;
        }
}
