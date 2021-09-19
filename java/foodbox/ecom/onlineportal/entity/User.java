package foodbox.ecom.onlineportal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
	public class User {
		
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private int id;

		@Column(name="first_name")
		private String firstname;
		
		@Column(name="last_name")
		private String lastname;
		
		@Column(name="email")
		private String email;
		
		@Column(name="phone_number")
		private String phone;
		
		@Column(name="password")
		private String password;
		
		@Column(name="account_status")
		private int accountstatus;

		public User() {
			super();
			// TODO Auto-generated constructor stub
		}

		public User(int id, String firstname, String lastname, String email, String phone, String password) {
			super();
			this.id = id;
			this.firstname = firstname;
			this.lastname = lastname;
			this.email = email;
			this.phone = phone;
			this.password = password;
		}

			
		public User(String firstname, String lastname, String email, String phone, String password) {
				super();
				this.firstname = firstname;
				this.lastname = lastname;
				this.email = email;
				this.phone = phone;
				this.password = password;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhone() {
			return phone;
		}

		public void setPhone(String phone) {
			this.phone = phone;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public int getAccountstatus() {
			return accountstatus;
		}

		public void setAccountstatus(int accountstatus) {
			this.accountstatus = accountstatus;
		}

		
		
}
