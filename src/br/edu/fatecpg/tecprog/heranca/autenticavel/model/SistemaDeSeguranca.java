package br.edu.fatecpg.tecprog.heranca.autenticavel.model;

import java.util.Scanner;

public class SistemaDeSeguranca implements Autenticavel{
	Scanner entrada = new Scanner(System.in);
	
	private String usuario = "admin";
	private String senha = "1234";
	
	@Override
	public void login(String usuario, String senha) {
		
		usuario = entrada.nextLine();
		senha= entrada.nextLine();
		
		while(true) {
			if(usuario != this.usuario) {
				System.out.print("Usuário incorreto: ");
			}else if(senha != this.senha) {
				System.out.print("Senha incorreta: ");
			}else {
				System.out.println("Logado");
				break;
			}
		}
	}
	
	@Override
	public void logout() {
		//rete
	}
	
	
}
