package menus;

public class MenuPrincipal implements Menu{
	public void opcaoUm() {
		System.out.println("===========================================");
		System.out.println("1 - Cadastrar dados da Notas Fiscal");
	}
	public void opcaoDois() {
		System.out.println("2 - Mostrar os dados e valor da Notas Fiscal");
	}
	public void opcaoTres() {
		System.out.println("3 - Sair do programa");
		System.out.println("===========================================");
	}
}
