package br.senai.sc.hoteleclipsejsf.mb;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.EntityManager;

import br.senai.sc.hoteleclipsejsf.entity.Reserva;


	@ManagedBean
	public class ClienteMb {
		private EntityManager entityManager;
		private Reserva cliente;
		private List<Reserva> listaClientes;
		private String nome;
		private String cpf;	
		private String endereco;
		private String email;
		private String telefone;
		private String data_nascimento;	
		
		
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public String getEndereco() {
			return endereco;
		}
		public void setEndereco(String endereco) {
			this.endereco = endereco;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getTelefone() {
			return telefone;
		}
		public void setTelefone(String telefone) {
			this.telefone = telefone;
		}
		public String getData_nascimento() {
			return data_nascimento;
		}
		public void setData_nascimento(String data_nascimento) {
			this.data_nascimento = data_nascimento;
		}
		public String getMensagem() {
			return mensagem;
		}
		public void setMensagem(String mensagem) {
			this.mensagem = mensagem;
		}
		private String mensagem;


	public void enviar(){
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("Cpf: " + cpf);
		System.out.println("Endereco: " + endereco);
		System.out.println("Telefone: " + telefone);
		System.out.println("Data nascimento: " + data_nascimento);
		System.out.println("Mensagem: " + mensagem);
	}

		public String salvar() {
			entityManager.merge(cliente);
			return "listagemClientes";

		}
		
		public void setCliente(List<Reserva> cliente) {
			this.listaClientes = cliente;
		}		
	}
	
	
	
	
	