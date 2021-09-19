package foodbox.ecom.onlineportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import foodbox.ecom.onlineportal.entity.Cart;
import foodbox.ecom.onlineportal.entity.User;
import foodbox.ecom.onlineportal.exception.InvalidUserException;
import foodbox.ecom.onlineportal.exception.UserNotFoundException;
import foodbox.ecom.onlineportal.repository.CartRepository;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class CartController {
	
	@Autowired
	private CartRepository cartRepo;
	
	//get cart by Email
	@RequestMapping(value = "/cart/{email}" , method=RequestMethod.GET)
	public List<Cart> getCartByEmail(@PathVariable("email") String email) {
		return this.cartRepo.findCartByEmail(email);
	}
			
	//delete cart by Email
	@RequestMapping(value = "/cart/{email}" , method = RequestMethod.DELETE)
	public void deleteCart(@PathVariable("email") String email) {
		List<Cart> fetchedCart = this.cartRepo.findCartByEmail(email);
		for (Cart cart : fetchedCart) {
			this.cartRepo.delete(cart);
		}
		
	}
	
	//Add to cart
	@RequestMapping(value = "/cart" , method = RequestMethod.POST)
	public Cart addCart(@RequestBody(required=false) Cart cartObj) {
		return this.cartRepo.save(cartObj);
	}
	
}
