package exception;

public class isFullException extends RuntimeException {

	public isFullException() {
		super("El stack est� lleno");
	}
}
