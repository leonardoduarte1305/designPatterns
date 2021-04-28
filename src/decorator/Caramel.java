package decorator;

// This class IS a Beverage and HAS a Beverage
// AddOnBeverage is a Beverage
public class Caramel extends AddOnBeverage {

	private Beverage beverage;

	public Caramel(Beverage b) {
		this.beverage = b;
	}

	@Override
	public double getCost() {
		return this.beverage.getCost() + 4;
	}

	@Override
	public String getMessage() {
		return this.beverage.getMessage() + " + Caramel";
	}

}
