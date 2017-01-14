import java.util.Scanner;

public class IfElse{
	
	
	public static void main(String[] args){
		
		double media, nota, nota2;
		
			
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota do aluno: ");
		nota = input.nextInt();
		System.out.println();
		
		
		System.out.println("Digite a segunda nota do aluno: ");
		nota2 = input.nextInt();
		System.out.println();
		
		media = (nota + nota2) /2;
		
		if(media >= 6){
			
			System.out.println("A nota final do aluno foi " + media + " O aluno passou de ano");
			
			
		}else{
			
			System.out.println("A nota final do aluno foi " + media + "não atingiu a nota necessária");
			
		}
		
		
	}
	
}