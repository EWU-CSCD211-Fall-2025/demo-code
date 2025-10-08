package exceptions;

public class CustomException extends Exception {

	@Override
	public String getMessage() {
		return "Custom Error Message! This class inherits from Exception.";
	}
	
}