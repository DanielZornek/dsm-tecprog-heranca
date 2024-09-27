package br.edu.fatecpg.tecprog.heranca.autenticavel.view;

import br.edu.fatecpg.tecprog.heranca.autenticavel.model.SistemaDeSeguranca;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String usuario, senha;
		int opcao;
		boolean loop = true;
		
		SistemaDeSeguranca conta1 = new SistemaDeSeguranca();
		
		System.out.println("Opções\n1 - Logar\n2 - Deslogar\n0 - Fechar");
		
		while(loop) {
			System.out.print("Opção: ");
			opcao = entrada.nextInt();
			entrada.nextLine();
			switch(opcao) {
				case 0:
					loop = false;
				break;
				case 1:
					
					System.out.println("Informe o usuário: ");
					usuario = entrada.nextLine();
					
					System.out.println("Informe a senha: ");
					senha = entrada.nextLine();
					
					conta1.login(usuario, senha);
				break;
				case 2:
					conta1.logout();
				break;
				default: 
					System.out.println("Opção inválida");
				break;
					
			}
		}
		
		entrada.close();
	}
}
