package foodbox.ecom.onlineportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import foodbox.ecom.onlineportal.entity.OrderDetails;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Integer>  {
	
	List<OrderDetails> findOrderDetailsById(int orderId);
}