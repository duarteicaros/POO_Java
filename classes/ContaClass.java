package POO;

public class ContaClass {
	
	private String nomeDono;
	private int codConta;
	private int agenciaConta;
	private double saldoConta;
	private double valorDepositado;
	private double valorSaque;
	
	public ContaClass (String nome, int codigo, int agencia, double saldo, double deposito, double saque)
	{
		nomeDono = nome;
		codConta = codigo;
		agenciaConta = agencia;
		saldoConta = saldo;
		valorDepositado = deposito;
		valorSaque = saque;
	}
	
	public void mostrarDados()
	{		
		System.out.println(" ______________________________________________ ");
		System.out.println("|"+nomeDono+"                        |");
		System.out.println("|______________________________________________|");
		
		System.out.println(" _______________\t\t ______________");
		System.out.println("|Codigo: "+codConta+"  |\t\t|Agencia: "+agenciaConta+" |");
		System.out.println("|_______________|\t\t|______________|");
		
		System.out.println(" __________________");
		System.out.println("| Saldo:  R$"+saldoConta+"  |");
		System.out.println("|__________________|");
	}
	
	public String sacar()
	{
		String extrato;
		
		if(saldoConta > valorSaque)
		{
		saldoConta = saldoConta - valorSaque;
		extrato = "-----------------------------------------------------"+"\n|Você sacou: R$" + valorSaque+"\t\t\t            |"+
				"\n|Seu novo saldo é: R$"+saldoConta+"\t\t\t    |"+
				"\n-----------------------------------------------------";
		}
		else
		{
			extrato = "-----------------------------------------------------"+"\n|Você não pode sacar: R$" + valorSaque+"\t\t\t    |"+
					"\n|Pois seu saldo é R$"+saldoConta+"\t\t\t    |"+
					"\n-----------------------------------------------------";
		}
		return extrato;
		
	}
	
	public String depositar()
	{
		String extrato;
		saldoConta = saldoConta + valorDepositado;
		extrato = "-----------------------------------------------------"+"\n|Você depositou: R$" + valorDepositado+"\t\t\t    |"+
				"\n|Seu novo saldo é: R$"+saldoConta+"\t\t\t    |"+
				"\n-----------------------------------------------------";
		return extrato;
	}
	
}
