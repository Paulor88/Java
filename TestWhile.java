import java.util.Scanner;

public class TestWhile{

	public static void main(String[] args){
		
		
		int number;
		
		Scanner input = new Scanner(System.in);

		System.out.println("Digite um número maior que zero: ");
		number = input.nextInt();
		
		while(number > 0){
			
			System.out.println("Digite outro número: ");
			number = input.nextInt();
			
			
		}
		
		System.out.println("Você digitou o número " + number + ", no qual não é maior que zero");
		
	}



}