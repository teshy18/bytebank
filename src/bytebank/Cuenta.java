package bytebank;

public class Cuenta {
	private double saldo;
	private int agencia;
	private int numero;
	String titular;
	private static int total = 0;
	
	public  static int getTotal() {
		return total;
	}
	
	public Cuenta(int agencia) {
		if (agencia <= 0) {
			System.out.println("El numero de agencia no puede ser menor o igual a 0");
		} else {
			this.agencia = agencia;
			total ++;
		}
	
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public boolean retirar(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		}
			return false;
		
	}
	
	public boolean transferir(double valor, Cuenta cuenta){
		if(this.saldo >= valor) {
			this.saldo = this.saldo -valor;
			cuenta.depositar(valor);
			return true;
		} 
			return false;
		
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	
	
}

