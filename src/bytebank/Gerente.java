package bytebank;

public class Gerente extends Funcionario {

	private int contraseña;

	public Gerente() {
	
	}

	public double getBonificacion() {
	    return super.getBonificacion() + super.getSalario();
	}
	
	public boolean autenticar(int contraseña) {
	    if (this.contraseña == contraseña) {
	        return true;
	    } else {
	        return false;
	    }
	}
}
