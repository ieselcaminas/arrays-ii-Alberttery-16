import java.util.Arrays;
import java.util.Scanner;

public class Eliminar {
    public static int[] eliminar(int[] cadena, int posicion){
        int [] cadena2 = new int[cadena.length];
        for (int i = 0; i < posicion; i++) {
            cadena2[i]=cadena[i];
        }
        for (int i = posicion+1; i < cadena.length ; i++) {
            cadena2[i-1]=cadena[i];
        }
        cadena2[(cadena.length-1)]=cadena[posicion];
        return cadena2;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] cadena={1,2,3,4,5};
        System.out.println("Dime que posicion quieres eliminar:");
        int posicion=sc.nextInt()-1;
        if(posicion> cadena.length){
            System.out.println("Esta posición no existe en la lista.");
        }else{
            System.out.println(Arrays.toString(eliminar(cadena,posicion)));
        }
    }
}