package state;

public class State_main {

    public static void main(String[] args) {

        /*
           State Pattern(상태 패턴)
           객체가 특정 상태에 따라 행위를 달리하는 상황에서, 자신이 직접 상태를 체크하여 상태에 따라
           행위를 호출하지 않고, 상태를 객체화하여 행동할 수 있도록 위임하는 패턴이다.
         */

        Light light = new Light();

        light.off();
        light.off();
        light.off();

        light.on();
        light.on();
        light.on();

        light.off();
        light.on();
        light.off();
        light.on();
        light.off();
        light.on();
    }
}