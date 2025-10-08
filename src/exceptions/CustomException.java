package exceptions;

public class CustomException extends Exception {
	
	public CustomException() {
		super();
	}
	public CustomException(String message) {
		super(message);
	}
	public CustomException(String message, Throwable c) {
		super(message, c);
	}
	public CustomException(Throwable c) {
		super(c);
	}

	@Override
	public String getMessage() {
		return "Custom Error Message! This class inherits from Exception.";
	}
	
}