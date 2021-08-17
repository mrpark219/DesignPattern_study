public class StringPrintCommand implements Command {

    private String string;

    public StringPrintCommand(String string) {
        this.string = string;
    }

    public String getString() {
        return string;
    }

    @Override
    public void execute() {
        System.out.println(this.string);
    }

    @Override
    public int compareTo(Command o) {
        StringPrintCommand stringPrintCommand = (StringPrintCommand) o;
        return this.string.length() - stringPrintCommand.getString().length();
    }
}