package POO;

public class funcionario {

	public static void main(String[] args) {
		
		FuncionarioClass funcionario1 = new FuncionarioClass("Bruno Abreu", 52014 , 61 ,10);
		FuncionarioClass funcionario2 = new FuncionarioClass("Marcos Luis", 5264 , 50 ,15);
		FuncionarioClass funcionario3 = new FuncionarioClass("Icaro Duarte", 545698 , 72 ,20);
		FuncionarioClass funcionario4 = new FuncionarioClass("Flavio Augusto", 50569 , 40 ,35);
		
		System.out.println("_____________________________________________________________________________________________________\n");
		funcionario1.mostrarDados();
		System.out.println(funcionario1.folga());
		System.out.println(funcionario1.solicitarFerias());
		System.out.println("_____________________________________________________________________________________________________\n");
		
		funcionario2.mostrarDados();
		System.out.println(funcionario2.folga());
		System.out.println(funcionario2.solicitarFerias());
		System.out.println("_____________________________________________________________________________________________________\n");
		
		funcionario3.mostrarDados();
		System.out.println(funcionario3.folga());
		System.out.println(funcionario3.solicitarFerias());		
		System.out.println("_____________________________________________________________________________________________________\n");
		
		funcionario4.mostrarDados();
		System.out.println(funcionario4.folga());
		System.out.println(funcionario4.solicitarFerias());		
		System.out.println("_____________________________________________________________________________________________________\n");
		
	}

}
