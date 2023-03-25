package bytebank;

public class Administrador extends Funcionario implements Autenticable{

	private int contraseña;

	public Administrador() {
		// TODO Auto-generated constructor stub
	}

	public void setContraseña(int contraseña) {
		this.contraseña = contraseña; 
	}
	
	public boolean autenticar(int contraseña) {
	    if (this.contraseña == contraseña) {
	        return true;
	    } else {
	        return false;
	    }
	}
	
	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}

}
