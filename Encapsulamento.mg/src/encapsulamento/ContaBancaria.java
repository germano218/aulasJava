package encapsulamento;

public class ContaBancaria {
	private String titular;
	private double saldo;

//Construtor
  
	public ContaBancaria(String titular , double saldoInicial) {
		//Validação do atributo titular
		 if (!titular.isEmpty()) {
				this.titular = titular;
			   }else {
				   System.out.println("Nome do titular não pode ser vazio");
			   }
		 //Validação do atributo saldo
		if(saldoInicial >= 0){
			this.saldo = saldoInicial;
		}else {
			this.saldo = 0;
			System.out.println("Saldo inválida! Definido como 0.");
		}
	}
	
	//Setter para alterar o titular
	public void setTitular(String titular) {
	   if (!titular.isEmpty()) {
		this.titular = titular;
	   }else {
		   System.out.println("Nome do titular não pode ser vazio");
	   }
	}
	
	 //Getter para obter o titular

	public String getTitular() {
		return titular;
	}


	public double getSaldo() {
		return saldo;
	}
	
	//Método para depositar dinheiro
	
	public void depositar(double valor) {
		if(valor > 0) {
			saldo += valor;
		}else {
			System.out.println("Valor inválido para depósito. ");
		}
	}
	
	//Método para sacar dinheiro (com validação)
	
	public boolean sacar(double valor) {
		if (valor > 0 && saldo >= valor) {
			saldo -= valor;
			return true;
		}else {
			System.out.println("Saque não permitido.");
			return false;
		}
		
	}
	
	
}
