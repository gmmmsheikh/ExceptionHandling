
public class InvalidEmployeeException extends Exception {
	
	public InvalidEmployeeException() {
		super("Invalid Age");
	}
	
	public InvalidEmployeeException(String message) {
		super(message);
	}

}
