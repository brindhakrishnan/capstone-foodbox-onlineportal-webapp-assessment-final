package foodbox.ecom.onlineportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import foodbox.ecom.onlineportal.entity.Cart;

public interface CartRepository extends JpaRepository<Cart, String>  {
	
	List<Cart> findCartByEmail(String email);
}

