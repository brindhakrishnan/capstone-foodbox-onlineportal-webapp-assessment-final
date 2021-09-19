package foodbox.ecom.onlineportal.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import foodbox.ecom.onlineportal.exception.InvalidUserException;
import foodbox.ecom.onlineportal.exception.UserNotFoundException;

@ControllerAdvice
public class UserExceptionHandler {

	@ExceptionHandler(value=UserNotFoundException.class)
	public ResponseEntity<Object> notFoundException(UserNotFoundException exception){
		return new ResponseEntity<Object>("User Not Found !",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=InvalidUserException.class)
	public ResponseEntity<Object> invalidException(InvalidUserException exception){
	return new ResponseEntity<Object>("Invalid User!",HttpStatus.BAD_REQUEST);
	}
}
