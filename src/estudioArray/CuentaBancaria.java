package estudioArray;

public class CuentaBancaria {
    public CuentaBancaria(){
        System.out.println("Cuenta Bancaria");

        String cuentaBancaria="14320154497422504551";
        int[] multiplicador={1,2,4,8,5,10,9,7,3,6};
        boolean correcto=false, correcto2=false;

        correcto=compruebaPrimerDig(cuentaBancaria, multiplicador, correcto);
        correcto2=compruebaSegundo(cuentaBancaria,multiplicador,correcto2);

        if(correcto && correcto2) System.out.println("Cuenta bancaria correcta");
        else System.out.println("Cuenta bancaria incorrecta");
        }
                
            private boolean compruebaSegundo(String cuentaBancaria, int[] multiplicador, boolean correcto2) {
                int sum=0, digito=0;
                for(int x=0; x<10; x++){
                    sum+=(Integer.parseInt(String.valueOf(cuentaBancaria.charAt(x+10)))*multiplicador[x]);
                }
                digito=11-(sum%11);
                if(digito==10) digito=1;
                if(digito==11) digito=0;
                if (digito==Integer.parseInt(String.valueOf(cuentaBancaria.charAt(9)))){
                    correcto2=true;
                }

                return correcto2;
            }
        
            private boolean compruebaPrimerDig(String cuentaBancaria, int[] multiplicador, boolean correcto) {
                int sum=0, digito=0;
                for(int x=0; x<8; x++){
                    sum+=(Integer.parseInt(String.valueOf(cuentaBancaria.charAt(x)))*multiplicador[x+2]);
                }
                digito=11-(sum%11);
                if(digito==10) digito=1;
                if(digito==11) digito=0;
                if (digito==Integer.parseInt(String.valueOf(cuentaBancaria.charAt(8)))){
                    correcto=true;
                }
                return correcto;
            }
}
