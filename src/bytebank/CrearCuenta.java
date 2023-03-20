package bytebank;

public class CrearCuenta {
	public static void main(String[] args) {
		
		Cuenta primeraCuenta = new Cuenta(1);
		primeraCuenta.depositar(100);
		primeraCuenta.depositar(150);
		
		Cuenta segundaCuenta = new Cuenta(1);
		
		System.out.println("El saldo de la primera cuenta es: " + primeraCuenta.getSaldo());
		System.out.println("El saldo de la segunda cuenta es: " + segundaCuenta.getSaldo());
		
		System.out.println(Cuenta.getTotal());
	}
}
