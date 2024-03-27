package structural_patterns.adapter.object;

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
