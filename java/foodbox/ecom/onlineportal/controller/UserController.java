package foodbox.ecom.onlineportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import foodbox.ecom.onlineportal.entity.User;
import foodbox.ecom.onlineportal.exception.InvalidUserException;
import foodbox.ecom.onlineportal.exception.UserNotFoundException;
import foodbox.ecom.onlineportal.repository.UserRepository;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class UserController {

	@Autowired
	private UserRepository userRepo;
	
	//get all users
		@RequestMapping(value = "/users", method=RequestMethod.GET)
		public List<User> getAllCustomers() {
			return this.userRepo.findAll();
		}
			
//		//get user by ID
//		@RequestMapping(value = "/users/{id}" , method=RequestMethod.GET)
//		public User getUserById(@PathVariable("id") long id) {
//			return this.userRepo.findById((int) id).orElseThrow(()->{
//				throw new UserNotFoundException();
//			});
//		}
		
	//get user by Email
		@RequestMapping(value = "/users/{email}" , method=RequestMethod.GET)
		public User getUserByEmail(@PathVariable("email") String email) {
			return this.userRepo.findByEmail(email).orElseThrow(()->{
			throw new UserNotFoundException();
			});
		}
		
	//create new user (register)
		@RequestMapping(value = "/users" , method = RequestMethod.POST)
		public User addUser(@RequestBody(required=false) User userObj) {
			if(userObj == null)
			{
				throw new InvalidUserException();
			}
			return this.userRepo.save(userObj);
		}
		
	//delete user
		@RequestMapping(value = "/users/{email}" , method = RequestMethod.DELETE)
		public void deleteUser(@PathVariable("email") String email) {
			User fetchedUser = this.userRepo.findByEmail(email).orElseThrow(()->{
				throw new UserNotFoundException();
			});
			this.userRepo.delete(fetchedUser);
		}
		
//		//delete user
//		@RequestMapping(value = "/users/{id}" , method = RequestMethod.DELETE)
//		public void deleteUser(@PathVariable("id") long id) {
//			User fetchedUser = this.userRepo.findById((int) id).orElseThrow(()->{
//				throw new UserNotFoundException();
//			});
//			this.userRepo.delete(fetchedUser);
//		}
		
	//update user
		
		@RequestMapping(value = "/users/{email}" , method = RequestMethod.PUT)
		public User updateUser(@PathVariable("email") String email, @RequestBody(required=false) User userObj) {
		//find record
			this.userRepo.findByEmail(email).orElseThrow(()->{
			throw new UserNotFoundException();
			});
			return this.userRepo.save(userObj);
		}
			
}
