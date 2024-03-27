package structural_patterns.adapter.object;

public class Client {
    public static void main(String[] args) throws Exception {
        ClientInteface client = new Adapter();

        client.method(1122);
    }
}
