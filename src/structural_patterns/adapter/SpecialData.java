package structural_patterns.adapter;

public class SpecialData {
    public String data;

    SpecialData(String data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return data;
    }
}
