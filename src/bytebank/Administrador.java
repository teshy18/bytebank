package bytebank;

public class Administrador extends Funcionario implements Autenticable{

	private AutenticacionUtil autenticador;

	public Administrador() {
		this.autenticador = new AutenticacionUtil();
	}

	public void setContraseña(int contraseña) {
		this.autenticador.setContraseña(contraseña);
	}

	
	public boolean autenticar(int contraseña) {
		return this.autenticador.autenticar(contraseña);
	}
	@Override
	public double getBonificacion() {
		// TODO Auto-generated method stub
		return 0;
	}

}
