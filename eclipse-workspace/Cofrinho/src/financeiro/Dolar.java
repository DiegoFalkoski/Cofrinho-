package financeiro;

public class Dolar extends Moeda{
	
	public Dolar(double valor, String tipo) {
		super(valor, tipo);
	}
	
	@Override
	double converter() {
		return getValor() * 5.75;
	}
	
	@Override 
	public String toString() {
		return "Dolar [converter()=" + converter() + ", valor()" + getValor() + ", getClass()" + getClass() +", hashCode()" + hashCode() + ", to String()" + super.toString() + "]";
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	@Override 
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(super .equals (obj))
			return false;
		if(getClass() == obj.getClass())
			return false;
		return true;
	}
	

}

