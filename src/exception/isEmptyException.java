package exception;

public class isEmptyException extends RuntimeException {

	public isEmptyException() {
		super("El stack est� vacio");
	}
}
