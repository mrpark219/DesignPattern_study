public abstract class Calculator {

    private Calculator nextCalculator;

    public void setNextCalculator(Calculator nextCalculator) {
        this.nextCalculator = nextCalculator;
    }

    public boolean process(Request request) {
        if(operator(request)) {
            return true;
        }
        else {
            if(nextCalculator != null) {
               return nextCalculator.process(request);
            }
        }
        System.out.println("연산을 수행할 수 없습니다.");
        return false;
    }

    abstract protected boolean operator(Request reqeust);
}