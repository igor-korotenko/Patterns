package beverages;

/**
 * Created with IntelliJ IDEA.
 * User: Igor
 * Date: 11/12/12
 * Time: 5:10 PM
 * To change this template use File | Settings | File Templates.
 */

public abstract class Beverage {
    public String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
