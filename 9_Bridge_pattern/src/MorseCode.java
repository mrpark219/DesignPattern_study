public class MorseCode {

    private MorseCodeFunction morseCodeFunction;

    public MorseCode(MorseCodeFunction morseCodeFunction) {
        this.morseCodeFunction = morseCodeFunction;
    }

    public void setMorseCodeFunction(MorseCodeFunction morseCodeFunction) {
        this.morseCodeFunction = morseCodeFunction;
    }

    public void dot() {
        morseCodeFunction.dot();
    }

    public void dash() {
        morseCodeFunction.dash();
    }

    public void space() {
        morseCodeFunction.space();
    }
}
