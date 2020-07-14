package POO;

public class PacienteClass {
	
	private String nomeP;
	private String convenioP;
	private String especialistaP;
	private String sintomasP;
	private String cpfP;
	private int idadeP;
	private double temperaturaP;
	
	
	public PacienteClass (String nome, String convenio, String especialista, String sintomas, int idade, String cpf, double temperatura) {
		
		nomeP = nome;
		convenioP = convenio;
		especialistaP = especialista;
		sintomasP = sintomas;
		idadeP = idade;
		cpfP = cpf;
		temperaturaP = temperatura;
	}
	
	public void dados()
	{
		System.out.println( "\nNome: "+ nomeP+
				"\t\tConvenio: "+convenioP+
				"\t\tSintomas: "+sintomasP+
				"\t\tEspecialista: "+especialistaP+
				"\nCPF: "+cpfP+
				"\t\tIdade: "+idadeP+
				"\t\tTemperatura: "+temperaturaP+"\n");
	}
	
	public String temperatura()
	{
		String resposta;
		if(temperaturaP >= 38)
		{
			resposta = "Paciente: "+ nomeP+
					"\t\tTemperatura: "+temperaturaP+
					"\nDiagnostico: Está com febre.";
		}
		else
		{
			resposta = "Paciente: "+ nomeP+
					"\t\tIdade: "+ idadeP+
					"\nDiagnostico: Não está com febre.";
		}
		return resposta;
	}
		
		public String convenio()
		{
			String respostac;
			if(convenioP == "Sim")
			{
				respostac =  "\n****************************************************"+"\n| Voce será orientado para a sala de espera        |"+
						"\n****************************************************";
			}
			else
			{
				respostac = "\n****************************************************"+"\n| Para ser atendido o valor da Consulta é R$80,00  |"
			+"\n****************************************************";
			}
			return respostac;
	}
}
