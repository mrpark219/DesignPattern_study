public class Prototype2_main {

    public static void main(String[] args) throws CloneNotSupportedException {

        /*
            객체를 복사할 때 얕은 복사, 깉은 복사 두 가지 개념이 있다.
            -얕은(Shallow) 복사: 객체를 복사할 때 해당 객체만 복사하여 새 객체를 생성한다.
                -> 복사된 객체의 인스턴스 변수는 원본 객체의 인스턴스 변수와 동일한 메모리 주소를 참조한다.
                -> 해당 메모리 주소의 값이 변경되면 원본 객체와 복사된 객체의 인스턴스 변수 값은 값이 변경된다.
            -깊은(Deep) 복사: 객체를 복사할 때 해당 객체와 인스턴스 변수까지 복사한다.
                ->전부를 복사하여 새 주소에 담기 때문에 참조를 공유하지 않는다.
         */

        Cat navi = new Cat("navi", new Age("2020", 1));

        Cat naviShallow = navi;
        Cat naviDeep = navi.copy();

        System.out.println("초기화");
        System.out.println("navi: " + navi.getName() + ", " + navi.getAge().toString());
        System.out.println("naviShallow: " + naviShallow.getName() + ", " + naviShallow.getAge().toString());
        System.out.println("naviDeep: " + naviDeep.getName() + ", " + naviDeep.getAge().toString());
        System.out.println();

        naviShallow.setName("naviShallow");
        naviShallow.getAge().setBirthDay("2019");
        naviShallow.getAge().setAge(2);

        System.out.println("naviShallow 변경");
        System.out.println("navi: " + navi.getName() + ", " + navi.getAge().toString());
        System.out.println("naviShallow: " + naviShallow.getName() + ", " + naviShallow.getAge().toString());
        System.out.println("naviDeep: " + naviDeep.getName() + ", " + naviDeep.getAge().toString());
        System.out.println();

        naviDeep.setName("naviDeep");
        naviDeep.getAge().setBirthDay("2021");
        naviDeep.getAge().setAge(0);

        System.out.println("naviDeep 변경");
        System.out.println("navi: " + navi.getName() + ", " + navi.getAge().toString());
        System.out.println("naviShallow: " + naviShallow.getName() + ", " + naviShallow.getAge().toString());
        System.out.println("naviDeep: " + naviDeep.getName() + ", " + naviDeep.getAge().toString());
    }
}
