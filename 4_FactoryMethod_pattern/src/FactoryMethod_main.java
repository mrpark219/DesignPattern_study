import concrete.HpCreator;
import concrete.MpCreator;
import framework.Item;
import framework.ItemCreator;

public class FactoryMethod_main {

    /*
        FactoryMethod Pattern(팩토리 메서드 패턴)
        객체 생성 처리를 서브 클래스로 분리하여 처리하도록 캡슐화하는 패턴으로, 객체의 생성 코드를 별도의 클래스/메서드로
        분리함으로써 객체 생성의 변화에 대비하는데 유용하다.
     */

    public static void main(String[] args) {
        ItemCreator creator;
        Item item;

        creator = new HpCreator();
        item = creator.create();
        item.use();

        creator = new MpCreator();
        item = creator.create();
        item.use();
    }
}
