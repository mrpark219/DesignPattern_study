public class Flyweight_main {

    public static void main(String[] args) {

        /*
            Flyweight Pattern(플라이웨이트 패턴)
            어떤 클래스의 인스턴스 한 개만 가지고 여러 개의 가상 인스턴스를 제공하고 싶을 때 사용하는 패턴이다.
            가능한 많은 데이터를 서로 공유하도록 하여 메모리 사용량을 최소화한다.
         */

        FlyweightFactory factory = new FlyweightFactory();

        Flyweight flyweight = factory.getFlyweight("A");
        System.out.println(flyweight);

        flyweight = factory.getFlyweight("A");
        System.out.println(flyweight);

        flyweight = factory.getFlyweight("A");
        System.out.println(flyweight);

        flyweight = factory.getFlyweight("B");
        System.out.println(flyweight);

        flyweight = factory.getFlyweight("B");
        System.out.println(flyweight);
    }
}