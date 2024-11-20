public class Duplicados {

    public static String duplicados(int[]array){
        int num;
        String numeros=" ";
        for (int i = 0; i < array.length; i++) {
            num=array[i];
            for (int j = i+1; j < array.length; j++) {
                if(num==array[j]){
                    numeros+=num+" ";
                    break;
                }
            }
        }
        return numeros;
    }
    public static void main(String[] args) {
        int[] array={10,10,30,50,60,40,50};
        System.out.println("Los numeros duplicados son " + duplicados(array));
    }
}