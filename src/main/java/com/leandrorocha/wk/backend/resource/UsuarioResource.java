package com.leandrorocha.wk.backend.resource;

import java.net.URI;
import java.util.List;

import com.leandrorocha.wk.backend.model.Usuario;
import com.leandrorocha.wk.backend.repository.UsuarioRepository;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("usuarios")
public class UsuarioResource {

	private UsuarioRepository repository = new UsuarioRepository();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Usuario> listarTodos() {

		return repository.listarTodos();
	}

	@Path("/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Usuario buscaPorID(@PathParam("id") Long id) {

		return repository.buscarPorId(id);
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response adiciona(Usuario usuario) {

		Usuario usuarioCriado = repository.adiciona(usuario);

		URI uri = URI.create("/wk.backend/webapi/usuarios/" + usuario.getId());
		if (usuarioCriado == null)
			return Response.serverError().build();
		return Response.created(uri).build();

	}
}
