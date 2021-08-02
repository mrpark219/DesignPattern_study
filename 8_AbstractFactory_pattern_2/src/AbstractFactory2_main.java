import abst.Button;
import abst.GUIFactory;
import abst.TextArea;
import concrete.GUIFactoryInstance;

public class AbstractFactory2_main {

    public static void main(String[] args) {

        GUIFactory guiFactory = GUIFactoryInstance.getGUIFactory(2);

        Button button = guiFactory.createButton();
        TextArea textArea = guiFactory.createTextarea();

        button.click();
        System.out.println(textArea.getText());
    }
}