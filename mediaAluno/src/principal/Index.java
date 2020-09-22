package principal;
import java.util.Scanner;
public class Index {
	public static Scanner in;
	public static void main(String[] args) {
		in = new Scanner(System.in);
		Aluno aluno = new Aluno();
		String matricula;
		String nome;
		double nota1, nota2, trab;
		System.out.println("Digite a matricula do aluno");
		matricula = in.nextLine();
		
		while(matricula.equals("")) {
			System.out.println("Digite a matricula do aluno");
			matricula = in.nextLine();
		}
		
		System.out.println("Digite o nome do aluno");
		nome = in.nextLine();
		
		while(nome.equals("")) {
			System.out.println("Digite o nome do aluno");
			nome = in.nextLine();
		}
		
		System.out.println("Digite a nota da primeira prova do aluno");
		nota1 = in.nextDouble();
		in.nextLine();
		
		System.out.println("Digite a nota da segunda prova do aluno");
		nota2 = in.nextDouble();
		in.nextLine();
		
		System.out.println("Digite a nota do trabalho do aluno");
		trab = in.nextDouble();
		in.nextLine();
		aluno.setNotas(nota1, nota2, trab);
		
		System.out.println("Media " + aluno.getMedia());
		System.out.println("Necessario para passar na prova Final " + aluno.getFinal());
		
		
	}
}
