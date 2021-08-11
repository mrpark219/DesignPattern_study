import java.util.Observable;

public class Button extends Observable {

    public void onCLick() {
        setChanged();
        notifyObservers();
    }

}