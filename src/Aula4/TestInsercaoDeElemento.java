package Aula4;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestInsercaoDeElemento {
    private Ordenacao o;

    int[] vetorAntigo, respostaEsperada;
    int numeroInserido;

    @Before
    public void setup(){
        o = new Ordenacao(vetorAntigo);
    }

    public TestInsercaoDeElemento(int[] vetorAntigo, int numeroInserido, int[] respostaEsperada){
        this.vetorAntigo = vetorAntigo;
        this.numeroInserido = numeroInserido;
        this.respostaEsperada = respostaEsperada;
    }

    @Parameters
    public static Object[][] getParameters(){
        int[] r1 = new int[] {3,4,5};
        int[] r2 = new int[] {3,4,5,6};
        int[] r3 = new int[] {7,5,6};
        int[] r4 = new int[] {7,5,6,9};
        int[] r5 = new int[] {-1,199,0};
        int[] r6 = new int[] {-1,199,0,-100000};
        return new Object[][] {
            {r1, 6, r2},
            {r3, 9, r4},
            {r5, -100000, r6}
        };
    }

    @Test
    public void test() throws ElementoDuplicadoException{
        assertNotNull(o);
        assertTrue(ComparadorDeVetores.compararVetores(respostaEsperada, o.inserir(numeroInserido)));
    }
}

