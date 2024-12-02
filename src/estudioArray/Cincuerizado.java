package estudioArray;

import java.util.Arrays;

public class Cincuerizado {
    public Cincuerizado(){
        System.out.println("Array cincuerizado");

        int[] Array15 = new int[15];
        Arrays.fill(Array15, -1);

        Array15 = cincuerizado(Array15);

        System.out.println(Arrays.toString(Array15));
            }
        
            private int[] cincuerizado(int[] array15) {
                int ale=0;
                boolean repetido= false;

                for(int x=0, resto=0; x<array15.length; x++){
                    do{
                        repetido = false;
                        ale = (int) Math.floor(Math.random()*501);
                        for(int y=0; y<array15.length; y++){
                            if(array15[y]==ale){
                            repetido = true;
                            break;
                            }
                        }
                    }
                    while(repetido);
                        array15[x]=ale;
                    }
                System.out.println(Arrays.toString(array15));
                for (int x=0, resto=0; x<array15.length; x++){
                    resto=array15[x]%5;
                    if(resto!=0){
                        array15[x]=array15[x]-resto+5;
                    }
                }
                return array15;
            }

}
