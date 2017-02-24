import java.util.Random;

//Lança um dado 6000 vezes e conta a frequencia de cada número;

public class DadoRandom{

	public static void main (String[] args){
	
	
		Random ran = new Random();
		
		
		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		int number4 = 0;
		int number5 = 0;
		int number6 = 0;
	
		int face;
		
		for( int jogar = 1; jogar <= 6000; jogar++){
			
			face = 1 + ran.nextInt(6);
			
			switch(face){
				
				case 1:
					++number1;
					break;
					
				case 2:
					++number2;
					break;
					
				case 3:
					++number3;
					break;
					
				case 4:
					++number4;
					break;
					
				case 5:
					++number5;
					break;
					
				case 6:
					++number6;
					break;
				
				
			}
			
		}

		System.out.println("Lado \t Frequência");
		System.out.printf("1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n", number1, number2, number3, number4, number5, number6);
	}

}