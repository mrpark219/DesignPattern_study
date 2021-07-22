import module.AbstGameConnectHelper;
import module.DefaultGameConnectHelper;

public class TemplateMethod_main {

    public static void main(String[] args) {
        
        /*
            TemplateMethod Pattern(템플릿 메서드 패턴)
            어떤 작업을 처리하는 일부분을 서브 클래스로 캡슐화하여 전체 일을 수행하는 구조는 바꾸지 않으면서
            특정 단게에서 수행하는 내역을 바꾸는 패턴이다.
            -> 전체적으로는 동일하면서 부분적으로는 다른 구문으로 구성된 메서드의 코드 중복을 최소화할 때 사용
         */
        
        AbstGameConnectHelper helper = new DefaultGameConnectHelper();
        
        helper.requestConnection("접속 정보");
    }
}
