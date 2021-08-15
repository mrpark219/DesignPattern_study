import memento.CareTaker;
import memento.Originator;

public class Memento_main {

    public static void main(String[] args) {

        /*
            Memento Pattern(메멘토 패턴)
            객체의 상태 정보를 저장하고, 사용자의 필요에 의하여 원하는 시점의 데이터를 복원할 수 있는 패턴이다.
         */

        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();

        originator.setState("State1");
        careTaker.push(originator.createMemento());
        originator.setState("State2");
        careTaker.push(originator.createMemento());
        originator.setState("State3");
        careTaker.push(originator.createMemento());
        originator.setState("State Final");
        careTaker.push(originator.createMemento());

        originator.restoreMemento(careTaker.pop());
        System.out.println(originator.getState());

        originator.restoreMemento(careTaker.pop());
        System.out.println(originator.getState());

        originator.restoreMemento(careTaker.pop());
        System.out.println(originator.getState());

        originator.restoreMemento(careTaker.pop());
        System.out.println(originator.getState());
    }
}