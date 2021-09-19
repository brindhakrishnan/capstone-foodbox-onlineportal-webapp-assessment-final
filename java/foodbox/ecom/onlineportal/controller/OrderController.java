package foodbox.ecom.onlineportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import foodbox.ecom.onlineportal.entity.Orders;
import foodbox.ecom.onlineportal.exception.InvalidOrderException;
import foodbox.ecom.onlineportal.exception.OrderNotFoundException;
import foodbox.ecom.onlineportal.repository.OrderRepository;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class OrderController {
	
	@Autowired
	private OrderRepository orderRepo;
	
	//get all orders
	@RequestMapping(value = "/orders", method=RequestMethod.GET)
	public List<Orders> getAllOrders() {
		return this.orderRepo.findAll();
		}
			
	//get orders by Email
	@RequestMapping(value = "/{email}/orders" , method=RequestMethod.GET)
	public Orders getOrderByEmail(@PathVariable("email") String email) {
		return this.orderRepo.findOrderByEmail(email).orElseThrow(()->{
		throw new OrderNotFoundException();
		});
	}	
	
	//create new order (place order)
	@RequestMapping(value = "/{email}/orders" , method = RequestMethod.POST)
	public Orders addOrder(@RequestBody(required=false) Orders orderObj) {
		if(orderObj == null)
		{
			throw new InvalidOrderException();
		}
		return this.orderRepo.save(orderObj);
	}

}