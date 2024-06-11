package Aula4;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestOrdenacao {
    private Ordenacao o;

    int[] numeros, respostaEsperada;

    @Before
    public void setup(){
        o = new Ordenacao(numeros);
    }

    @Test
    public void test(){
        assertNotNull(o);
        Numero result[] = o.getterNumeros();
        assertTrue(ComparadorDeVetores.compararVetores(respostaEsperada, result));
    }
    //Metodo construtor do obj de teste
    public TestOrdenacao(int[] numeros, int[] respostaEsperada){
        this.numeros = numeros;
        this.respostaEsperada = respostaEsperada;
    }

    @Parameters
    public static Object[][] getParameters(){
        int[] r1 = new int[] {8,3,6};
        int[] r2 = new int[] {8,3,6};
        int[] r3 = new int[] {3,8,4};
        int[] r4 = new int[] {3,8,4};
        int[] r5 = new int[] {2,7,4,5,6};
        int[] r6 = new int[] {2,7,4,5,6};
        return new Object[][]{
            {r1,r2},
            {r3,r4},
            {r5,r6},
        };
    }
}
