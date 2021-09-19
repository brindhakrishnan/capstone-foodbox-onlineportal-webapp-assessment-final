package foodbox.ecom.onlineportal.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="customer_email")
	private String email;
	
	@Column(name="order_date")
	private Date orderDate;
	
	@Column(name="total_amount")
	private float amount;
	
	@Column(name="order_status")
	private String orderStatus;

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(int id, String email, Date orderDate, float amount, String orderStatus) {
		super();
		this.id = id;
		this.email = email;
		this.orderDate = orderDate;
		this.amount = amount;
		this.orderStatus = orderStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	
	
}
