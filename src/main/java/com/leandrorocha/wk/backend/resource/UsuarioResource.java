package com.leandrorocha.wk.backend.resource;

import java.util.ArrayList;
import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("usuarios")
public class UsuarioResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<String> listarTodos() {
		List<String> lista = new ArrayList<String>();
		lista.add("Leandro");
		lista.add("Lucas");

		return lista;
	}

}
