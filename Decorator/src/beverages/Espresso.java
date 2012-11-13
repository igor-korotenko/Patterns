package beverages;

/**
 * Created with IntelliJ IDEA.
 * User: Igor
 * Date: 11/12/12
 * Time: 5:13 PM
 * To change this template use File | Settings | File Templates.
 */

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
