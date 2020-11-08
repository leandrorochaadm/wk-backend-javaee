package com.leandrorocha.wk.backend.resource;

import java.util.List;

import com.leandrorocha.wk.backend.model.Usuario;
import com.leandrorocha.wk.backend.repository.UsuarioRepository;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("usuarios")
public class UsuarioResource {

	private UsuarioRepository repository = new UsuarioRepository();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Usuario> listarTodos() {

		return repository.listarTodos();
	}

}
