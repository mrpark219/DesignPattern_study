public class SystemSpeaker {

    private static SystemSpeaker instance;
    private int volume;

    private SystemSpeaker() {
        volume = 5;
    }

    public static SystemSpeaker getInstance() {
        if(instance == null) {
            instance = new SystemSpeaker();
            System.out.println("인스턴스 생성: " + instance);
        }
        else {
            System.out.println("인스턴스 재사용: " + instance);
        }
        return instance;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}