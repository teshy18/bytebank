package bytebank;

public class CrearCuenta {
	public static void main(String[] args) {
		
		Cuenta primeraCuenta = new CuentaCorriente(1);
		primeraCuenta.depositar(100);
		primeraCuenta.depositar(150);
		
		Cuenta segundaCuenta = new CuentaAhorro(1);
		
		System.out.println("El saldo de la primera cuenta es: " + primeraCuenta.getSaldo());
		System.out.println("El saldo de la segunda cuenta es: " + segundaCuenta.getSaldo());
		
		System.out.println(Cuenta.getTotal());
	}
}
