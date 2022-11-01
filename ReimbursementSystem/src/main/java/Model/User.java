package Model;

import java.io.Serializable;

public class User implements Serializable{

	private static final long serialVersionUID = 1L;
	private int ID;
	private String name;
	private String username;
	private transient String password;
	private String email;
	private String address;
	public User() {
		super();
	}
	
	enum Role{
		admin,
		employee;
		}
	
	public User(int iD, String name, String username, String password, String email, String address, Role role) {
		super();
		ID = iD;
		this.name = name;
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
		role = role==null?Role.employee:role;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
