package com.leandrorocha.wk.backend.repository;

import java.util.ArrayList;
import java.util.List;

import com.leandrorocha.wk.backend.model.Usuario;

public class UsuarioRepository {
	List<Usuario> lista = new ArrayList<Usuario>();

	public UsuarioRepository() {
		lista.add(new Usuario(1L, "Leandro", "leandro@gmail.com", "asdf"));
		lista.add(new Usuario(2L, "Jose", "jose@gmail.com", "asdf"));
	}

	public List<Usuario> listarTodos() {
		return lista;
	}

	public Usuario buscarPorId(Long id) {
		return lista.get(id.intValue() - 1);
	}
}
