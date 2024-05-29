package com.gerenciaBanco;

import java.util.Scanner;

// Classes and their Methods

class Cliente {
	
	private String nomecompleto;
	private String cpf;
	private double saldo = 2.500;
	
	public Cliente(String nomecompleto2, String cpf2) {
		// TODO Auto-generated constructor stub
	}

	public void cliente(String nomecompleto, String cpf) {
		this.nomecompleto = nomecompleto;
		this.cpf = cpf;
		this.saldo = 2.500;
	}
	
// Class Methods cliente
	
	public void consultadesaldo(int numero) {
			
			System.out.println("Seu saldo atual é: R$" + saldo);
		
	}
	
	public void depositar(double valor) {
		
		
		
		if (valor > 0) {
			saldo += valor;
			System.out.println("Depósito no valor de " + valor + " realizado com sucesso!");
			System.out.println("Seu novo saldo é de: R$" + saldo);
			}
		else {System.out.println("valor de depósito inválido");
				}
	}
	
	public void sacar(double valor) {
		
			
		
		
		
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque no valor de " + valor + " realizado com sucesso!");
			System.out.println("Seu novo saldo é de: R$" + saldo);
			}
		else {
			System.out.println("Saldo insuficiente ou valor do saldo inválido");
		}
	}
}
	// End of Client Class

public class gerenciaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Digite seu nome completo: ");
		String nomecompleto = sc1.nextLine();
		System.out.println("Digite seu CPF: ");
		String cpf = sc1.nextLine();
		System.out.println("  ");
		System.out.println("Olá!" + nomecompleto);
		
		Cliente cliente = new Cliente(nomecompleto, cpf);
		
		boolean continuar = true;
		while(continuar) {
		// Instantiating a client class object
		System.out.println("Como podemos lhe ajudar hoje?");
		System.out.println("  ");
		System.out.println("Consultar saldo digite :        1");
		System.out.println("Depositar valores digite :      2");
		System.out.println("Sacar valores digite :          3");
		System.out.println("Encerrar esta operação digite : 4");
		System.out.println("  ");
		
		int opcao = sc1.nextInt();
		switch (opcao) {
			
		case 1: cliente.consultadesaldo(opcao);
			break;
			
		case 2:System.out.println("Informe um valor que deseja depositar: ");
			   double valordeposito = sc1.nextDouble();
				cliente.depositar(valordeposito);
			break;
			
		case 3:System.out.println("Informe um valor que deseja sacar: ");
		       double valorsaque = sc1.nextDouble();
		       cliente.sacar(valorsaque);
			break;
			
		case 4: continuar = false; 
			System.out.println(" Esta operação está encerrada ");
			break;
			
		default:
			System.out.println(" Opção inválida, tente nivamente ");
			break;
		}
			
	}
	sc1.close();
	
	}

}
