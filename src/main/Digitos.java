public class Digitos {
    public static void main(String[] args) {
        String cadena = "todo suma 345323 :)";
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isDigit(cadena.charAt(i))) {
                contador++;
            }
        }

        System.out.println("En esta frase hay " + contador + " digitos.");
    }
}
