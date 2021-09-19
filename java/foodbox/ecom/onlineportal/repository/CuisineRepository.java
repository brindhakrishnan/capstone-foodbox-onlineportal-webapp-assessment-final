package foodbox.ecom.onlineportal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import foodbox.ecom.onlineportal.entity.Cuisine;

public interface CuisineRepository extends JpaRepository<Cuisine, Integer>  {
	
	Optional<Cuisine> findCusineById(int id);
}
