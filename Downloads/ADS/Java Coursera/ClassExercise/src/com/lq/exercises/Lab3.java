package com.lq.exercises;

public class Lab3 {

	public static void main(String[] args) {
		
		String [] diasdaSemana =  {"Domindo, Segunda, Terça, Quarta, Quinta Sexta, Sábado"};  
		String [] diasdasemanaInverso =  {"Sábado, Sexta, Quinta, Quarta, Terça, Segunda, Domingo"};
		String [] monthNames = {"Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho", "Julho", "Agosto", 
		    		"Setembro","Outubro", "Novembro", "Dezembro"}; 
		    
		
		System.out.println("Iniciará com os dias da Semana\n");
		for( int i = 0; i < diasdaSemana.length; i ++){
			System.out.println(diasdaSemana[i]);
		}
		
		System.out.println("\nApresentará os dias com o For aprimorado\n");
		for (String dia: diasdaSemana) {
			System.out.println(dia);
		}
		
		System.out.println("\nApresentará os dias na forma inversa\n");
				
		for( int d = 0; d < diasdasemanaInverso.length; d++) {
			System.out.println(diasdasemanaInverso[d]);
		
		}
		
		System.out.println("\nApresentará apenas pares de 2 a 20\n");
				
		int pares = 0;
		
		while ( pares <= 20) {
			pares++;
			if (pares%2 == 1) { 
				continue;
			}
			System.out.println(pares);
			
		}
		
		System.out.println("\nIrá imprimir de 1 até 100, menos no intervalo de 50 a 60");
		System.out.println("");
		for(int k = 1; k <= 100; k++) {
			if (k > 49 && k < 61) {
				continue;
				
			}
			System.out.println(k);
		} 
		
		System.out.println("\nIniciará o Exercicio 4 com o Switch\n");
		
		int numerodemeses = 1;
		while (numerodemeses <= 12) {
			switch (numerodemeses) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("O mês de " + monthNames[numerodemeses -1] + " tem 31 dias.\n");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("O mês de " + monthNames[numerodemeses - 1] + " tem 30 dias.\n");
				break;
			case 2:
				System.out.println("O mês de " + monthNames[numerodemeses - 1] + " tem 28 dias.\n");
				break;
			default:
				System.out.println("\n Erro! O número não está entre 1 e 12\n");
			}
			numerodemeses ++;
		}
				
		System.out.println("\nCalendário do Mês de Março\n");
		
		int esquerdo = 4;
		boolean imprime = false;
		int contagemdedias = 1;
		
		System.out.println ("Dom  Seg  Ter  Qua  Qui  Sex  Sáb");
		
		for(int y = 0; y < 5; y++) { 
			for(int x = 0; x < 7; x++) {
				if (imprime == false) {
					System.out.print( "     ");
					if (x == esquerdo) {
						imprime = true;
					}
				}
				else if (contagemdedias < 10) {
					System.out.print(contagemdedias +  "    ");
					contagemdedias ++;
					 }
				else {
					System.out.print(contagemdedias +  "   ");
					contagemdedias++;
				}
				
			}
			
			System.out.println();
		}
	}
}  

