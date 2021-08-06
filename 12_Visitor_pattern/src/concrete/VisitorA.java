package concrete;

import contract.Visitable;
import contract.Visitor;

public class VisitorA implements Visitor {

    private int nubmer;

    public VisitorA() {
        this.nubmer = 0;
    }

    @Override
    public void visit(Visitable visitable) {
        if(visitable instanceof VisitableA) {
            nubmer += ((VisitableA) visitable).numberOfMember;
        }
        else {
            //...
        }
    }

    public int getNubmer() {
        return nubmer;
    }

    public void setNubmer(int nubmer) {
        this.nubmer = nubmer;
    }
}