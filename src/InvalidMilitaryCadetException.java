
public class InvalidMilitaryCadetException extends Exception {
	public InvalidMilitaryCadetException() {
		super("This person is unfit for duty!");
	}
	
	public InvalidMilitaryCadetException(String err) {
		super(err);
	}

}
