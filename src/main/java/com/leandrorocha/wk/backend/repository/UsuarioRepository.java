package com.leandrorocha.wk.backend.repository;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {

	List<String> listarTodos() {
		List<String> lista = new ArrayList<String>();
		lista.add("Leandro");
		lista.add("Lucas");

		return lista;
	}
}
