package exercicio;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import palindromo.Palindromo;

import exercicio.App;


@RunWith(Parameterized.class)
public class Teste {
    String string, command, expectedResult;
    App a;

    public Teste(String str, String com, String exp){
        this.string = str;
        this.command = com;
        this.expectedResult = exp;
        
    }

    @Parameters
    public static Iterable<Object[]> getParameters(){
        return Arrays.asList(new Object[][] { 
            {"abc", "y3p","abcabcabc" },
            {"abc", "y4p","abcabcabcabc" },
            {"abc", "y10p","abcabcabcabcabcabcabcabcabcabc"},
            {"abcdedcba", "s/c/d/g","abddeddba"},
            {"cccccccc", "s/c/d/g","dddddddd"},
            //TODO: Test case 3
        });
    
    }

    @Test
    public void test() {
        a =  new App(string, command);
        assertEquals(a.result(), expectedResult);
    }

    

}
