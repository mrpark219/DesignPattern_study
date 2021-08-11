

public class Observer2_main {

    public static void main(String[] args) {

        /*
            Observer(View), Observable(Model, Subject) 사용하여 옵저버 패턴 구현
            Observer: 관찰자, Observable: 주체 -> 주체는 관찰자에게 상태변경을 알려준다.
            ※ https://johngrib.github.io/wiki/observer-pattern/
            -> "Java 내장 Observable, Observer는 왜 deprecated 되었을까?" 참고
         */
        
        Button button = new Button();

        button.addObserver((o, arg) -> System.out.println(o + " is Clicked"));

        button.onCLick();
        button.onCLick();
    }
}