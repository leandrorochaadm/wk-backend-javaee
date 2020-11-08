package com.leandrorocha.wk.backend.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;

import com.leandrorocha.wk.backend.model.Usuario;

@Stateless
public class UsuarioRepository {
	static List<Usuario> lista = new ArrayList<Usuario>(
			Arrays.asList(new Usuario(1L, "Leandro", "leandro@gmail.com", "asdf"),
					new Usuario(2L, "Jose", "jose@gmail.com", "asdf")));

	@PersistenceUnit
	private EntityManager em;

	public List<Usuario> listarTodos() {
		// return lista;
		return em.createQuery("select u from usuario u", Usuario.class).getResultList();

	}

	public Usuario buscarPorId(Long id) {
//		return lista.get(id.intValue() - 1);
		return em.find(Usuario.class, id);
	}

	public void adiciona(Usuario usuario) {
//		usuario.setId(new Long(lista.size() + 1));
//		return lista.add(usuario) ? usuario : null;,
		em.persist(usuario);
	}

	public void deletar(Long id) {
		em.remove(buscarPorId(id));
	}

	public void atualizar(Usuario usuario) {
		em.merge(usuario);
	}
}
