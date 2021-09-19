package foodbox.ecom.onlineportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import foodbox.ecom.onlineportal.entity.OrderDetails;
import foodbox.ecom.onlineportal.exception.InvalidOrderException;
import foodbox.ecom.onlineportal.repository.OrderDetailsRepository;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class OrderDetailsController {
	
	@Autowired
	private OrderDetailsRepository orderDetailsRepo;
	
	//get all order details
			@RequestMapping(value = "/orderdetails", method=RequestMethod.GET)
			public List<OrderDetails> getAllOrderDetails() {
				return this.orderDetailsRepo.findAll();
			}
			
		//get order details by order ID
		@RequestMapping(value = "/orderdetails/{orderId}" , method=RequestMethod.GET)
		public List<OrderDetails> getOrderDetailsById(@PathVariable("orderId") long orderId) {
			return this.orderDetailsRepo.findOrderDetailsById((int) orderId);
		}	
		
		
		//create order details for order
		@RequestMapping(value = "/orderdetails/{orderId}" , method = RequestMethod.POST)
		public OrderDetails addOrderDetails(@RequestBody(required=false) OrderDetails orderDetailsObj) {
			if(orderDetailsObj == null)
			{
				throw new InvalidOrderException();
			}
			return this.orderDetailsRepo.save(orderDetailsObj);
		}
		
//		//delete order details for order
//		@RequestMapping(value = "/orderdetails/{orderId}" , method = RequestMethod.DELETE)
//		public void deleteOrderDetails(@PathVariable("id") long orderId) {
//			List<OrderDetails> fetchedOrderDetails = this.orderDetailsRepo.findOrderDetailsById((int) orderId)
//			this.orderDetailsRepo.delete(fetchedOrderDetails);
//		}
		
		//update menu item
	
//		@RequestMapping(value = "/menu/{id}" , method = RequestMethod.PUT)
//		public Menu updateMenu(@PathVariable("id") long id, @RequestBody(required=false) Menu menuObj) {
//		//find record
//			this.menuRepo.findById((int) id).orElseThrow(()->{
//			throw new MenuNotFoundException();
//			});
//			return this.menuRepo.save(menuObj);
//		}

}
