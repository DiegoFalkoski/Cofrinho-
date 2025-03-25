package financeiro;

import java.util.Objects;

public abstract class Moeda {
	protected double valor;
	protected String tipo;
	
	protected Moeda(double valor, String tipo) {
		this.valor = valor;
		this.tipo = tipo;
	}
	
    public double getValor() {
    	return valor;
    }
    
    public void setValor(double valor) {
    	this.valor = valor;
    }
    
    abstract double converter(); 
    
    public void info() {
    	System.out.print("---------");
    	System.out.print("Moeda: "+ tipo);
    	System.out.print("Valor: "+ getValor());
    	System.out.print("---------");
    	 }
    
    public static void menuMoeda() {
    	System.out.println("Digite a moeda: ");
    	System.out.println("1 - Dólar: ");
    	System.out.println("2 - Euro: ");
    	System.out.println("3 - Real: ");
    }
    
    @Overrride 
    
         

}
