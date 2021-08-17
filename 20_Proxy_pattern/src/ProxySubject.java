public class ProxySubject implements Subject {

    private Subject realSubject;

    public ProxySubject(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void action1() {
        System.out.println(this + ": Action1");
    }

    @Override
    public void action2() {
        if(realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.action2();
    }
}
