package Aula4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
    TestNumero.class, TestOrdenacao.class, TestInsercaoDeElemento.class, 
    InsercaoDeElemento.class, TestInsercaoDeElemento.class
})
public class AllTests {
    
}
