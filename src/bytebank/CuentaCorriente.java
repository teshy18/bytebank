package bytebank;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(int agencia) {
		super(agencia);
		
	}
	
	@Override
	public boolean retirar(double valor){
	double valorARetirar = valor + 0.2;
	    return super.retirar(valorARetirar);
	}

}
