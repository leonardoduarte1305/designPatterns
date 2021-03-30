package pattern.decorator;

//First implementation of Beverage class
public class Expresso extends Beverage {

	@Override
	public double getCost() {
		return 5;
	}

	@Override
	public String getMessage() {
		return "Expresso";
	}

}
