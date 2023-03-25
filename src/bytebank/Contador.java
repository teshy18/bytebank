package bytebank;

public class Contador extends Funcionario {

	public Contador() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getBonificacion() {
		 return this.getSalario() + 200.00;
	}

}
