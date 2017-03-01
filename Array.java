public class Array{


	public void array(){
		
		//declara um array com valore pré definidos
		int[] a = {1, 24, 55, 66, 70, 72, 30, 90, 100, 57, 88};
		
		//imprime os titulos das colunas
		System.out.printf("%s%10s\n", "Index", "Elementos");
		
		//declara uma variavel para somar os elementos do array "a"
		int total = 0;
		
		//percorre o array e os valores do array
		for(int cont = 0; cont < a.length; cont++){
			
			System.out.printf("%2d%5d\n", cont, a[cont]);
			
			
			
						
			
		}
	
		// percorre novamente o array.
		for(int cont = 0; cont < a.length; cont++)
			//adiciona cada elemento do array na variavel "total"
			total += a[cont];
		
		
		System.out.printf("%s%10d", "total: ", total);
	}

}