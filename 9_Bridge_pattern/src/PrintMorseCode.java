public class PrintMorseCode extends MorseCode {

    public PrintMorseCode(MorseCodeFunction morseCodeFunction) {
        super(morseCodeFunction);
    }

    public PrintMorseCode p() {
        dot(); dash(); dash(); dot(); space();
        return this;
    }

    public PrintMorseCode a() {
        dot(); dash(); space();
        return this;
    }

    public PrintMorseCode r() {
        dot(); dash(); dot(); space();
        return this;
    }

    public PrintMorseCode k() {
        dash(); dot(); dash(); space();
        return this;
    }
}
