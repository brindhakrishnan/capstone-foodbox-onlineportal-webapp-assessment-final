package foodbox.ecom.onlineportal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="menuitem")
public class Menu {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="menu_name")
	private String menuname;
	
	@Column(name="price")
	private float price;
	
	@Column(name="cuisine_id")
	private int cuisineid;
	
	@Column(name="description")
	private String description;
	
	@Column(name="menu_status")
	private int menustatus;

	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Menu(int id, String menuname, float price, int cuisineid, String description, int menustatus) {
		super();
		this.id = id;
		this.menuname = menuname;
		this.price = price;
		this.cuisineid = cuisineid;
		this.description = description;
		this.menustatus = menustatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMenuname() {
		return menuname;
	}

	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getCuisineid() {
		return cuisineid;
	}

	public void setCuisineid(int cuisineid) {
		this.cuisineid = cuisineid;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getMenustatus() {
		return menustatus;
	}

	public void setMenustatus(int menustatus) {
		this.menustatus = menustatus;
	}
	
}
