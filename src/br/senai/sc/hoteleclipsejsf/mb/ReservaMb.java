package br.senai.sc.hoteleclipsejsf.mb;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;

import br.senai.sc.hoteleclipsejsf.entity.Reserva;
import br.senai.sc.hoteleclipsejsf.util.Util;


@ManagedBean
public class ReservaMb {
	private EntityManager entityManager;
	private Reserva cliente;
	private List<Reserva> listaClientes;
	private String id;
	private String nome_cliente;
	private String chegada;
	private String saida;
	private String quartos;
	private String quantidade_pessoas;
	private String observacao;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	public String getNome_cliente() {
		return nome_cliente;
	}

	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getChegada() {
		return chegada;
	}

	public void setChegada(String chegada) {
		this.chegada = chegada;
	}

	public String getSaida() {
		return saida;
	}

	public void setSaida(String saida) {
		this.saida = saida;
	}

	public String getQuartos() {
		return quartos;
	}

	public void setQuartos(String quartos) {
		this.quartos = quartos;
	}

	public String getQuantidade_pessoas() {
		return quantidade_pessoas;
	}

	public void setQuantidade_pessoas(String quantidade_pessoas) {
		this.quantidade_pessoas = quantidade_pessoas;
	}

	
	public String salvar() {
		entityManager.merge(cliente);
		return "listagemClientes";

	}
	
	public void setCliente(List<Reserva> cliente) {
		this.listaClientes = cliente;
	}		
}
