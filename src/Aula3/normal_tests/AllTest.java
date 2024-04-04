package Aula3.normal_tests;

import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@ExcludeCategory({OperadorNull.class, OperadorNegativo.class})
@SuiteClasses({TesteSoma.class, TesteSubtracao.class})
public class AllTest {
    
}
