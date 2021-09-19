package foodbox.ecom.onlineportal.repository;

import java.util.List;
//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import foodbox.ecom.onlineportal.entity.Menu;

public interface MenuSearchRepository extends JpaRepository<Menu, Integer>  {
	
	@Query("SELECT m FROM Menu m WHERE CONCAT(m.menuname, ' ', m.price, ' ', m.description) LIKE %?1%")

	
	List<Menu> menuSearch(String keyword);

}

