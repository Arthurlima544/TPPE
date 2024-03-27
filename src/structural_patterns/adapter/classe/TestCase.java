package structural_patterns.adapter.classe;

public class TestCase extends Adapter{
    @Override
    public void runTest(Object data) {
        System.out.println("Real implementation...");
    }
}
