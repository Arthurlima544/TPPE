package junit;

import java.util.List;
import java.util.ArrayList;

public class TestSuite implements Test {
    List<Test> tests ;

    TestSuite() {
        tests = new ArrayList<Test>();
    }

    public void addTest(Test test) {
        tests.add(test);
    }
    
    @Override
    public void run(TestResult testResult) {
        for (Test test : tests) {
            test.run(testResult);
        }
    }

}
