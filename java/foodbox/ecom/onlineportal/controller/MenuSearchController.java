package foodbox.ecom.onlineportal.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import foodbox.ecom.onlineportal.entity.Menu;
import foodbox.ecom.onlineportal.repository.MenuSearchRepository;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class MenuSearchController {
	
	@Autowired
	private MenuSearchRepository menuSearchRepo;
	
	//get menu items by Search keyword
		@RequestMapping(value = "/menu/search/{keyword}" , method=RequestMethod.GET)
		public List<Menu> searchMenu(@PathVariable("keyword") String keyword) {
			return this.menuSearchRepo.menuSearch(keyword);
		}

}
