package pattern.decorator;

public class Tea extends Beverage {

	@Override
	public double getCost() {
		return 4;
	}

	@Override
	public String getMessage() {
		return "Tea";
	}

}
