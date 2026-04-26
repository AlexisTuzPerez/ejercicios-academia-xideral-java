package ejercicio1;

public class HolaMundoMejorado {


    public static void main(String[] args){

        String nombre = "Ana";
        int edad = 25;
        double altura = 1.68;
        boolean activo = true;


        String mensaje1 = "Me llamo " + nombre + ", tengo " + edad + " anios, mido " + altura + "m y estoy " + (activo?"activo.":"inactivo.");
        System.out.println(mensaje1);



        String mensaje2 = String.format("Me llamo %s, tengo %d anios, mido %.2fm y estoy %s.",nombre,edad,altura, activo? "activo":"inactivo");
        System.out.println(mensaje2);
    }
}
