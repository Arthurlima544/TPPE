package composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements Component{
    private List<Component> children;

    Box() {
        children = new ArrayList<>();
    }

    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }

    public List<Component> getChildren() {
        return children;
    }
    
    @Override
    public double calculate() {
        double total = 0;
        for (Component child : children) {
            total += child.calculate();
        }
        return total;
    }
}
