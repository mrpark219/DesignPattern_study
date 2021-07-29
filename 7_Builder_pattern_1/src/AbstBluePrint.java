public abstract class AbstBluePrint {

    protected Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public void createNewComputer() {
        computer = new Computer();
    }

    public abstract void makeComputer();
}
