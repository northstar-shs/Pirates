package kr.co.spock.model;

import javax.persistence.*;

import org.codehaus.jettison.json.*;

@Entity
@Table(name="store")
public class Store {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="owner")
	private String owner;
	
	@Column(name="description")
	private String description;
	
	@Column(name="level")
	private int level;
	
	@Column(name="address")
	private String address;
	
	@Column(name="phone")
	private String phone;
	
	@Column(name="businessTimes")
	private String businessTimes;
	
	@Column(name="holidays")
	private String holidays;

	public Store() {
		
	}
	
	public Store(String name, String owner, String description,
			int level, String address, String phone, String businessTimes, String holidays) {
		this.name = name;
		this.owner = owner;
		this.description = description;
		this.level = level;
		this.address = address;
		this.phone = phone;
		this.businessTimes = businessTimes;
		this.holidays = holidays;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBusinessTimes() { 
		return businessTimes; 
	
	}
	  
	public void setBusinessTimes(String businessTimes) { 
		this.businessTimes = businessTimes; 
	}
	 
	public void setHolidays(String holidays) {
		this.holidays = holidays;
	}
	
	public String getHolidays() {
		return holidays;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
}
