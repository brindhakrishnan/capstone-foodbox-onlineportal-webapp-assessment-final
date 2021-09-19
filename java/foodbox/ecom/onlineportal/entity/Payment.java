package foodbox.ecom.onlineportal.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="payment")
public class Payment {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="order_id")
	private int orderId;
	
	@Column(name="amount")
	private float amount;
	
	@Column(name="paid_by")
	private String paidby;
	
	@Column(name="payment_date")
	private Date paymentDate;

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(int id, int orderId, float amount, String paidby, Date paymentDate) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.amount = amount;
		this.paidby = paidby;
		this.paymentDate = paymentDate;
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

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getPaidby() {
		return paidby;
	}

	public void setPaidby(String paidby) {
		this.paidby = paidby;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	
	
}

