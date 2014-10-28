package br.senai.sc.hoteleclipsejsf.mb;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.persistence.Column;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.senai.sc.hoteleclipsejsf.entity.Cliente;
import br.senai.sc.hoteleclipsejsf.entity.Reserva;
import br.senai.sc.hoteleclipsejsf.util.Util;




	@ManagedBean
	public class ClienteMb {
	
		private EntityManager entityManager;
		private Cliente cliente;
		private List<Cliente> listaClientes;
		private String nome;
		private String cpf;	
		private String endereco;
		private String email;
		private String telefone;
	
	
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
	

	public void enviar(){
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("Cpf: " + cpf);
		System.out.println("Endereco: " + endereco);
		System.out.println("Telefone: " + telefone);
		
	}

		public String salvar() {
			entityManager.merge(cliente);
			return "listagemClientes";

		}
		
		public void setCliente(List<Cliente> cliente) {
			this.listaClientes = cliente;
		}		
		
		public String editar(Long ID){
			cliente = entityManager.find(Cliente.class, ID);
			return "formcadclientes";
		}
		
		public String excluir(Long ID){
		    Cliente cliente = entityManager.getReference(Cliente.class, ID);
			entityManager.remove(cliente);
			listaClientes = null;
			return "listagemClientes";
		}
		
	/*	public List<Cliente> getClientes(){
			if ( cliente == null){
				Query query = Util.getEntityManager().createQuery("From Cliente", Cliente.class);
				cliente = query.getResultList();
			}
			return cliente;
		}*/
		
		
	}
	
	