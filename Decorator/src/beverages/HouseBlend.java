package beverages;

/**
 * Created with IntelliJ IDEA.
 * User: Igor
 * Date: 11/12/12
 * Time: 5:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
