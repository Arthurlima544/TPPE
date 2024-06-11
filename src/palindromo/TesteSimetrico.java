package palindromo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import Aula4.Ordenacao;

@RunWith(Parameterized.class)
public class TesteSimetrico {

    private Palindromo p;
    private String str;
    private boolean respostaEsperada;

    @Before
    public void setup(){
        p = new Palindromo(str);
    }
    public TesteSimetrico(String str, boolean res){
        this.str = str;
        this.respostaEsperada = res;
    }

    @Parameters
    public static Object[][] getParameters(){
        return new Object[][] {
            {"ovo", true},
            {"andre", false},
            {"arara", true}
        };
    }


    

    @Test
    public void test(){
        assertEquals(respostaEsperada, p.ehPalindromo());
    }

}
