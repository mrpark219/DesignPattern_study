public class ComputerFactory {

    private AbstBluePrint bluePrint;

    public void setBluePrint(AbstBluePrint bluePrint) {
        this.bluePrint = bluePrint;
    }

    public void makeComputer() {
        bluePrint.createNewComputer();
        bluePrint.makeComputer();
    }

    public Computer getComputer() {
        return bluePrint.getComputer();
    }
}