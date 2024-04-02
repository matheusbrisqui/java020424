package br.com.fiap;

public class UsaContaPoupanca {

	public static void main(String[] args) {
		
		ContaPoupanca conta1 = new ContaPoupanca();
		ContaPoupanca conta2 = new ContaPoupanca(9547, "Matheus Brisqui", 10000);
		
		
		conta1.setNumConta(8567);
		conta1.setDonoConta("Josisclei");
		conta1.setSaldoConta(7500);
		conta1.realizaSaque(2500);
		conta1.realizaDeposito(1000);
		
		conta2.realizaSaque(2000);
		conta2.realizaDeposito(1000);
		
		System.out.println("Número da conta 1: " + conta1.getNumConta());
		System.out.println("Dono da conta 1: " + conta1.getDonoConta());
		System.out.println("Saldo da conta 1: " + conta1.getSaldoConta());
		
		
		System.out.println("Número da conta 2: " + conta2.getNumConta());
		System.out.println("Dono da conta 2: " + conta2.getDonoConta());
		System.out.println("Saldo da conta 2: " + conta2.getSaldoConta());
	}

}
