package beverages;

/**
 * Created with IntelliJ IDEA.
 * User: Igor
 * Date: 11/12/12
 * Time: 5:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
