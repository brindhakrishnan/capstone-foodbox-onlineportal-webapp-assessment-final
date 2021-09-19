package foodbox.ecom.onlineportal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import foodbox.ecom.onlineportal.entity.Orders;

public interface OrderRepository extends JpaRepository<Orders, String>  {
	
	Optional<Orders> findOrderByEmail(String email);
}

