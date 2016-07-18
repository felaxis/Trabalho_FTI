import java.util.Scanner;

public class controleDeEstoqueParaFrutaria {

	private static Scanner entrada;

	public static void main(String[] args) {
		entrada = new Scanner(System.in);

		mensagensIniciais();

		int opcaoEscolhidaPeloCliente = entrada.nextInt();

		definirEscolhaDoUsuario(opcaoEscolhidaPeloCliente);

	}

	private static void mensagensIniciais() {
		System.out.println("                    CONTROLE DE ESTOQUE FRUTARIA DO SEU Z�");
		System.out.println("-------------------------------------------------------------------------------\n");
		System.out.println("INSIRA A A��O DESEJADA:");
		System.out.println("Para INSERIR algum item, digite 1:");
		System.out.println("Para RETIRADA, digite 2:");
	}

	public static void definirEscolhaDoUsuario(int opcaoEscolhidaPeloCliente) {
		switch (opcaoEscolhidaPeloCliente) {
		case 1:
			inserirProdutoNoEstoque();
			break;
		case 2:
			retirarProdutoDoEstoque();
			break;
		default:
			System.out.println("Opcao Invalida, digite novamente a opcao desejada:");
			int novaOpcaoEscolhidaPeloCliente = entrada.nextInt();
			definirEscolhaDoUsuario(novaOpcaoEscolhidaPeloCliente);
			break;
		}
	}

	private static void inserirProdutoNoEstoque() {
		System.out.println("Insira o C�digo do Produto:");
		int codigoDoProduto = entrada.nextInt();
		bancoDeDados(codigoDoProduto);
		System.out.println("Produto Definido: "+bancoDeDados(codigoDoProduto)+".");
		System.out.println("Quantidade em Estoque: "+".");
	}

	private static void retirarProdutoDoEstoque() {
		System.out.println("retirar");
	}

	private static String bancoDeDados(int codigoDoProduto){
		int quantidadeAtual;
		switch (codigoDoProduto){
		case 1001:
			quantidadeAtual = 42;
			return "Batata-Doce";
		case 1002:
			quantidadeAtual = 112;
			return "Ab�bora Galinho";

		case 1003:
			quantidadeAtual = 88;
			return "Abacaxi da Serra";

		case 1004:
			quantidadeAtual = 12;
			return "Melancia Vivacia";

		case 1005:
			quantidadeAtual = 3;
			return "Manga da Mal�sia";

		}
		return null;

	}
}
