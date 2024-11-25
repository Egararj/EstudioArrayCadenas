package estudioArray;

public class EstudioCadenas {
    public EstudioCadenas(){
        System.out.println("Estudio cadenas");

        String cadena="Bienvenido a la clase de programación   ";
        System.out.println("Propiedades de las cadenas");
        String cad2="AAA";
        //devuelve la longitud del string, incluyendo espacios en blanco
        int tam=cadena.length();
        System.out.println("El tamaño de "+cadena+ " = "+tam);

      /*charAt (int indice): devuelve el carácter asociado al índice que se le pasa
        como argumento del string sobre la que se aplica el método. Si el índice no existe se lanza
        un StringIndexOutOfException que hereda de IndexOutBoundsException. MUY USADO */
        System.out.println("==================");
        System.out.println("---------charAt---------------");
        System.out.println("Caracter = "+cadena.charAt(0));
        for (int x=0; x<cadena.length(); x++){
            System.out.println(cadena.charAt(x)+ "-");
        }

        System.out.println("=============");
        System.out.println("----------Substring-----------");
        /* String substring(int indice, int indiceFin):devuelve un string obtenido a partir
         * del índice inicial incluido y del indice final excluido; es decir, se comporta como un intervalo
         * semiabierto (indiceIni, indiceFin). Si el indice final sobrepasa la longitud del string,
         * se lanza un IndexOutOfBoundsException. MUY USADO*/
        System.out.println(cadena.substring(0, 10));
        System.out.println(cadena.substring(2));
        
        System.out.println("=================");
        System.out.println("------indexOf---------");
        /* indexOf(String str, int indice): devuelve el índice en el que aparece por primera vez
         * el string del primer argumento en el que se aplica el método, a partir del índice especificado
         * en el segundo argumento. Recordar que un string está indexado. Si el índice a partir
         * del que se inicia la búsqueda no existe o el string no aparece, devuelve -1. MUY USADO
         */

        System.out.println(cadena.indexOf("clase"));
        System.out.println(cadena.indexOf('o'));
        System.out.println(cadena.indexOf('x'));

        System.out.println("============");
        System.out.println("--------equals----------");
        //equals permite saber si dos cadenas son iguales
        String nombre="Antonio",nombre2="Antonio";
        System.out.println(nombre.equals(nombre2));
        nombre="antonio";
        System.out.println(nombre.equalsIgnoreCase(nombre2)); //IgnoreCase hace que no distinga entre minúsculas y mayúsculas

        System.out.println("=============");
        System.out.println("---------compareTo----------");
        /* compareTo permite comparar dos cadenas entre sí lexicográficamente (alfabéticamente). Retornará
         * 0 si son iguales, un número menor que cero si la cadena (cad1) es anterior en orden alfabético
         * a la que se pasa por argumento (cad2), y un número mayor que cero si la cadena es posterior en
         * orden alfabético. También tenemos compareToIgnoreCase
         */
        nombre="Ana";
        System.out.println(nombre.compareTo(nombre2));

        System.out.println("=============");
        System.out.println("---------trim----------");
        //trim devuelve otra cadena donde elimina espacios por delante y por detrás de una cadena
        String cad3=cadena.trim();
        System.out.println(cad3.length());

        System.out.println("============");
        System.out.println("--------toLowerCase y toUpperCase---------");
        //devuelve cadenas en minúsculas y mayúsculas respectivamente
        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.toUpperCase());

        System.out.println("============");
        System.out.println("------replace---------");
        /* replace genera una copia de la cadena cad1 en la que se sustituiran todas las apariciones de cad2
         * por cad3. El reemplazo se hará de izquierda a derecha
         */
        System.out.println(cadena.replace(" ", ""));
        System.out.println(cadena.replace("a", "*"));

        System.out.println("=============");
        System.out.println("----------startsWith------");
        /* retornará true si la cadena comienza por la cadena pasada como argumento. En caso contrario
         * retornará false. También tenemos cad1.endsWith(cad2) y cad1.contains(cad2)
         */
        System.out.println(cadena.startsWith("Bienvenido"));
        System.out.println(cadena.contains("ido"));

        //se usará en ficheros
        String alumno="Jesus,Alcocer,1DAW,programacion,bbdd,sistemas,lenguaje de marcas,4,8,true";
        String[] rompeCadena=alumno.split(",");

        //devuelve un array con las caracteres de la cadena
        String asignatura="Programacion";
        char[]caracteres=asignatura.toCharArray();
    }

}
