package br.emprestimo.testeUnitario;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import br.emprestimo.modelo.Livro;
import br.emprestimo.modelo.Usuario;

@RunWith(Parameterized.class)


public class UC10CadastrarUsuarioV2 {
	Usuario usuario;
	@Parameter
	public String ra;
	@Parameter(1)
	public String nome;
	@Parameter(2)
	public String resultadoEsperado;
	
	
	@Before
	public void setup() {
		usuario = new Usuario();
	}
	
	@Parameters
	public static Collection<Object[]> dadosDeTeste() {
		return Arrays.asList(new Object[][] { 
			{ "1111","Jose da Silva", "valido" },
			{ "","Jose da Silva", "RA invalido" },
			{ null,"Jose da Silva", "RA invalido" },
			{ "1111","", "Nome invalido" },
			{ "1111",null, "Nome invalido" }
			
		});
	}
	
	@Test
	public void CT01UC10ValidaComportamentoDoCadastrarUsuario() {
		// System.out.println("Caso de teste executado : " + resultadoEsperado);
		try {
			usuario.setNome(nome);
			usuario.setRa(ra);
			assertEquals(ra, usuario.getRa());
			assertEquals(nome, usuario.getNome());
			assertTrue(resultadoEsperado.equals("valido"));
		} catch (Exception e) {
			assertTrue(resultadoEsperado.equals(e.getMessage()));
		}
	}	
	

	
}
