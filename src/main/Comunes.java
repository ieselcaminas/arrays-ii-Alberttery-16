public class Comunes {

    public static String comunes(int[] lista1, int[] lista2){

        String comunes="";
        for (int i = 0; i < lista1.length; i++) {
            for (int j = 0; j < lista2.length; j++) {
                if(lista1[i]==lista2[j] ){
                    comunes+=lista1[i]+" ";
                }
            }
        }
        return comunes;

    }
    public static void main(String[] args) {
        int [] lista1={1,2,3,4,5,6,7,8,9,10};
        int [] lista2={2,4,6,8,10,12,14,16,18,20};

        System.out.println(comunes(lista1,lista2));
    }
}