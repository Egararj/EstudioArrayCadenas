package estudioArray;

public class ISBN {
    public ISBN(){
        System.out.println("ISBN");

        String isbn = "9788481302523";
        int isbnNum = 0, resto=0;
     
        for (int x=0, cont=3; x<isbn.length()-1; x++){
            if(cont%2==0){
                isbnNum+=Integer.parseInt(String.valueOf(isbn.charAt(x)))*3;
            }
            else{
                isbnNum+=Integer.parseInt(String.valueOf(isbn.charAt(x)));
            }
            cont++;
        }
        resto=isbnNum%10;
        resto=(10-resto);
        if(resto==10) resto=0;

        if(resto==Integer.parseInt(String.valueOf(isbn.charAt(12)))){
            System.out.println("ISBN correcto");
        }
        else{
            System.out.println("ISBN incorrecto");
        }
/*         Character.isDigit(isbn.charAt(1)); */ //Para comprobar si es un dígito
    }
}
