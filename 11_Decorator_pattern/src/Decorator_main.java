public class Decorator_main {

    public static void main(String[] args) {

        /*
            Decorator Pattern(데코레이터 패턴)
            상속과 합성을 사용하여 주어진 상황 및 용도에 따라 어떤 객체에 책임을 덧붙이는 패턴으로,
            기능 확장이 필요할 때 서브 클래싱 대신 사용할 수 있는 유연성을 갖는다.
         */

        Beverage espresso = new Whip(new Mocha(new Espresso()));

        System.out.println("음료: " + espresso.getDescription());
        System.out.println("가격: " + espresso.cost());
    }
}
