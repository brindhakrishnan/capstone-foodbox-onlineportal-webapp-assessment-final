package foodbox.ecom.onlineportal.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import foodbox.ecom.onlineportal.exception.MenuNotFoundException;
import foodbox.ecom.onlineportal.exception.InvalidMenuException;

@ControllerAdvice
public class MenuExceptionHandler {
	
	@ExceptionHandler(value=MenuNotFoundException.class)
	public ResponseEntity<Object> notFoundException(MenuNotFoundException exception){
		return new ResponseEntity<Object>("Menu Item Not Found !",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=InvalidMenuException.class)
	public ResponseEntity<Object> invalidException(InvalidMenuException exception){
	return new ResponseEntity<Object>("Invalid Menu Item!",HttpStatus.BAD_REQUEST);
}

}
