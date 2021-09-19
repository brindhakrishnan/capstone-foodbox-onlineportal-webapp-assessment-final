package foodbox.ecom.onlineportal.repository;


import java.util.List;
//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import foodbox.ecom.onlineportal.entity.Menu;

public interface MenuCuisineRepository extends JpaRepository<Menu, Integer>  {
	
	List<Menu> findMenuByCuisineid(int cuisineid);
}

