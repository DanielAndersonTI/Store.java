package com.javaoo.store;

public class inventario {
	public static void produceReport(Item[] itens) {
		int contatotal = 0;
		double valortotal = 0.0;
		
		System.out.printf("%-30s%10s%5s\n", "Titulo", "Preço", "Quantidade");
		
		for(Item item:itens) {
			if( item != null) {
				System.out.printf("%-30s%10.2f%5d\n", item.getTitulo(), item.getPreco(), item.getQuantidade());
				contatotal += item.getQuantidade();
				valortotal += ( item.getQuantidade() * item.getPreco());
			}
		}
		
		System.out.printf("%-30s%10.2f%5d\\n", " ", valortotal, contatotal);
	}
}
