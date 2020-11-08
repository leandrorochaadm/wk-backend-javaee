package com.leandrorocha.wk.backend.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.leandrorocha.wk.backend.model.Usuario;

public class UsuarioRepository {
	static List<Usuario> lista = new ArrayList<Usuario>(
			Arrays.asList(new Usuario(1L, "Leandro", "leandro@gmail.com", "asdf"),
					new Usuario(2L, "Jose", "jose@gmail.com", "asdf")));

	public List<Usuario> listarTodos() {
		return lista;
	}

	public Usuario buscarPorId(Long id) {
		return lista.get(id.intValue() - 1);
	}

	public Usuario adiciona(Usuario usuario) {
		usuario.setId(new Long(lista.size() + 1));
		return lista.add(usuario) ? usuario : null;
	}
}
