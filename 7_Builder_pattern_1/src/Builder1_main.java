public class Builder1_main {

    public static void main(String[] args) {

        /*
            Builder Patten(빌더 패턴)
            복합 객체의 생성 과정과 표현 방법을 분리하여 동일한 생성 절차에서 서로 다른 표현 결과를
            만들 수 있게 하는 패턴이다.
         */

        ComputerFactory factory = new ComputerFactory();
        AbstBluePrint bluePrintA = new ABluePrint();
        AbstBluePrint bluePrintB = new BBluePrint();


        factory.setBluePrint(bluePrintA);
        factory.makeComputer();
        Computer computerA = factory.getComputer();
        System.out.println(computerA.toString());

        factory.setBluePrint(bluePrintB);
        factory.makeComputer();
        Computer computerB = factory.getComputer();
        System.out.println(computerB.toString());
    }
}
