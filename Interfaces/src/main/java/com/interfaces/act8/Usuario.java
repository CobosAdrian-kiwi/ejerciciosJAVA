package com.interfaces.act8;

public class Usuario implements Validable, Mostrable{
	private String email;
	private String password;
	
	public Usuario (String email, String password) {
		this.email = email;
		this.password = password;
	}

	@Override
	public void validar() throws IllegalArgumentException {
		if (email.indexOf('@') == -1) throw new IllegalArgumentException("Email debe contener arroba");
		if (password.length() < 8) throw new IllegalArgumentException("La contraseña tiene que tener al menos 8 caracteres");	
	}

	@Override
	public String mostrar() {
		return "Usuario: "+email+" | Contraseña: "+password;
	}
	
	
}
