package principal;
import java.util.Scanner;
import menus.*;
import notasFiscais.*;
public class Index {
	public static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);//scanner
		Menu menu = new MenuPrincipal(); //meus menus
		int opcao;
		String numero;
		String descricao;
		int quantidade;
		double preco;
		NotaFiscal nota = new NotaFiscal();
		menu.opcaoUm();
		menu.opcaoDois();
		menu.opcaoTres();
		opcao = in.nextInt();
		while(!(opcao == 3)) {
			if(opcao == 1) {
				System.out.println("Digite o numero do produto");
				numero = in.nextLine();
				while(numero.equals("")) {
					numero = in.nextLine();
				}
				System.out.println("Digite a descrição do produto");
				descricao = in.nextLine();
				while(descricao.equals("")) {
					descricao = in.nextLine();	
				}
				nota.setnumeroDaPeca(numero);
				nota.setDescricaoPeca(descricao);
				System.out.println("Digite a quantidade de compra");
				quantidade = in.nextInt();
				in.nextLine();
				nota.setquantidadeComprada(quantidade);
				System.out.println("Digite o preco do produto");
				preco = in.nextDouble();
				in.nextLine();
				nota.setPreco(preco);
				
					
				
			}else if(opcao == 2 && nota.getNumeroDaPeca() == null){
				System.out.println("Nota Vazia");
			}else if(opcao == 2){
				System.out.println("Númera da peça - " + nota.getNumeroDaPeca());
				System.out.println("Descrição - " + nota.getDescricaoPeca());
				System.out.println("Preço - " + nota.getPreco());
				System.out.println("Quantidade de itens comprados - " + nota.getQuantidadePeca());
				System.out.println("Valor Total - " + nota.getValorTotal());
				
			}else {
			
				System.out.println("***Operação invalida***");
			}
			menu.opcaoUm();
			menu.opcaoDois();
			menu.opcaoTres();
			opcao = in.nextInt();
		}
	}
	
}
