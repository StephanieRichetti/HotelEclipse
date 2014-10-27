package br.senai.sc.hoteleclipsejsf.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


	  @Entity
	   public class Cliente {	
		 

	   @Id
	   @GeneratedValue
	   private Long id;
	   @Column
	   private String nome;
	   @Column
	   private Date chegada;
	   private Date saida;
	   private Integer quartos;
	   private Integer quantidade_pessoas;
	   private String mensagem;
	   private String email;
	   
	   
	  
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getId() {
	   return id;
	   }
	   public void setId(Long id) {
	   this.id = id;
	   }
	   public String getNome() {
	   return nome;
	   }
	   public void setNome(String nome) {
	   this.nome = nome;
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
	   public String getMensagem() {
	   return mensagem;
	   }
	   public void setMensagem(String mensagem) {
	   this.mensagem = mensagem;
	   }





	   }



	 