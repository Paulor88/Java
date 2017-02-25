public class ExemploDeVariavel{

	
	//Trata-se de um exemplo de como funciona as variaveis internas e globais.
	
	

	private int x = 1;
	
	
	public void inicio(){
		
		int x = 10;
		
		System.out.printf( "Valor inicial da variável global no metodo inicio(): %d\n", this.x);
		System.out.printf("Valor inicial da variável local no metodo inicio(	): %d\n", x);
		
		segundoMetodo();
		terceiroMetodo();
		segundoMetodo();
		terceiroMetodo();
		
		System.out.printf("\nValor da variável global: %d\n ", this.x);
	}
	
	
	public void segundoMetodo(){
		
		int x = 30;
		
		System.out.printf("\nValor inicial da variável local no segundoMetodo(): %d\n", x);
		++x;
		System.out.printf("Valor da variável local no segundoMetodo() após o incremento: %d\n", x);
		
		
	}
	
	public void terceiroMetodo(){
		
		
		
		
		System.out.printf("\nValor inicial da variável local no terceiroMetodo(): %d\n", x);
		x *= 50;
		System.out.printf("Valor inicial da variável local no segundoMetodo() após o incremento: %d\n", x);
		
		
	}

}