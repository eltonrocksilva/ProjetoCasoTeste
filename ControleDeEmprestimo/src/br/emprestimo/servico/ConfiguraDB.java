package br.emprestimo.servico;

public class ConfiguraDB {
	
	private String url;
	private String driver;
	private String usuario;
	private String senha;
	

	public ConfiguraDB(String url, String driver, String usuario, String senha) {
		this.url = url;
		this.driver = driver;
		this.usuario = usuario;
		this.senha = senha;
		
	}

	public String getUrl() {
		return url;
	}

	public String getDriver() {
		return driver;
	}

	public String getUsuario() {
		return usuario;
	}

	public String getSenha() {
		return senha;
	}


	
	
	

	
	
	
	
}
