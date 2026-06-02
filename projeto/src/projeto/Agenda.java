package projeto;

public class Agenda {
	Contato[] contatos;
	int qtdAtual;

	Agenda(int tamanhoTotal){
		contatos = new Contato[tamanhoTotal];
		qtdAtual = 0;
	}

	boolean cadastrarContato(Contato novoContato) {
		if(qtdAtual < contatos.length) {
			contatos[qtdAtual] = novoContato;
			qtdAtual++;
			return true;
		}
		return false;
	}

	void listarContatos() {
	    if(qtdAtual == 0) {
	        System.out.println("Nenhum contato cadastrado.");
	        return;
	    }

	    for(int i = 0; i < qtdAtual; i++) {
	        System.out.println(contatos[i]);
	    }
	}
	Contato buscarContatos(String nome) {
		for(int i = 0; i < qtdAtual; i++) {
			if(contatos[i].nome.equalsIgnoreCase(nome)) {
				return contatos[i];
				
			}
		}
		return null;
	}

		

	boolean removerContatoPorNome(String nome) {
		int posicao = -1;
		if(qtdAtual>0) {
			for(int i = 0;i<qtdAtual;i++) {
				if(contatos[i].nome.equalsIgnoreCase(nome)) {
					posicao = i;
					break;
				}
			}
		}
		if(posicao == -1) {
			return false;
		}
		for(int j = posicao;j<qtdAtual-1;j++) {
			contatos[j] = contatos[j+1];
		}
		contatos[contatos.length-1] = null;
		qtdAtual--;
		return true;
	}
		
}
