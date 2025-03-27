package ejemplope;

public class EjOperadores {

    public static void main(String[] args) {

       double precio;
       int cantidad;
       double total;
       byte unidades;

       //operador de asignacion
        precio =6542.55;
        cantidad=5;

        total= precio*cantidad;

        precio=7852.55;
        cantidad=256;

        //total=total + (precio*cantidad);
        total += precio*cantidad;
        System.out.println("El total es " + total);

        cantidad++; //operador unario

        System.out.println(cantidad);



    }

}
