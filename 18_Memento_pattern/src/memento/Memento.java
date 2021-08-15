package memento;

public class Memento {

    String state;

    //protected를 통해서 같은 패키지에서만 Memento 생성 가능 -> 외부 조작 방지
    protected Memento(String state) {
        this.state = state;
    }

    protected String getState() {
        return state;
    }
}
