public class ContaCorrente{

	//váriavel de instância para armazenar o saldo
	private double saldo;
	
	//construtor padrão
	public ContaCorrente(){
		
		
	}
	
	//construtor 2
	public ContaCorrente(double valorInicial){
		
		if( valorInicial > 0.0)
			saldo = valorInicial;	
		
		
	}
	
	public void setContaCorrente(double s){
		
		this.saldo = s;
		
	}
	
	public double getContaCorrente(){
		
		
		return saldo;
		
	}
	
	
	public void depositar(double valor){
		
		if (valor > 0.0 )
			saldo = saldo + valor;
		
		
	}
	
	
	public void sacar(double valor){
		
		
		if (valor <= saldo){
			saldo = saldo - valor;
		
		}else{
			
			System.out.println("Saldo não suficiente para o saque!!");
			
		}
	}

}