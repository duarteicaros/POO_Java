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
		System.out.println("Nome do funcion�rio: "+nomeFuncionario+
				"\t\tC�digo: "+codigoFuncionario+
				"\t\tDias de ferias desejadas "+ feriasDesejadas+"\n");
	}
	
	public String folga()
	{
		String informa��o;
		
		if(horasTrabalhadas > 60)
		{
			informa��o = "*** Voce tem direito a folga!!!***\n";
		}
		else
		{
			informa��o = "*** Voce ainda n�o tem direto a folga.***\n";
		}
		
		return informa��o;
	}
	
	public String solicitarFerias()
	{
		String respostaFerias;
		int ferias = feriasFuncionario - feriasDesejadas;
		
		if(feriasDesejadas > feriasFuncionario)
		{
			respostaFerias = "Voce n�o tem todos os dias para tirar de ferias";
		}
		else
		{ 
			respostaFerias = "Suas f�rias foram aprovadas e voce ainda tem: "+ ferias+" dias de ferias.";
		}
		return respostaFerias;
	}

}
