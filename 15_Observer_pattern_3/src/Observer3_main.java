public class Observer3_main {

    public static void main(String[] args) {

        /*
            1. 제네릭
            2. 델리게이트
            3. 내부에 옵저버를 넣는다.
         */

        Button button = new Button();

        button.addObserver((o, arg) -> System.out.println(o + " is clicked"));

        button.onClick();
        button.onClick();
    }
}