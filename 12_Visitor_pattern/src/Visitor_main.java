import concrete.VisitableA;
import concrete.VisitorA;
import contract.Visitable;

import java.util.ArrayList;

public class Visitor_main {

    public static void main(String[] args) {

        /*
            Visitor Pattern(방문자 패턴)
            데이터 구조와 연산을 분리하여 인스턴스 필드를 변경하지 않고 새로운 연산을 추가하는 패턴이다.
         */

        ArrayList<Visitable> visitables = new ArrayList<>();

        visitables.add(new VisitableA(1));
        visitables.add(new VisitableA(2));
        visitables.add(new VisitableA(3));
        visitables.add(new VisitableA(4));
        visitables.add(new VisitableA(5));

        VisitorA visitor = new VisitorA();

        for(Visitable visitable : visitables) {
            visitable.accept(visitor);
        }
        System.out.println(visitor.getNubmer());
    }
}
