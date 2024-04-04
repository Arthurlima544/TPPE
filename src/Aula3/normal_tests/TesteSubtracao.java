package Aula3.normal_tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import Aula3.Calculadora;

public class TesteSubtracao {
    @Test
    public void testeSubtracaoDoisInteirosPositivos(){
        Calculadora calc = new Calculadora(3,2);
       
        assertEquals(calc.sub(), 1);
    }
    @Test
    @Category({OperadorNegativo.class})
    public void testeSubtracaoDoisInteirosNegativos(){
        Calculadora calc = new Calculadora(-3, 2);

        assertEquals(calc.sub(), -5);
    
    }

    @Test
    @Category({OperadorNegativo.class})
    public void testeSubtracaoDoisInteirosPositivoMaiorModulo(){
        Calculadora calc = new Calculadora(3, -2);

        assertEquals(calc.sub(), 5);
    
    }
    @Test
    @Category({OperadorNegativo.class})
    public void testeSubtracaoDoisInteirosPositivoMenorModulo(){
        Calculadora calc = new Calculadora(-3,2);
      
        assertEquals(calc.sub(), -5);
    }

    @Test
    @Category({OperadorNull.class})
    public void testeSubtracaoZeroInteiroPositivo(){
        Calculadora calc = new Calculadora(0,3);
       
        assertEquals(calc.sub(), -3);
    }

    @Test
    public void testeSubtracaoInteirosComplementares(){
        Calculadora calc = new Calculadora(5,-5);
      
        assertEquals(calc.sub(), 10);
    }
}
