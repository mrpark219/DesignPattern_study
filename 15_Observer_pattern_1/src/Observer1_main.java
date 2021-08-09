public class Observer1_main {

    public static void main(String[] args) {

        /*
            Observer Pattern(옵저버 패턴)
            객체의 상태 변화를 관찰하는 관찰자들로, 옵저버들의 목록을 객체에 등록하여 상태가 변화될 때마다
            메서드 등을 통해 객체가 직접 모든 옵저버들에게 통지하도록 하는 패턴이다.
         */

        Button button = new Button();

        button.setOnClickListener(button1 -> System.out.println(button1 + " is Clicked"));
        button.onClick();
        button.onClick();
    }
}