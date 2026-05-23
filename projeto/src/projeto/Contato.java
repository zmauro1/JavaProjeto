package projeto;

public class Contato {
	private String nome;
	private String telefone;
	
	public Contato(String nome, String telefone) { // construtor
		this.nome = nome;
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public String getTelefone() {
		return telefone;
	}
}

