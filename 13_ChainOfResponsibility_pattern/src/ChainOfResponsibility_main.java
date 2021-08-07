public class ChainOfResponsibility_main {

    public static void main(String[] args) {

        /*
            Chain Of Responsibility Pattern(책임 사슬 패턴)
            요청이 주어질 때 사슬에 속해있는 각 객체는 자기가 받은 요청을 검사하여 직접 처리하거나
            사슬에 들어있는 다른 객체에 넘겨 처리하는(책임을 넘기는) 패턴이다.
         */

        Calculator addCalculator = new AddCalculator();
        Calculator subCalculator = new SubCalculator();

        addCalculator.setNextCalculator(subCalculator);

        Request request1 = new Request(10, 5, "+");
        Request request2 = new Request(10, 5, "-");
        Request request3 = new Request(10, 5, "*");

        addCalculator.process(request1);
        addCalculator.process(request2);
        addCalculator.process(request3);
    }
}