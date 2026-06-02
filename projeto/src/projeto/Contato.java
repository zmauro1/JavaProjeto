package projeto;

public class Contato {
	String nome;
	String telefone;
	
	public Contato(String nome, String telefone) { 
		this.nome = nome;
		this.telefone = telefone;
	}
	public String toString() {
		return "Nome: " + nome + "\nTelefone: " + telefone + "\n ------------";
	}
}

