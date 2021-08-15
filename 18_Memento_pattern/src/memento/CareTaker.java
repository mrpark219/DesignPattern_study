package memento;

import java.util.Stack;

public class CareTaker {

    private Stack<Memento> mementos = new Stack<>();

    public void push(Memento memento) {
        mementos.push(memento);
    }

    public Memento pop() {
        return mementos.pop();
    }
}