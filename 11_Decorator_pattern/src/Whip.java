public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " + 휘핑";
    }

    @Override
    public int cost() {
        return 300 + beverage.cost();
    }
}