package bytebank;

public class Gerente extends Funcionario implements Autenticable{

	private int contraseña;
	
	public double getBonificacion() {
		    return this.getSalario() + this.getSalario() * 0.5;		    		
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
	
	
	
}
