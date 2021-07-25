public class Singleton_main {

    public static void main(String[] args) {

        /*
            Singleton Patten(싱글톤 패턴)
            애플리케이션이 시작될 때 어떤 클래스가 최초 한 번만 메모리를 할당하고,
            그 메모리에 인스턴스를 만들어 사용하는 패턴이다.
         */
        
        SystemSpeaker speaker1 = SystemSpeaker.getInstance();
        SystemSpeaker speaker2 = SystemSpeaker.getInstance();

        System.out.println("speaker1: " + speaker1.getVolume());
        System.out.println("speaker2: " + speaker2.getVolume());

        speaker1.setVolume(10);
        System.out.println("speaker1: " + speaker1.getVolume());
        System.out.println("speaker2: " + speaker2.getVolume());

        speaker2.setVolume(20);
        System.out.println("speaker1: " + speaker1.getVolume());
        System.out.println("speaker2: " + speaker2.getVolume());
    }
}
