public class RealSubject implements Subject {

    @Override
    public void action1() {
        System.out.println(this + ": Action1");
    }

    @Override
    public void action2() {
        System.out.println(this + ": Action2");
    }
}