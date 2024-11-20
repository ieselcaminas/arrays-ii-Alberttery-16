import static org.junit.jupiter.api.Assertions.*;

public class SumaIgualTest {
    @org.junit.jupiter.api.Test
    public void testIguales_SumaIgualANumeroEspecificado() {
        int[] nums = {1, 2, 3, 4};
        String resultadoEsperado = "La suma de los elementos no es igual a la suma de las parejas de elementos.";
        assertEquals(resultadoEsperado, SumaIgual.iguales(nums));
    }
}


