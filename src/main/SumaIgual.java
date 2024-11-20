public class SumaIgual {
    public static String iguales(int[] nums) {
        String resultado = "";
        int suma1 = 0;
        int suma2 = 0;

        for (int i = 0; i < nums.length; i++) {
            suma1 += nums[i];
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                suma2 += nums[i] + nums[j];
            }
        }

        if (suma1 == suma2) {
            resultado = "La suma de los elementos es igual a la suma de las parejas de elementos.";
        } else {
            resultado = "La suma de los elementos no es igual a la suma de las parejas de elementos.";
        }
        return resultado;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 3, 5, 4, 1};
        System.out.println(iguales(nums));
    }
}
