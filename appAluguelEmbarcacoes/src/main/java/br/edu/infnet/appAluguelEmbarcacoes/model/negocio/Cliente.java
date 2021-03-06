package br.edu.infnet.appAluguelEmbarcacoes.model.negocio;

public class Cliente {
	private String nome;
	private String cpf;
	private String email;

	public Cliente(String nome, String cpf, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.getNome());
		sb.append(";");
		sb.append(this.getCpf());
		sb.append(";");
		sb.append(this.getEmail());
		
		return sb.toString();
	}
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	
	public String getEmail() {
		return email;
	}
}
