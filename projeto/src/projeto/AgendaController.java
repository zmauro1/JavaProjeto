package projeto;
import java.util.Scanner;
public class AgendaController {
	static Scanner sc = new Scanner(System.in);
	public static void main(String [] args) {
		System.out.println("Quantos contatos sua agenda comporta?: ");
		int qtd = sc.nextInt();
		Agenda ag = new Agenda(qtd);
		
		int opcao;
		do {
			System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar contato");
            System.out.println("2 - Buscar contato");
            System.out.println("3 - Listar contatos");
            System.out.println("4 - Remover contato");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            sc.nextLine();
            switch(opcao) {
            	case 1:
            		System.out.println("Digite o nome do contato: ");
            		String nome = sc.nextLine();
            		System.out.println("Digite o telefone do seu contato: ");
            		String tel = sc.nextLine();
            		Contato con = new Contato(nome, tel);
            		boolean cadastrou = ag.cadastrarContato(con);
            		if(cadastrou) {
            			System.out.println("Contato cadastrado!");
            		} else
            			System.out.println("Agenda cheia!");
            		
                    break;
                case 2:
                	System.out.println("Digite o nome do contato: ");
                	String n = sc.nextLine();
                	Contato achou = ag.buscarContatos(n);
                	if(achou!=null) {
                		System.out.println(achou);
                	} else {
                		System.out.println("Contato não encontrado");
                	}
                    
                    break;
                case 3:
                	ag.listarContatos();
                    
                    break;
                case 4:
                	System.out.println("Digite o nome do contato que deseja remover: ");
                	String n1 = sc.nextLine();
                	boolean removeu = ag.removerContatoPorNome(n1);
                	if(removeu) {
                		System.out.println("Contato removido com sucesso!");
                	} else {
                		System.out.println("Contato não encontrado!");
                	}
                 
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");

            }
		} while(opcao !=0);
			
	}
}
