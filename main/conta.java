package POO;

public class conta {

	public static void main(String[] args) {
		
		ContaClass usuario = new ContaClass("Icaro Duarte C. Torres", 32604, 1234, 800, 190, 0);
		ContaClass usuario1 = new ContaClass("Amanda Carvalho Junior", 48562, 4562, 600, 0, 800);
		ContaClass usuario2 = new ContaClass("Tadeu Oscar Freire Dia", 12304, 1234, 800, 0, 450);
		ContaClass usuario3 = new ContaClass("João da Silva Batista ", 12365, 7894, 700, 157, 0);
		
		usuario.mostrarDados();
		System.out.println(usuario.depositar());
		
		System.out.println("======================================================================");
		
		usuario1.mostrarDados();
		System.out.println(usuario1.sacar());
		
		System.out.println("======================================================================");
		
		usuario2.mostrarDados();
		System.out.println(usuario2.sacar());
		
		System.out.println("======================================================================");
		
		usuario3.mostrarDados();
		System.out.println(usuario3.depositar());
		
		System.out.println("======================================================================");

	}

}
