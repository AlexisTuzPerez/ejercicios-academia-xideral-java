package ejercicio2;

public class Calculadora {

    public static int sumar(int a,int b){
        return a + b;
    }

    public static double sumar(double a, double b){
        return a + b;
    }

    public static int sumar(int a, int b, int c){
        return a + b + c;
    }

    public static int sumar(int[] enteros){

        int suma = 0;

        for (int e:enteros){
            suma = suma + e;
        }

        return suma;

    }


    public static void main(String[] args){
        System.out.println("hola");

        System.out.println("2 + 3 = " + sumar(2,3));
        System.out.println("2.5 + 3.7 = " + sumar(2.5,3.7));
        System.out.println("1 + 2 + 3 = " + sumar(1,2,3));


        int[] enteros = {10,20,30,40};
        System.out.println("Total suma: " + sumar(enteros));



    }





}
