public class Adapter_main {

    public static void main(String[] args) {
        
        /*
            한 클래스의 인터페이스를 클라이언트에서 사용하고자 하는 다른 인터페이스로 변환한다.
            어댑터를 이용하면 인터페이스 호환성 문제 때문에 같이 사용할 수 없는 클래스들을 연결해서 쓸 수 있다.
            전기 플러그에서 110v에서 220v로 변환하기 위해 사용하는 어댑터와 동일한 기능을 한다.
         */
        
        Adapter adapter = new AdapterImpl();

        System.out.println(adapter.twiceOf(100F));
        System.out.println(adapter.twiceOf(200F));
        System.out.println(adapter.half(100F));
        System.out.println(adapter.half(200F));
        System.out.println(adapter.enhancedTwiceOf(100F));
        System.out.println(adapter.enhancedTwiceOf(200F));

    }
}
