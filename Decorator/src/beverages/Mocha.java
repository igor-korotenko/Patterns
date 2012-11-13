package beverages;

/**
 * Created with IntelliJ IDEA.
 * User: Igor
 * Date: 11/12/12
 * Time: 5:20 PM
 * To change this template use File | Settings | File Templates.
 */

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
