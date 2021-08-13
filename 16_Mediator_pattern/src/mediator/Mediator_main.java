package mediator;

import contract.Colleague;
import contract.Mediator;

public class Mediator_main {

    public static void main(String[] args) {

        /*
            Mediator Pattern(중재자 패턴)
            모든 클래스간의 복잡한 로직(상호작용)을 캡슐화하여 하나의 클래스에 위임하여 처리하는 패턴이다.
            M:N의 관계에서 M:1의 관계로 복잡도를 떨어뜨린다.
            EX)채팅, 비행기와 관제탑
         */

        Mediator mediator = new ChatMediator();

        Colleague colleague1 = new ChatColleague();
        Colleague colleague2 = new ChatColleague();
        Colleague colleague3 = new ChatColleague();

        colleague1.register(mediator);
        colleague2.register(mediator);
        colleague3.register(mediator);

        colleague1.sendData("colleague1 Data");
        colleague2.sendData("colleague2 Data");
        colleague3.sendData("colleague3 Data");
    }
}