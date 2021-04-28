package decorator;

public class TestDecorator {
	public static void main(String[] args) {
//--------------------------------------------------------------------------
		// Base Beverage
		Expresso expresso = new Expresso();

		// Added component to the first Beverage
		Caramel caramel = new Caramel(expresso);

		// The added component returns the base beverage cost + component cost
		System.out.println(caramel.getCost());

		// New added component
		Milk milk = new Milk(caramel);

		// This new component returns the (base beverage cost + caramel component cost)
		// + milk cost
		System.out.println(milk.getCost());

		System.out.println("==== Another example");

		// New base Beverage
		Tea tea = new Tea();

		// New add on for tea
		Milk coldMilk = new Milk(tea);

		// This new coldMilk returns the base tea cost + coldMilk cost
		System.out.println(coldMilk.getCost());

		System.out.println("==== Another example/use");

		// Instantiate many AddOnBeverages and a base Beverage
		Beverage b = new Milk(new Caramel(new Tea()));
		System.out.println(b.getCost());

		System.out.println("The examples above was without the method getMessage()\n");
		System.out.println("\nThe examples below are with the method getMessage()");

		// Base Beverage
		Expresso expresso1 = new Expresso();

		// Added component to the first Beverage
		Caramel caramel1 = new Caramel(expresso1);

		// The added component returns the base beverage cost + component cost
		System.out.println(caramel1.getMessage());
		System.out.println(caramel1.getCost());

		// New added component
		Milk milk1 = new Milk(caramel1);

		// This new component returns the (base beverage cost + caremel component cost)
		// + milk cost

		System.out.println(milk1.getMessage());
		System.out.println(milk1.getCost());

		System.out.println("==== Another example");

		// New base Beverage
		Tea tea1 = new Tea();

		// New add on for tea
		Milk coldMilk1 = new Milk(tea1);

		// This new coldMilk returns the base tea cost + coldMilk cost
		System.out.println(coldMilk1.getMessage());
		System.out.println(coldMilk1.getCost());

		System.out.println("==== Another example/use");

		// Instantiate many AddOnBeverages and a base Beverage
		Beverage b1 = new Milk(new Caramel(new Tea()));
		System.out.println(b1.getMessage());
		System.out.println(b1.getCost());
	}
}