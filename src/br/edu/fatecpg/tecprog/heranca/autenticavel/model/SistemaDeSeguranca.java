package br.edu.fatecpg.tecprog.heranca.autenticavel.model;

import java.util.Scanner;

public class SistemaDeSeguranca implements Autenticavel{
	Scanner entrada = new Scanner(System.in);
	
	private String usuario = "admin";
	private String senha = "1234";
	private boolean logado = false;
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void setLogado(boolean logado) {
		this.logado = logado;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getSenha() {
		return senha;
	}

	public boolean isLogado() {
		return logado;
	}

	@Override
	public void login(String usuario, String senha) {
			
		while(true) {
			
			if(this.logado == true) {
				System.out.println("Você já está logado");
				break;
			}
			
			if(usuario.equals(this.usuario) && senha.equals(this.senha)) {
				System.out.println("Logado!!!");
				setLogado(true);
				break;
			}else {
				System.out.println("Credenciais Inválidas");
				System.out.print("Usuário: ");
				usuario = entrada.nextLine();
				
				System.out.print("Senha: ");
				senha = entrada.nextLine();
			}
		}
	}
	
	@Override
	public void logout() {
		if(this.logado == false) {
			System.out.println("Você já está deslogado!");
		}else {
			System.out.println("Agora você deslogou");
			setLogado(false);
		}
	}
	
}
