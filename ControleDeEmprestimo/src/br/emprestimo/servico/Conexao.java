package br.emprestimo.servico;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.exceptions.jdbc4.CommunicationsException;

public class Conexao {
	
	static ConfiguraDB configuraDB;

	public Conexao(ConfiguraDB configuraDB) {
		this.configuraDB = configuraDB;
	}
	
	public static Connection getConexao() {
		
		try {
			Class.forName(configuraDB.getDriver());
			return (Connection)DriverManager.getConnection(configuraDB.getUrl(), configuraDB.getUsuario(), configuraDB.getSenha());
		} catch (CommunicationsException e) {
			System.out.println("Erro de comunicacao: "+ e.getMessage());
			throw new RuntimeException(e);
		}catch(SQLException e){
			throw new RuntimeException(e);
		}catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		
	}

}
