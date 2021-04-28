package dsl_e_interpreter;

public class RaizQuadrada implements Expressao{


	private Expressao base;

	public RaizQuadrada(Expressao base) {
		this.base = base;
	}
	
	@Override
	public int avalia() {
		return (int) Math.sqrt(base.avalia());
	}

}
