public class Proxy_main {

    public static void main(String[] args) {

        /*
            Proxy Patern(프록시 패턴)
            실제 기능을 수행하는 객체(Real) 대신 가상의 객체(Proxy)를 사용해 로직의 흐름을 제어하는 디자인 패턴이다.
            리소스가 많이 필요한 객체가 로딩되기 전에 프록시를 참조할 수 있다.
         */

        Subject realSubject = new RealSubject();
        Subject proxySubject1 = new ProxySubject(realSubject);
        Subject proxySubject2 = new ProxySubject(realSubject);

        proxySubject1.action1();
        proxySubject2.action1();
        proxySubject1.action2();
        proxySubject2.action2();
    }
}