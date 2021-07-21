public class AdapterImpl implements Adapter{

    @Override
    public float twiceOf(Float f) {
        System.out.println("twiceOf 실행");
        return (float) Math.twiceOf(f.doubleValue());
    }

    @Override
    public float half(Float f) {
        System.out.println("half 실행");
        return (float) Math.half(f.doubleValue());
    }

    @Override
    public float enhancedTwiceOf(Float f) {
        System.out.println("enhancedTwiceOf 실행");
        return (float) Math.EnhancedTwiceOf(f.doubleValue());
    }
}
