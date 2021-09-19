package foodbox.ecom.onlineportal.repository;

//import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import foodbox.ecom.onlineportal.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>  {
	
	Optional<Payment> findPaymentByOrderId(int orderId);
	
}
