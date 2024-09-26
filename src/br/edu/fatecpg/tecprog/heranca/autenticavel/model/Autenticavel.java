package br.edu.fatecpg.tecprog.heranca.autenticavel.model;

public interface Autenticavel {
	public void login(String usuario, String senha);
	public void logout();
}
