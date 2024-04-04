package Aula3.parameterized_tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import Aula3.Calculadora;

@RunWith(Parameterized.class)
public class CalculadoraTesteParametrizado {
    @Parameters(name = "{index}: {0} e {1} add {2} sub {3}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] { 
            { 0, 0, 0,0 }, { 1, 1, 2, 0},
            { 3, 2, 5 , 1}, { 4, 3, 7 , 1}, 
            { 5, 4, 9 , 1}, {-1, 3, 2, -4}, 
            { 3, -1, 2 , 4}, { -1, -1, -2 ,0}
        });
    }
    private int opt1, opt2, sum, sub;
    private Calculadora calc;

    public CalculadoraTesteParametrizado(int opt1, int opt2, int sum, int sub) {
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.sum = sum;
        this.sub = sub;
        this.calc = new Calculadora(this.opt1, this.opt2);
    }
     @Test
        public void test() {
            assertEquals(sum, calc.sum());
        }

        @Test
        public void testSub() {
            assertEquals(sub, calc.sub());
        }

}
