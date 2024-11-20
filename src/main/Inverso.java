import java.util.Arrays;

public class Inverso {

    public static int[] Inverso(int[] numeros) {
        int[] resultado = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            resultado[i] = numeros[numeros.length - 1 - i];
        }
        return resultado;
    }
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] resultado = Inverso(numeros);

        System.out.println(Arrays.toString(resultado));
    }
}

