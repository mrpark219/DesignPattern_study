import java.util.ArrayList;
import java.util.List;

public class Folder extends AbstComponent {

    private List<AbstComponent> children = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public boolean addComponent(AbstComponent component) {
        return children.add(component);
    }

    public boolean removeComponent(AbstComponent component) {
        return children.remove(component);
    }

    public List<AbstComponent> getChildren() {
        return children;
    }

    public void show(int depth) {
        for(int i = 0; i < depth; i++) {
            System.out.print("    ");
        }
        depth++;
        System.out.println("->" + this.name);
        for(AbstComponent component : children) {
            component.show(depth + 1);
        }
    }
}
