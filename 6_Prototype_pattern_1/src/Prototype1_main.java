public class Prototype1_main {

    public static void main(String[] args) throws CloneNotSupportedException {

        /*
            원형이 되는 인스턴스로 새로운 인스턴스를 만드는 방식으로, 객체에 의해 생성될 객체의 타입이
            결정되는 생성 디자인 패턴이다.
         */

        Circle circle1 = new Circle(1, 1, 5);
        Circle circle2 = circle1.copy();

        System.out.println(circle1.toString());
        System.out.println(circle2.toString());
    }
}