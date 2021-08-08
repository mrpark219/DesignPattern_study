package facade;

import system.Facade;

public class Facade_main {

    public static void main(String[] args) {

        /*
            Facade Pattern(퍼사드 패턴)
            여러 서브 시스템을 간략하게 사용할 수 있게 해주는 태턴이다.
            작업의 복잡성을 숨기고, 사용자들에게는 간단한 인터페이스로 제공하는 패턴이다.
         */

        Facade facade = new Facade();

        facade.process();
    }
}