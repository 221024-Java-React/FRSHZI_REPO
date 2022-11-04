package Model;

import java.io.Serializable;

public class Ticket implements Serializable {

	private static final long serialVersionUID = 1L;

	private String ID;
	private double amount;
	private String description;
	private String status;
	
	static enum Type{
	  travel,
	  lodging,
	  food,
	  other;
		}
	public Ticket() {
		super();
	}
	public Ticket(String iD, double amount, String description, String status, Type type) {
		super();
		ID = iD;
		this.amount = amount;
		this.description = description;
		this.status = status;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}


}
