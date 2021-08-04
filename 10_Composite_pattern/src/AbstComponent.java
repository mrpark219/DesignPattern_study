abstract public class AbstComponent {

    String name;

    public AbstComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract void show(int depth);
}
