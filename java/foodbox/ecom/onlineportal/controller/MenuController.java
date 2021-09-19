package foodbox.ecom.onlineportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import foodbox.ecom.onlineportal.entity.Menu;
import foodbox.ecom.onlineportal.exception.InvalidMenuException;
import foodbox.ecom.onlineportal.exception.MenuNotFoundException;
import foodbox.ecom.onlineportal.repository.MenuRepository;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class MenuController {
	
	@Autowired
	private MenuRepository menuRepo;


	//get all menu items
		@RequestMapping(value = "/menu", method=RequestMethod.GET)
		public List<Menu> getAllMenus() {
			return this.menuRepo.findAll();
		}
		
	//get menu items by ID
	@RequestMapping(value = "/menu/{id}" , method=RequestMethod.GET)
	public Menu getMenuById(@PathVariable("id") long id) {
		return this.menuRepo.findById((int) id).orElseThrow(()->{
		throw new MenuNotFoundException();
		});
	}	
	
	
	//create new menu item
	@RequestMapping(value = "/menu" , method = RequestMethod.POST)
	public Menu addMenu(@RequestBody(required=false) Menu menuObj) {
		if(menuObj == null)
		{
			throw new InvalidMenuException();
		}
		return this.menuRepo.save(menuObj);
	}
	
	//delete menu item
	@RequestMapping(value = "/menu/{id}" , method = RequestMethod.DELETE)
	public void deleteMenu(@PathVariable("id") long id) {
		Menu fetchedMenu = this.menuRepo.findById((int) id).orElseThrow(()->{
			throw new MenuNotFoundException();
		});
		this.menuRepo.delete(fetchedMenu);
	}
	
	//update menu item
	
	@RequestMapping(value = "/menu/{id}" , method = RequestMethod.PUT)
	public Menu updateMenu(@PathVariable("id") long id, @RequestBody(required=false) Menu menuObj) {
	//find record
		this.menuRepo.findById((int) id).orElseThrow(()->{
		throw new MenuNotFoundException();
		});
		return this.menuRepo.save(menuObj);
	}
	
}
	


