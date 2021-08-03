public class SoundMorseCode implements MorseCodeFunction {

    @Override
    public void dot() {
        System.out.print("점");
    }

    @Override
    public void dash() {
        System.out.print("선");
    }

    @Override
    public void space() {
        System.out.print(" ");
    }
}
