package Aula4;

import static org.junit.Assert.assertEquals;

import java.util.Collection;

import org.junit.Before;
import  org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestNumero {
    Numero n;

    int numero, respostaEsperada;

    // Metodo construtor
    public TestNumero(int numero, int respostaEsperada){
        this.numero = numero;
        this.respostaEsperada = respostaEsperada;
    }

    //Metodo que retorna os parametros do objeto de teste
    @Parameters
    public static Object[][] getParameters(){
        return new Object[][]{
            {1, 1},
            {-1, -1},
            {2, 2},
        };
    }

    @Before
    public void setup(){
        n =  Numero.getInstance(numero);
    }

    @Test
    public void test() {
        assertEquals(respostaEsperada, n.getNumero());
    }
}
