public class Longitud3 {
    public static void main(String[] args) {
        String cadena = "esta es la frase, casfsembialda si quisefaseferes miau easfmiau misefasfau miau sefafseff dfasf sfas dfsdfefsefsefasefa asdf sdfaer  wgadfgadfa ef wedfgbafgadfgd fsfdfgdfgdfgasfefasefdf se f sf wefawe fasefasge easefefasefasef fas ef ase efsefasefasefasfsefsef a:)";
        int num = 20;  //numero de letras que tiene que tener la palabra
        int contador = 0;
        String[] palabras = cadena.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() >= num) {
                contador++;
            }
        }

        if (contador != 0) {
            System.out.println("Hay " + contador + " palabras de " + num + " o mas letras" );
        } else {
            System.out.println("Todas las palabras son menores de " + num + " caracteres");
        }

    }
}
