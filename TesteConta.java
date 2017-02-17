import java.util.Scanner;

public class TesteConta{


	public static void main(String[] args){
	
	
		Scanner input = new Scanner(System.in);
		
		ContaCorrente cc1 = new ContaCorrente(100.0);
		ContaCorrente cc2 = new ContaCorrente(200.0);
		
		
		System.out.printf("Saldo da Primeira conta: %.2f \n ", cc1.getContaCorrente());
		System.out.println();
		System.out.printf("Saldo da Segunda conta: %.2f \n \n ", cc2.getContaCorrente());
		
		System.out.println("Digite o valor que deseja sacar da primeira conta: ");
		double saque1 = input.nextDouble();
		cc1.sacar(saque1);
		
		System.out.println("Digite o valor que deseja sacar da segunda conta: ");
		double saque2 = input.nextDouble();
		cc2.sacar(saque2);
		
		
		System.out.printf("Saldo da Primeira conta: %.2f \n ", cc1.getContaCorrente());
		System.out.println();
		System.out.printf("Saldo da Segunda conta: %.2f \n \n ", cc2.getContaCorrente());
		
		
	

	}
}