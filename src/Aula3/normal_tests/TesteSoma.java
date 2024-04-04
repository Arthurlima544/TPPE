package Aula3.normal_tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import Aula3.Calculadora;

public class TesteSoma {
    @Test
    public void testeSomaDoisInteirosPositivos(){
        Calculadora calc = new Calculadora(3,2);
       
        assertEquals(calc.sum(), 5);
    }
    @Test
    @Category({OperadorNegativo.class})
    public void testeSomaDoisInteirosNegativos(){
        Calculadora calc = new Calculadora(-3, 2);

        assertEquals(calc.sum(), -1);
    
    }

    @Test
    @Category({OperadorNegativo.class})
    public void testeSomaDoisInteirosPositivoMaiorModulo(){
        Calculadora calc = new Calculadora(3, -2);

        assertEquals(calc.sum(), 1);
    
    }
    @Test
    @Category({OperadorNegativo.class})
    public void testeSomaDoisInteirosPositivoMenorModulo(){
        Calculadora calc = new Calculadora(-3,2);
      
        assertEquals(calc.sum(), -1);
    }

    @Test
    @Category({OperadorNull.class})
    public void testeSomaZeroInteiroPositivo(){
        Calculadora calc = new Calculadora(0,3);
       
        assertEquals(calc.sum(), 3);
    }

    @Test
    public void testeSomaInteirosComplementares(){
        Calculadora calc = new Calculadora(5,-5);
      
        assertEquals(calc.sum(), 0);
    }

}


/** 
 * 3 2
 * -3 -2
 * 3 -2
 * -3 2
 * 3 0
 * 0 3
 * 3 0
 * 5 -5
 */
