package module;

public class DefaultGameConnectHelper extends AbstGameConnectHelper{

    // 여기서 알고리즘에 대한 세부 사항 변경
    @Override
    protected String doSecurity(String decodedString) {
        System.out.println("디코드 과정");
        return decodedString;
    }

    @Override
    protected boolean authentication(String id, String pw) {
        System.out.println("아이디, 비번 확인 과정");
        return true;
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("권한 확인 과정");
        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("연결 마지막 과정");
        return info;
    }
}
