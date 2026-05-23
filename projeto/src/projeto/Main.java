package projeto;
import java.util.Scanner;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static Contato[] contatos = new Contato[100];
	static int qtd = 0;
	public static void main(String [] args) {
		int opcao;
		do {
			System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar contato");
            System.out.println("2 - Listar contatos");
            System.out.println("3 - Buscar contato");
            System.out.println("4 - Remover contato");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();
            switch(opcao) {
            	case 1:
            		cadastrar();
                    
                    break;
                case 2:
                	listar();
                    
                    break;
                case 3:
                	buscar();
                    
                    break;
                case 4:
                	remover();
                 
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
		} while(opcao !=0);
			
	}
	public static void cadastrar() {
		if(qtd >= contatos.length) { // qtd é maior que o tamanho do array?
			System.out.println("Lista cheia!");
			return;
		}
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Telefone: ");
		String telefone = sc.nextLine();
		
		contatos[qtd] = new Contato(nome, telefone); // crie um novo contato c nome e tel e coloque
		// no array contatos na posicao qtd
		qtd++;
		System.out.println("Contato cadastrado!");
	}
	public static void listar() {
		if(qtd == 0) {
			System.out.println("Agenda vazia!");
			return;
		}
		for(int i = 0; i<qtd; i++) {
			System.out.println(i + " - "
					+ contatos[i].getNome() + " - "  // get(mostrar)
					+ contatos[i].getTelefone());
		}
	}
	public static void buscar() {
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		
		for(int i = 0; i<qtd;i++) {
			if(contatos[i].getNome().equalsIgnoreCase(nome)) {
				System.out.println("Encontrado: " 
				+ contatos[i].getNome() + " - "
				+ contatos[i].getTelefone());
				return;
			}
		}
		System.out.println("Contato não encontrado!");
	}
	public static void remover() {
		listar();
		System.out.println("Indice para remover: ");
		int index = sc.nextInt();
		sc.nextLine();
		
		if(index < 0 || index >= qtd) {
			System.out.println("Index inválido");
			return;
		}
		for(int i = index; i<qtd - 1; i++) {
			contatos[i] = contatos[i+1];
		}
		qtd--;
		System.out.println("Contato apagado!");
	}
}
