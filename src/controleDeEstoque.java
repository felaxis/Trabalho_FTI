import java.util.Scanner;

public class controleDeEstoque {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/*
		 M�todo que possua os c�digos de produtos em estoque "banco de dados"
		 Banco de Dados ir� para o m�todo 'Inserir' e para o 'Retirar',
		 sendo estes colocados na main, utilizado um ou outro dependendo da 
		 a��o escolhida na tela de op��es
		
		Tela de op��es:
		Inserir
		- Inserir o c�digo, nome e quantidade do produto 
		- Char para confirmar o produto
		- Informar quantidade anterior em estoque
		- Imprime o estoque atualizado
		
		Retirar
		- Inserir o c�digo, nome e quantidade do produto 
		- Char para confirmar o produto
		- Informar quantidade anterior em estoque
		- Imprime o estoque atualizado
		
		Encerrar
		 */
		
		//AINDA N�O PUXEI OS M�TODOS 'INSERIR' E 'RETIRAR', POIS N�O DESENVOLVI NENHUM DELES
		//TENTE DEBUGAR PARA ENTENDER CADA A��O QUE FOI COMPLETADA AT� AGORA
		
		
		int inserirRetirar;
		
		for(int i = 0; i == 0 ; i++){
		System.out.println("CONTROLE DE ESTOQUE\n MEMES CORPORATION");
		System.out.println("------------------------------");
		System.out.println("Indique a a��o desejada:");
		System.out.println("------------------------------");
		System.out.println("1 - Inserir produto no estoque");
		System.out.println("2 - Retirar produto do estoque");
		System.out.println("0 - Encerrar o programa");
		inserirRetirar = in.nextInt();
		
		int inserir, retirar, estoqueAntigo, estoqueNovo, quantidadeDoProduto;
		String nomeDoProduto;
		char confirmarAcao;
		
		if(inserirRetirar == 1){
			System.out.println("Digite o c�digo, nome e a quantidade  do produto a ser inserido, respectivamente: ");
			inserir = in.nextInt();
			nomeDoProduto = in.next();
			quantidadeDoProduto = in.nextInt();
			System.out.println("Confirme sua a��o: S ou N");
			confirmarAcao = in.next().charAt(0);
			
			if(confirmarAcao == 'S' || confirmarAcao == 's'){
				System.out.println("A��o confirmada!");
//				estoqueAntigo = -----;
//				estoqueNovo = ----- + quantidadeDoProduto;
				System.out.printf("A quantidade em estoque era de %d produtos\n "
						+ "A quantidade de produtos em estoque atualmente � de %d produtos", estoqueAntigo, estoqueNovo);
			}
			else{
				System.out.println("A��o N�O confirmada!");
			}
//				inserirProduto();			
		}
			else if(inserirRetirar == 2){
				System.out.println("Digite o c�digo, nome e a quantidade  do produto a ser retirado, respectivamente: ");
				retirar = in.nextInt();
				nomeDoProduto = in.next();
				quantidadeDoProduto = in.nextInt();
				System.out.println("Confirme sua a��o: S ou N");
				confirmarAcao = in.next().charAt(0);
				
				if(confirmarAcao == 'S' || confirmarAcao == 's'){
					System.out.println("A��o confirmada!");
//					estoqueAntigo = ;
//					estoqueNovo = ;
					System.out.printf("A quantidade em estoque era de %d produtos\n "
							+ "A quantidade de produtos em estoque atualmente � de %d produtos", estoqueAntigo, estoqueNovo);
				}
				else{
					System.out.println("A��o N�O confirmada!");
				}
//				retirarProduto();
			}
			else if(inserirRetirar == 0){
				break;
			}
in.close();		
		}
	}
	
/*	A IDEIA � DE PUXAR O M�TODO BANCO DE DADOS PARA 'INSERIR' E PARA 'RETIRAR', 
 	E PUXANDO CADA UM DESSES PARA A MAIN.
 	
 	public static int inserirProduto(int inserir){
				
	}
	
	public static int retirarProduto(int retirar){
		
	}
*/
	
	//PRODUTOS NO ESTOQUE, BASE DE DADOS PARA INSERIR E RETIRAR
	public static int bancoDeDados(int codigoDoProduto){
		switch (codigoDoProduto) {
		case 1001:
			System.out.println("ARROZ");
			break;
		case 1002:
			System.out.println("FEIJ�O");
			break;
		case 1003:
			System.out.println("BATATA DOCE");
			break;
		case 1004:
			System.out.println("FRANGO");
			break;
		case 1005:
			System.out.println("OVO");
			break;
		}
		return codigoDoProduto;
	}
}