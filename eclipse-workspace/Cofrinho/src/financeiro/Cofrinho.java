package financeiro;

import java.util.ArrayList;

public class Cofrinho {
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>(); 
	
	public void adicionar(Moeda m) {
		listaMoedas.add(m);
		}
	
	public void remover(Moeda m) {
		if(listaMoedas.isEmpty()) {
			System.out.println("Sem moeda no cofre");
			return;
		} else {
			listaMoedas.remove(m);	
		}
	}
	
	public void lista() {
		for(Moeda m: listaMoedas) {
			m.info();
		}
	}
	
	public void totalConvertido() {
		double total = 0;
		for(Moeda moeda: listaMoedas) {
			total += moeda.converter();
		}
		System.out.println("Totak em real: R$" + total);
	}
	
	public void menuCofrinho() {
		System.out.println("----------------");
		System.out.println("Menu do Cofrinho");
		System.out.println("----------------");
		System.out.println("Digite a opção desejada");
		System.out.println("1 - Adicionar Moedas");
		System.out.println("2 - Remover as Moedas");
		System.out.println("3 - Listar Moedas");
		System.out.println("4 - Mostrar o total em Reais");
		System.out.println("0 - Sair");
		System.out.println("----------------");
		
		
	}
	

}
