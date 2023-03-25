package bytebank;

public class Prubebas {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gerente g1 = new Gerente();
		g1.setNombre("sebas");
		g1.setContraseña(123434);
		
		SistemaInterno s1 = new SistemaInterno();
		s1.autentica(g1);
		
	}

}
