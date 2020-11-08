package com.leandrorocha.wk.backend.repository;

import java.util.ArrayList;
import java.util.List;

import com.leandrorocha.wk.backend.model.Usuario;

public class UsuarioRepository {

	public List<Usuario> listarTodos() {
		List<Usuario> lista = new ArrayList<Usuario>();
		lista.add(new Usuario(1L, "Leandro", "leandro@gmail.com", "asdf"));
		lista.add(new Usuario(1L, "Jose", "jose@gmail.com", "asdf"));
		// lista.add("Lucas");

		return lista;
	}
}
