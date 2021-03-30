package pattern.decorator;

// This class IS a Beverage and HAS a Beverage
// AddOnBeverage is a Beverage
public class Milk extends AddOnBeverage {

	private Beverage beverage;

	public Milk(Beverage b) {
		this.beverage = b;
	}

	@Override
	public double getCost() {
		return this.beverage.getCost() + 3;
	}

	@Override
	public String getMessage() {
		return this.beverage.getMessage() + " + Milk";
	}

}
