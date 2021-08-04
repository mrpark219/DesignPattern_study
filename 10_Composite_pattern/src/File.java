public class File extends AbstComponent {

    Object data;

    public File(String name) {
        super(name);
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public void show(int depth) {
        for(int i = 0; i < depth; i++) {
            System.out.print("    ");
        }
        System.out.println("file-> " + this.name);
    }
}
