package foodbox.ecom.onlineportal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cuisine")
public class Cuisine {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Column(name="cuisine_name")
	private String cuisinename;
	
	@Column(name="description")
	private String description;
	
	public Cuisine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cuisine(int id, String cuisinename, String description ) {
		super();
		this.id = id;
		this.cuisinename = cuisinename;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCuisinename() {
		return cuisinename;
	}

	public void setCuisinename(String cuisinename) {
		this.cuisinename = cuisinename;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
