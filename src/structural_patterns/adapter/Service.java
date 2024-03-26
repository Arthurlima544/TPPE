package structural_patterns.adapter;

public class Service {
    public void printOnTerminalSpecialData(SpecialData specialData){
        System.out.println("Special data: " + specialData);
    }
}
