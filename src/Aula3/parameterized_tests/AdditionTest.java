package Aula3.parameterized_tests;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Parameter;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
 public class AdditionTest {
    @Parameters(name = "{index}: {0} + {1} = {2}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] { { 0, 0, 0,0 }, { 1, 1, 2, 0},
         { 3, 2, 5 , 1}, { 4, 3, 7 , 1} });
        }
   
        private int firstSummand;
   
        private int secondSummand;
   
        private int sum;
        private int sub;

        public AdditionTest(int firstSummand, int secondSummand, int sum, int sub) {
            this.firstSummand = firstSummand;
            this.secondSummand = secondSummand;
            this.sum = sum;
            this.sub = sub;
        }
        @Test
        public void test() {
            assertEquals(sum, firstSummand + secondSummand);
        }

        @Test
        public void testSub() {
            assertEquals(sub, firstSummand - secondSummand);
        }
}