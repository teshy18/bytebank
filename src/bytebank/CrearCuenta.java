package bytebank;

public class CrearCuenta {
	public static void main(String[] args) {
		
		Cuenta primeraCuenta = new Cuenta();
		primeraCuenta.saldo = 50;
		System.out.println(primeraCuenta.saldo);
		
		Cuenta segundaCuenta = new Cuenta();
		segundaCuenta.saldo = 200;
		System.out.println(segundaCuenta.saldo);

		primeraCuenta.saldo += 100;
		
		System.out.println("El saldo de la primera cuenta es: " + primeraCuenta.saldo);
		System.out.println("El saldo de la segunda cuenta es: " + segundaCuenta.saldo);
		
		
	}
}
