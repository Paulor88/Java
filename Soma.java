import java.util.Scanner;

public class Soma{

	public static void main(String[] args){
		
		int x, y, result;
		
		System.out.println("Digite dois números inteiros para calcular a soma deles");
		Scanner input = new Scanner(System.in);
		
		x = input.nextInt();
		y = input.nextInt();
		result = x + y;
		System.out.println("A soma dos números inteiros é: " + result );
		
		
	}

}