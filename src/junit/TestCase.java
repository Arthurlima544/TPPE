package junit;

public class TestCase extends AdapterClass implements Test {

    @Override
    public void run(TestResult testResult) {
        if(testResult instanceof FailureTestResult) {
            //? return an exception
        }
        //? do nothing
    }
    public void setUp() {
        
    }
    public void tearDown() {
        
    }
    @Override
    public void runTest() {
       
    }

}
