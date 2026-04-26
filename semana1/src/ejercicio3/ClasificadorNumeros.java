package ejercicio3;

public class ClasificadorNumeros {

    public static void clasificar(int[] numeros){

        int positivos = 0, negativos = 0, ceros = 0;
        int pares = 0, impares = 0;
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int suma = 0;


        for(int n:numeros){

            suma = suma + n;
            if(n>0){
                positivos++;
            } else if (n<0) {
                negativos ++;
            } else {
                ceros++;
            }

            if(n%2 == 0){
                pares ++;
            } else {
                impares ++;
            }


            if(n> mayor){
                mayor = n;
            }

            if(n<menor){
                menor = n;
            }




        }

        double promedio = (double) suma / numeros.length;  // TODO: calcular promedio

        System.out.println("=== Resultados ===");
        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
        System.out.println("Pares: " + pares);
        System.out.println("Impares: " + impares);
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.printf("Promedio: %.2f%n", promedio);

    }

    public static void main(String[] args){
        int[] numeros = {15,-3,0,8,-12,7,0,22,-5,10};
        clasificar(numeros);

    }


}
