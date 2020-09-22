package calculadora;
import java.util.Scanner;
public class Index {
	public static Scanner in;
	public static void main(String[] args) {
	in = new Scanner(System.in);
		String opcao;
		Menu menu = new Menu();
	double num1, num2;
	Calculadora calculadora = new Calculadora();
	System.out.println("**Calculadora**");
	
	System.out.println("Digite o primeiro número");
	num1 = in.nextDouble();
	in.nextLine();
	
	System.out.println("Digite o segundo número");
	num2 = in.nextDouble();
	in.nextLine();

	System.out.println("** Digite a operação que deseja realizar **");
	
	menu.menuUm();
	menu.menuDois();
	menu.menuTres();
	menu.menuQuatro();
	menu.menuCinco();
	opcao = in.nextLine();

	while(!opcao.equals("$")) {
		
		if(opcao.equals("+")) {
			System.out.println("**Resultado** -> " +calculadora.soma(num1, num2));
		}else if(opcao.equals("-")) {
			System.out.println("**Resultado** -> " +calculadora.subtracao(num1, num2));
		}else if(opcao.equals("*")) {
			System.out.println("**Resultado** -> " +calculadora.multiplicar(num1, num2));
		}else if(opcao.equals("/")) {
			if(num2 == 0) {
				System.out.println("*-* erro *-* Dividir por 0 é impossível");
			}else {
				System.out.println("**Resultado** -> " +calculadora.dividir(num1, num2));	
			}
		}else {
			System.out.println("\\**opcao \""+ opcao +"\" invalida**/");
		}
		
		System.out.println("Digite o primeiro número");
		num1 = in.nextDouble();
		in.nextLine();
		
		System.out.println("Digite o segundo número");
		num2 = in.nextDouble();
		in.nextLine();
		
		
		System.out.println("** Digite a operação que deseja realizar **");
		 
		menu.menuUm();
		menu.menuDois();
		menu.menuTres();
		menu.menuQuatro();
		menu.menuCinco();
		opcao = in.nextLine();	
	}
	}
}
