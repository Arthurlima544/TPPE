package structural_patterns.adapter;

public class Adapter implements ClientInteface {
    private Service adaptee;

    Adapter() {
        adaptee = new Service();
    }

    @Override
    public void method(Object data) {
        if(data instanceof Integer){
            SpecialData newData = new SpecialData(data.toString());
            adaptee.printOnTerminalSpecialData(newData);
        }else if(data instanceof String){
            adaptee.printOnTerminalSpecialData((SpecialData)data);
        }
    }
}