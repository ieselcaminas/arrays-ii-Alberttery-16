public class Digitos2 {
    public static void main(String[] args) {
        String cadena = "ea ea 12 miau miau 12 12";
        int contador = 0;
        String[] palabras = cadena.split(" ");

        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isDigit(cadena.charAt(i))) {
            contador++;
            }
        }
        System.out.println("Hay " + contador + " digitos");
    }
}
