package by.htp.shop.domain;

import javax.persistence.Entity;

@Entity
public class User extends BaseEntity {

	private static final long serialVersionUID = 1L;
	
	private String name;
	private String password;
	private boolean isAdmin;

	public User(){
		
	}
	
	public User(int id){
		super(id);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
}
