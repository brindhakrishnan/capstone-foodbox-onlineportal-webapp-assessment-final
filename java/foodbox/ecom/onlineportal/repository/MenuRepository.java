package foodbox.ecom.onlineportal.repository;

//import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import foodbox.ecom.onlineportal.entity.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer>  {
	
	Optional<Menu> findMenuById(int id);

}

