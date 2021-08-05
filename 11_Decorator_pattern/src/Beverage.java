public abstract class Beverage {

    protected String description = "제목 없음";

    public String getDescription() {
        return description;
    }

    abstract public int cost();
}