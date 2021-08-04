public class Composite_main {

    public static void main(String[] args) {

        /*
            Composite Pattern(컴포지트 패턴)
            전체의 계층을 하나의 인터페이스로 통합해서 트리구조로 구성하는 구조 패턴이다.
            개별 객체와 복합 객체를 모두 표현할 수 있는 하나의 추상화 클래스를 정의하는 것이 중요하다.
            전체-부분의 관계(폴더-파일)를 갖는 객체들 사이의 관계를 정의할 때 유용하다.
         */

        Folder root = new Folder("root"); Folder home = new Folder("home"); Folder usr = new Folder("usr");
        Folder park = new Folder("park"); Folder code = new Folder("code"); Folder picture = new Folder("picture");

        File code1 = new File("code1"); File code2 = new File("code2"); File pic1 = new File("pic1");
        File test = new File("test");

        root.addComponent(home);
            home.addComponent(park);
                park.addComponent(code);
                    code.addComponent(code1);
                    code.addComponent(code2);
                park.addComponent(picture);
                    picture.addComponent(pic1);
        root.addComponent(usr);
            usr.addComponent(test);

        root.show(0);
        System.out.println("---------------------------------------------------------------");
        park.show(0);
    }
}
