package foodbox.ecom.onlineportal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orderdetails")
public class OrderDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="order_id")
	private int orderId;
	
	@Column(name="menu_name")
	private String menuName;
	
	@Column(name="amount")
	private float amount;
	
	@Column(name="total_amount")
	private float totalAmount;
	
	@Column(name="quantity")
	private int quantity;

	public OrderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDetails(int id, int orderId, String menuName, float amount, float totalAmount, int quantity) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.menuName = menuName;
		this.amount = amount;
		this.totalAmount = totalAmount;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}

