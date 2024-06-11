package Aula4;

import org.junit.Before;
import org.junit.Test;

public class InsercaoDeElemento {
    Ordenacao o;

    @Before
    public void setup(){
        o = new Ordenacao(new int[] {3,4,1});
    }


    @Test(expected = ElementoDuplicadoException.class)
    public void testAdicionarDuplicado() throws ElementoDuplicadoException {
        o.inserir(1);
    }
}
