package ejemplope;

import java.sql.SQLOutput;

public class Main {


    public static void main(String[] args) {
        // comentario de una sola linea
        /* comentario de multiples lineas

         */

        //declaracion de variable
        //Tipo de dato nombreVariable = valor;

        byte EDAD = 30;
        short stock = 300;
        double precio = 10.5;

        System.out.println("La edad es: " + EDAD);
        System.out.println("El stock es: " + stock);
        System.out.println("El precio es: " + precio);

        String nombreProducto = "Notebook HP";
        System.out.println("El nombre del producto es: " + nombreProducto);

        boolean estaDisponible=true;
        char letra='a';

            //Esto es una constante
        final byte NRO_ISP=63;

        System.out.println("El numero del producto es: " + NRO_ISP);

        float nroDecimalLargo= 5324234324.54353f;

        System.out.println("Esta es la primera linea \nEsta es la segunda linea");

        String texto="Este es un segundo texto de tres lineas \nlinea1 \nlinea2 \nlinea3";

        System.out.println(texto);


    }
}