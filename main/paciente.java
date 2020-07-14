package POO;

public class paciente {

	public static void main(String[] args) {
		
		PacienteClass paciente = new PacienteClass("Ícaro Duarte", "Sim","Clínico","Tosse e Falta de ar", 22, "027.564.458-99", 38);
		PacienteClass paciente1 = new PacienteClass("Bruno Willian", "Sim","Ortopedista","Braço quebrado", 25, "056.859.996-88", 37.5);
		PacienteClass paciente2 = new PacienteClass("Matheus Alexandre", "Não","Clinico","Corisa,", 29, "023.458.887-03", 41);
		
		
		paciente.dados();
		System.out.println("--------------------------------------------------------------------------------------------------------------------------- \n");
		
		System.out.println(paciente.temperatura());
		System.out.println(paciente.convenio());
		
		System.out.println("\n___________________________________________________________________________________________________________________________ \n");
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("___________________________________________________________________________________________________________________________ \n");
		
		paciente1.dados();
		System.out.println("--------------------------------------------------------------------------------------------------------------------------- \n");
		
		System.out.println(paciente1.temperatura());
		System.out.println(paciente1.convenio());
		
		System.out.println("\n___________________________________________________________________________________________________________________________ \n");
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("___________________________________________________________________________________________________________________________ \n");
		
		paciente2.dados();
		System.out.println("--------------------------------------------------------------------------------------------------------------------------- \n");
		
		System.out.println(paciente2.temperatura());
		System.out.println(paciente2.convenio());
		
		System.out.println("___________________________________________________________________________________________________________________________ \n");
		
		
	}

}
