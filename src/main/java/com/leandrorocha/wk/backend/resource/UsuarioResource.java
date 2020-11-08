package com.leandrorocha.wk.backend.resource;

import java.net.URI;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.leandrorocha.wk.backend.model.Usuario;
import com.leandrorocha.wk.backend.repository.UsuarioRepository;

@Path("usuarios")
public class UsuarioResource {

//	private UsuarioRepository repository = new UsuarioRepository();

	@Inject
	private UsuarioRepository repository;

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

		try {
			repository.adiciona(usuario);
			URI uri = URI.create("/wk.backend/usuarios/" + usuario.getId());
			return Response.created(uri).build();
		} catch (Exception e) {
			return Response.serverError().build();
		}
	}

	@DELETE
	@Path("/{id}")
	@Consumes(value = { MediaType.APPLICATION_JSON })
	public Response deletar(@PathParam("id") Long id) {
		repository.deletar(id);
		return Response.noContent().build();
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Response atualizar(@PathParam("id") Long id, Usuario usuario) {

		repository.atualizar(usuario);
		return Response.noContent().build();
	}
}
