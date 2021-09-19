package foodbox.ecom.onlineportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import foodbox.ecom.onlineportal.entity.Menu;
//import foodbox.ecom.onlineportal.exception.MenuNotFoundException;
import foodbox.ecom.onlineportal.repository.MenuCuisineRepository;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class MenuCuisineController {
	
	@Autowired
	private MenuCuisineRepository menuCuisineRepo;
	
	//get menu items by Cuisine ID
	@RequestMapping(value = "/menu/cuisine/{cuisineid}" , method=RequestMethod.GET)
	public List<Menu> getMenuByCuisineId(@PathVariable("cuisineid") long cuisineid) {
		return this.menuCuisineRepo.findMenuByCuisineid((int) cuisineid);
	}

}
