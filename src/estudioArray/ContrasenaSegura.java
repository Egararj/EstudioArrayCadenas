package estudioArray;

public class ContrasenaSegura {
    public ContrasenaSegura(){
        System.out.println("Contraseña Segura");

        String contrasena = "!1Contrasena1";

        boolean segura = verificador(contrasena);

        if(segura) System.out.println("La contraseña es segura");
        else System.out.println("La contraseña no es segura");
            }
        
            private boolean verificador(String contrasena) {
                boolean segura = false;
                //Comprobar la longitud
                if(contrasena.length()<8){
                    segura = false;
                    return segura;
                }
                //Comprobar si tiene dígito
                for(int x=0; x<contrasena.length(); x++){
                    if(Character.isDigit(contrasena.charAt(x))){
                        segura = true;
                        break;
                    }
                    if(x==(contrasena.length()-1)){
                        segura = false;
                        return segura;
                    }
                }
                //Comprobar si hay mayúscula
                for(int x=0; x<contrasena.length(); x++){
                    if(Character.isUpperCase(contrasena.charAt(x))){
                        segura = true;
                        break;
                    }
                    if(x==(contrasena.length()-1)){
                        segura = false;
                        return segura;
                    }
                }
                //Comprobar si hay minúscula
                for(int x=0; x<contrasena.length(); x++){
                    if(Character.isLowerCase(contrasena.charAt(x))){
                        segura = true;
                        break;
                    }
                    if(x==(contrasena.length()-1)){
                        segura = false;
                        return segura;
                    }
                }
                //Comrpobar si tiene carácter especial
                for(int x=0; x<contrasena.length(); x++){
                    if(!Character.isLetterOrDigit(contrasena.charAt(x))){
                        segura = true;
                        break;
                    }
                    if(x==(contrasena.length()-1)){
                        segura = false;
                        return segura;
                    }
                    
                }
                return segura;
            }
}
