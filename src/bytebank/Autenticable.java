package bytebank;

public interface Autenticable {


    public abstract void setContraseña(int contraseña);
    
    public abstract boolean autenticar(int contraseña);	
	
}
