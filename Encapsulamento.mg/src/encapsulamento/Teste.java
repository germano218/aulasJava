package encapsulamento;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBancaria conta = new ContaBancaria("Carlos" , 1000.00);
		
		 conta.depositar (500);
		 conta.sacar(2000);	
		
			    System.out.println("Titular: " + conta.getTitular());
				System.out.println("Saldo: " + conta.getSaldo());

	}

}
