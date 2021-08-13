package mediator;

import contract.Colleague;
import contract.Mediator;

public class ChatMediator extends Mediator {

    @Override
    public void mediate(String data) {
        for (Colleague colleague : colleagues) {
            //보낼 대상 처리 부분
            colleague.handle(data);
        }
    }
}