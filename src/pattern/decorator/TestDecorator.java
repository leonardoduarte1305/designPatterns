package pattern.decorator;

public class TestDecorator {
	public static void main(String[] args) {

		// Base Beverage
		Expresso expresso = new Expresso();

		// Added component to the first Beverage
		Caramel caramel = new Caramel(expresso);

		// The added component returns the base beverage cost + component cost
		System.out.println(caramel.getCost());

		// New added component
		Milk milk = new Milk(caramel);

		// This new component returns the (base beverage cost + caremel component cost)
		// + milk cost
		System.out.println(milk.getCost());

		System.out.println("==== Another example");

		// New base Beverage
		Tea tea = new Tea();

		// New add on for tea
		Milk coldMilk = new Milk(tea);

		// This new coldMilk returns the base tea cost + coldMilk cost
		System.out.println(coldMilk.getCost());
	}
}
