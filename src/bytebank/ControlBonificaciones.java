package bytebank;

public class ControlBonificaciones {

	private double sumaBonificaciones;
	
	
	public ControlBonificaciones() {
	
	}


	public double getSumaBonificiones() {
		return sumaBonificaciones;
	}


	public void registrar(Funcionario e) {
	    double boni = e.getBonificacion();
	    this.sumaBonificaciones = this.sumaBonificaciones + boni;
	}

	

}
