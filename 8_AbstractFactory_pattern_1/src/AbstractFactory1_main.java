import abst.BikeFactory;
import abst.Body;
import abst.Wheel;
import gt.GtFactory;

public class AbstractFactory1_main {

    public static void main(String[] args) {

        /*
            Abstract Factory Patten(추상 팩토리 패턴)
            구체적인 클래스에 의존하지 않고 서로 연관되거나 의존적인 객체들의 조합을 만드는 인터페이스를
            제공하는 패턴이다.
         */

        //BikeFactory factory = new SamFactory();
        BikeFactory factory = new GtFactory();

        Body body = factory.createBody();
        Wheel wheel = factory.createWheel();

        System.out.println(body.getClass());
        System.out.println(wheel.getClass());
    }
}
