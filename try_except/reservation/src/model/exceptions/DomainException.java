package model.exceptions;

public class DomainException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	// Pedir que podemos instanciar nossa exceção personalizada passando uma mensagem para ela
	public DomainException(String msg) {
		super(msg);
	}
	
}
