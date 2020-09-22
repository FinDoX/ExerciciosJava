package principal;

public class Aluno {
	private String matricula;
	private String nome;
	private double prova1;
	private double prova2;
	private double trabalho;
	public void setMatricula(String matricula) {
		
	}
	public void setNome(String nome) {
		
	}
	public void setNotas(double nota1, double nota2, double trab) {
		this.prova1 = nota1;
		this.prova2 = nota2;
		this.trabalho = trab;
	}
	public String getMatricula() {
		return this.matricula;
	}
	public String getNome() {
		return this.nome;
	}
	public double getMedia() {
		double media = (this.prova1 * 3 + this.prova2 * 3 + this.trabalho * 4)/10;
		return media;
	}
	public double getFinal() {
		if(getMedia() < 6) {
			return 6 - getMedia();
		}else
			return 0;
		}
	}
