package Aula4;

import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestPesquisaNumero {
    Ordenacao o;
    int[] vetor;
    int elementoPesquisado;
    boolean respostaEsperada;

    public TestPesquisaNumero(int[] vetor, int elementoPesquisado, boolean respostaEsperada){
        this.elementoPesquisado = elementoPesquisado;
        this.vetor = vetor;
        this.respostaEsperada = respostaEsperada;
    }



    @Before
    public void setup(){
        o = new Ordenacao(vetor);
    }

    @Parameters
    public static Object[][] getParameters(){
        return new Object[][] {
            {new int[] {1,2,3}, 1, true},
            {new int[] {1,2,3}, 4, false},
        };
    }

    @Test
    public void testeElementoExistenteOuInexistente(){
        assertEquals(respostaEsperada, o.pesquisar(elementoPesquisado));
    }
    
}
