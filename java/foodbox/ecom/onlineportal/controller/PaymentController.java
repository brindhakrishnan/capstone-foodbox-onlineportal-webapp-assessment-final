package foodbox.ecom.onlineportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import foodbox.ecom.onlineportal.entity.Payment;
import foodbox.ecom.onlineportal.exception.InvalidOrderException;
import foodbox.ecom.onlineportal.exception.OrderNotFoundException;
import foodbox.ecom.onlineportal.repository.PaymentRepository;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class PaymentController {
	
	@Autowired
	private PaymentRepository paymentRepo;
	
	//get all payment details
	@RequestMapping(value = "/payment", method=RequestMethod.GET)
	public List<Payment> getAllPaymentDetails() {
		return this.paymentRepo.findAll();
	}
		
	//get payment details by Order ID
	@RequestMapping(value = "/payment/{orderId}" , method=RequestMethod.GET)
	public Payment getPaymentOrderById(@PathVariable("orderId") long orderId) {
		return this.paymentRepo.findPaymentByOrderId((int) orderId).orElseThrow(()->{
		throw new OrderNotFoundException();
		});
	}
	
	//create payment details for order
	@RequestMapping(value = "/payment/{orderId}" , method = RequestMethod.POST)
	public Payment addPayment(@RequestBody(required=false) Payment paymentObj) {
		if(paymentObj == null)
		{
			throw new InvalidOrderException();
		}
		return this.paymentRepo.save(paymentObj);
	}

}
