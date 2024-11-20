import java.util.Scanner;

public class Longitud1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena de texto:");
        String texto = scanner.nextLine();
        int k = 0;

        System.out.print("Ingresa la longitud de las palabras que deseas contar: ");
        k = scanner.nextInt();

        String[] palabras = texto.split("\\s+");
        int contador = 0;


        for (String palabra : palabras) {
            if (palabra.length() == k) {
                contador++;
            }
        }

        System.out.println("Hay " + contador + " palabras con " + k + " caracteres.");
    }
}

