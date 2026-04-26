package ejercicio4;

public class ManipuladorStrings {

    public static String invertir(String s) {
        StringBuilder s1 = new StringBuilder(s);
        return s1.reverse().toString();
    }

    public static boolean esPalindromo(String s) {

        s = s.toLowerCase();
        s = s.replace(" ", "");
        StringBuilder s1 = new StringBuilder(s);
        String s2 = s1.reverse().toString();


        return s.compareTo(s2) == 0;
    }

    public static int contarVocales(String s) {
        int count = 0;
        String vocales = "aeiouAEIOU";
        for (int i = 0; i < s.length(); i++){
            if(vocales.contains(s.charAt(i) + "" )){
                count++;

            }

        }
        return count;
    }

    public static String construirPiramide(int niveles) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= niveles; i++) {
            for (int j = 0; j < niveles - i; j++) {
                sb.append(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                sb.append("*");
            }
            if (i < niveles) {
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println("Invertir 'Hola Mundo': "
                + invertir("Hola Mundo"));
        System.out.println("'Anita lava la tina' es palindromo: "
                + esPalindromo("Anita lava la tina"));
        System.out.println("Vocales en 'Murcielago': "
                + contarVocales("Murcielago"));
        System.out.println("Piramide de 5 niveles:");
        System.out.println(construirPiramide(5));
    }
}