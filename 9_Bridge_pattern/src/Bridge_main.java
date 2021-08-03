public class Bridge_main {

    public static void main(String[] args) {

        /*
            Bridge Patten(브리지 패턴)
            구현부에서 추상층을 분리하여 각자 독립적으로 변형, 확장할 수 있게 하는 패턴이다.
         */

        PrintMorseCode printMorseCode = new PrintMorseCode(new DefaultMorseCode());
        printMorseCode.p().a().r().k();
        System.out.println();
        printMorseCode.setMorseCodeFunction(new SoundMorseCode());
        printMorseCode.p().a().r().k();
    }
}
