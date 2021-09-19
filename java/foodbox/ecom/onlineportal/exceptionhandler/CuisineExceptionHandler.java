package foodbox.ecom.onlineportal.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import foodbox.ecom.onlineportal.exception.CuisineNotFoundException;
import foodbox.ecom.onlineportal.exception.InvalidCuisineException;


@ControllerAdvice
public class CuisineExceptionHandler {
	

	@ExceptionHandler(value=CuisineNotFoundException.class)
	public ResponseEntity<Object> notFoundCuisineException(CuisineNotFoundException exception){
		return new ResponseEntity<Object>("Cuisine Not Found !",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=InvalidCuisineException.class)
	public ResponseEntity<Object> invalidCuisineException(InvalidCuisineException exception){
	return new ResponseEntity<Object>("Invalid Cuisine!",HttpStatus.BAD_REQUEST);
}

}
