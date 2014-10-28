package br.senai.sc.hoteleclipse.jsf.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import br.senai.sc.hoteleclipsejsf.entity.Reserva;
import br.senai.sc.hoteleclipsejsf.util.Util;

public class ReservaDao {

	private EntityManager entityManager;

	public ReservaDao() {
		entityManager = Util.getEntityManager();
	}

	public List<Reserva> listar() {
		Query query = entityManager.createQuery("From Reserva", Reserva.class);
		return query.getResultList();
	}

	public void salvar(Reserva cliente) {
		entityManager.merge(cliente);
	}

	public Reserva buscarPorId(Long id) {
		return entityManager.find(Reserva.class, id);
	}

	public void excluir(Long id) {
		Reserva cliente = entityManager.getReference(Reserva.class, id);
		entityManager.remove(cliente);
	}

}
