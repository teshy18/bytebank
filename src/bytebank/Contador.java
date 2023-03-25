package bytebank;

public class Contador extends Funcionario {

	
	
	public Contador() {
		
	}

	
	
	@Override
	public double getBonificacion() {
		 return this.getSalario() + 200.00;
	}

}
