package concrete;

import abst.Button;
import abst.GUIFactory;
import abst.TextArea;

public class GUIFactoryInstance {

    public static GUIFactory getGUIFactory(int type) {

        switch (type) {
            case 0: return new MacGUIFactory();
            case 1: return new LinuxGUIFactory();
            case 2: return new WinGUIFactory();
        }

        return null;
    }
}

class LinuxGUIFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextArea createTextarea() {
        return new LinuxTextarea();
    }
}

class LinuxButton implements Button {

    @Override
    public void click() {
        System.out.println("리눅스 버튼 클릭");
    }
}

class LinuxTextarea implements TextArea {

    @Override
    public String getText() {
        return "리눅스 텍스트에어리어 내용";
    }
}

class MacGUIFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextArea createTextarea() {
        return new MacTextarea();
    }
}

class MacButton implements Button {

    @Override
    public void click() {
        System.out.println("맥 버튼 클릭");
    }
}

class MacTextarea implements TextArea {

    @Override
    public String getText() {
        return "맥 텍스트에어리어 내용";
    }
}

class WinGUIFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public TextArea createTextarea() {
        return new WinTextarea();
    }
}

class WinButton implements Button {

    @Override
    public void click() {
        System.out.println("윈도우 버튼 클릭");
    }
}

class WinTextarea implements TextArea {

    @Override
    public String getText() {
        return "윈도우 텍스트에어리어 내용";
    }
}