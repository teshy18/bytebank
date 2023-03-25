package bytebank;

public class SistemaInterno {

	private int clave = 123456;
	
	public boolean autentica(Autenticable user) {
		boolean habilitado = user.autenticar(clave);
		if(habilitado) {
			System.out.println("Login exitoso");
			return true;
		}else {
			System.out.println("Algo malio sal");
			return false; 
		}
	}
	
	

}
