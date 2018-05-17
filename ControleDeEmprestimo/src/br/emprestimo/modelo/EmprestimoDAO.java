package br.emprestimo.modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

import br.emprestimo.servico.Conexao;

public class EmprestimoDAO {
	
	public int adiciona (Emprestimo emprestimo) {
		int codigoRetorno = 0;
		
		PreparedStatement ps;
		try(Connection conn = Conexao.getConexao()){
			ps = (PreparedStatement) conn.prepareStatement("insert into Emprestimo (emprestimoNumero, codigoLivro,"
					+ "codigoUsuario, dataEmprestimo, dataDevolucao) values()?,?,?,?,?");
			ps.setInt(1, emprestimo.getEmprestimoNumero());
			ps.setString(2, emprestimo.getLivro().getIsbn());
			ps.setString(3, emprestimo.getUsuario().getRa());
			ps.setString(4, emprestimo.getDataEmprestimo());
			ps.setString(5, emprestimo.getDataDevolucao());
			
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
		
		
		
		return codigoRetorno;
	}

}
