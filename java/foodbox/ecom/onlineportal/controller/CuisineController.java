package foodbox.ecom.onlineportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import foodbox.ecom.onlineportal.entity.Cuisine;
import foodbox.ecom.onlineportal.exception.CuisineNotFoundException;
import foodbox.ecom.onlineportal.exception.InvalidCuisineException;
import foodbox.ecom.onlineportal.repository.CuisineRepository;


@RestController
@CrossOrigin(origins="http://localhost:3000")
public class CuisineController {
	
	@Autowired
	private CuisineRepository cuisineRepo;
	
	//get all cuisines
	@RequestMapping(value = "/cuisine", method=RequestMethod.GET)
	public List<Cuisine> getAllCuisines() {
		return this.cuisineRepo.findAll();
	}
	
	//get cuisine by ID
	@RequestMapping(value = "/cuisine/{id}" , method=RequestMethod.GET)
	public Cuisine getCuisineById(@PathVariable("id") long id) {
		return this.cuisineRepo.findById((int) id).orElseThrow(()->{
			throw new CuisineNotFoundException();
		});
	}
	
	//create new cuisine
	@RequestMapping(value = "/cuisine" , method = RequestMethod.POST)
	public Cuisine addCuisine(@RequestBody(required=false) Cuisine cuisineObj) {
		if(cuisineObj == null)
		{
			throw new InvalidCuisineException();
		}
		return this.cuisineRepo.save(cuisineObj);
	}
	
	//delete cuisine
	@RequestMapping(value = "/cuisine/{id}" , method = RequestMethod.DELETE)
	public void deleteCuisine(@PathVariable("id") long id) {
		Cuisine fetchedCuisine = this.cuisineRepo.findById((int) id).orElseThrow(()->{
			throw new CuisineNotFoundException();
		});
		this.cuisineRepo.delete(fetchedCuisine);
	}
	
	//update cuisine
	
	@RequestMapping(value = "/cuisine/{id}" , method = RequestMethod.PUT)
	public Cuisine updateCuisine(@PathVariable("id") long id, @RequestBody(required=false) Cuisine cuisineObj) {
	//find record
		this.cuisineRepo.findById((int) id).orElseThrow(()->{
		throw new CuisineNotFoundException();
		});
		return this.cuisineRepo.save(cuisineObj);
	}
		
	

}
