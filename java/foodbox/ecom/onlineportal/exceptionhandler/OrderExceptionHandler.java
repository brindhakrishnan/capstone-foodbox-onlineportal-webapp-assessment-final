package foodbox.ecom.onlineportal.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import foodbox.ecom.onlineportal.exception.InvalidOrderException;
import foodbox.ecom.onlineportal.exception.OrderNotFoundException;


@ControllerAdvice
public class OrderExceptionHandler {

	@ExceptionHandler(value=OrderNotFoundException.class)
	public ResponseEntity<Object> notFoundException(OrderNotFoundException exception){
		return new ResponseEntity<Object>("No orders found for your ID !",HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value=InvalidOrderException.class)
	public ResponseEntity<Object> invalidException(InvalidOrderException exception){
	return new ResponseEntity<Object>("Invalid Order details!",HttpStatus.BAD_REQUEST);
	}
}
