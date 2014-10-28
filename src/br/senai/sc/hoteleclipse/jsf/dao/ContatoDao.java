package br.senai.sc.hoteleclipse.jsf.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.senai.sc.hoteleclipsejsf.entity.Reserva;
import br.senai.sc.hoteleclipsejsf.entity.Contato;
import br.senai.sc.hoteleclipsejsf.util.Util;

public class ContatoDao {

	private EntityManager entityManager;

	public ContatoDao() {
		entityManager = Util.getEntityManager();
	}

	public List<Reserva> listar() {
		Query query = entityManager.createQuery("From Contato", Contato.class);
		return query.getResultList();
	}

	public void salvar(Contato contato) {
		entityManager.merge(contato);
	}

	public Contato buscarPorId(Long id) {
		return entityManager.find(Contato.class, id);
	}

	public void excluir(Long id) {
		Contato contato = entityManager.getReference(Contato.class, id);
		entityManager.remove(contato);
	}
}