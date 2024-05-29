package com.javaoo.store.drivres;


//import com.javaoo.store.*;
import com.javaoo.store.Item;
import com.javaoo.store.inventario;


public class Driver_de_Inventario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*OBS: Os títulos de obras abaixo são apenas para exempplificar. Algumas correspondem a obras reais,
		 outras não.*/
		Item[] meuInventario  = new Item [50];
		
		
		meuInventario[0] = new Book ("Quem manda no mundo", 21.03, 24);
		meuInventario[1] = new Book ("O Idiota", 22.03, 24);
		meuInventario[2] = new Book ("Crime e Castigo", 23.03, 24);
		meuInventario[3] = new Book ("Irmãos Karamazov", 24.03, 24);
		meuInventario[4] = new Book ("O Evangelho segundo Jesus Cristo", 25.03, 24);
		
		Artista artista1 = new Artista ("Renato Russo");
		meuInventario[5] = new CD ("Legião Urbana", 26.03, 24);
				artista1 = new Date ("27/03/2024");
				
		Artista artista2 = new Artista ("Dinho");
		meuInventario[6] = new CD ("Mamonas Assasinas", 28.03, 24);
				artista2 = new Date ("29/03/2024");
				
		meuInventario[7] = new CD ("Schubert", 25.03, 24);
					new Artista("Schubert"), new Date ("25/03/24");
					
		String [] performaces1 = {"Danie", "Natanael", "Denilson", "Josimar", "Guilherme"};
		meuInventario[8] = new ClassicalCD ("Romeo e Julieta", 25.03, 24);
					"Joe Green", performaces1, "New Iork" new Date ("01/01/2001");
					
		String [] performaces2 = {"Carmem", "Joana", "Anunciada", "Gal", "Julia"};
		meuInventario[9] = new ClassicalCD ("A quatro estações", 26.03, 24);
					"Vivaldi", performaces2, "Italia" new Date ("01/01/2002");
		
		
		inventario.produceReport(meuInventario);			
		
	}

}
