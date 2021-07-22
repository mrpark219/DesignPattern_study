package module;

public abstract class AbstGameConnectHelper {
    
    //여기서 알고리즘의 흐름과 순서 정의 
    
    abstract protected String doSecurity(String decodedString);

    abstract protected boolean authentication(String id, String pw);

    abstract protected int authorization(String userName);

    abstract protected String connection(String info);

    public String requestConnection(String encodedInfo) {

        //보안 작업 -> 암호화된 문자열을 복호화
        String decodedInfo = doSecurity(encodedInfo);

        //복호화된 정보를 가지고 아이디, 암호 할당
        String id = "id";
        String pw = "pw";
        if(!authentication(id, pw)) {
            throw new Error("아이디, 암호 불일치 에러") ;
        }

        String userName = "userName";
        int i = authorization(userName);

        switch (i) {
            case -1: //사용권한 없음(셧다운제)
                break;
            case 0: //게임 매니저
                break;
            case 1: //유료 회원
                break;
            case 2: //무료 회원
                break;
            case 3: //사용권한 없음
                break;
            default: //오류 발생
                throw new Error("사용권한 에러");
        }

        return connection(decodedInfo);
    }


}
