package concrete;

import contract.Visitable;
import contract.Visitor;

public class VisitableA implements Visitable {

    int numberOfMember;

    public VisitableA(int numberOfMember) {
        this.numberOfMember = numberOfMember;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}