package POO;

public class FuncionarioClass {
	
	private String nomeFuncionario;
	private int codigoFuncionario;
	private int feriasFuncionario = 30;
	private int feriasDesejadas;
	private int horasTrabalhadas;
	
	public FuncionarioClass(String nomeF, int codF, int horas, int feriasD)
	{
		nomeFuncionario = nomeF;
		codigoFuncionario = codF;
		feriasDesejadas = feriasD;
		horasTrabalhadas = horas;
	}
	
	public void mostrarDados()
	{
		System.out.println("Nome do funcionário: "+nomeFuncionario+
				"\t\tCódigo: "+codigoFuncionario+
				"\t\tDias de ferias desejadas "+ feriasDesejadas+"\n");
	}
	
	public String folga()
	{
		String informação;
		
		if(horasTrabalhadas > 60)
		{
			informação = "*** Voce tem direito a folga!!!***\n";
		}
		else
		{
			informação = "*** Voce ainda não tem direto a folga.***\n";
		}
		
		return informação;
	}
	
	public String solicitarFerias()
	{
		String respostaFerias;
		int ferias = feriasFuncionario - feriasDesejadas;
		
		if(feriasDesejadas > feriasFuncionario)
		{
			respostaFerias = "Voce não tem todos os dias para tirar de ferias";
		}
		else
		{ 
			respostaFerias = "Suas férias foram aprovadas e voce ainda tem: "+ ferias+" dias de ferias.";
		}
		return respostaFerias;
	}

}
