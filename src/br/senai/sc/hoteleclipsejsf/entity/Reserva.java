package br.senai.sc.hoteleclipsejsf.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Reserva {

	@Id
	@GeneratedValue
	private Long id;
	@Column
	private String nome_cliente;
	@Column
	private Date chegada;
	private Date saida;
	private Integer quartos;
	private Integer quantidade_pessoas;
	private String observacao;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public Date getChegada() {
		return chegada;
	}

	public void setChegada(Date chegada) {
		this.chegada = chegada;
	}

	public Date getSaida() {
		return saida;
	}

	public void setSaida(Date saida) {
		this.saida = saida;
	}

	public Integer getQuartos() {
		return quartos;
	}

	public void setQuartos(Integer quartos) {
		this.quartos = quartos;
	}

	public Integer getQuantidade_pessoas() {
		return quantidade_pessoas;
	}

	public void setQuantidade_pessoas(Integer quantidade_pessoas) {
		this.quantidade_pessoas = quantidade_pessoas;
	}



}
