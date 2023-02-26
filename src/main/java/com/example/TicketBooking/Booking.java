package com.example.TicketBooking;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="name")
	private String name;

	@Column(name="contactnum")
	private long contactnum;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="age")
	private int age;
	
	@Column(name="Username")
	private String username;
	
	@Column(name="Password")
	private String password;
	
	@Column(name="Gender")
	private char gender;
	
	@Column(name="seattype")
	private String seattype;
	
	@Column(name="pod")
	private String pod;
	
	@Column(name="Destination")
	private String destination;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getContactnum() {
		return contactnum;
	}

	public void setContactnum(long contactnum) {
		this.contactnum = contactnum;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getSeattype() {
		return seattype;
	}

	public void setSeattype(String seattype) {
		this.seattype = seattype;
	}

	public String getPod() {
		return pod;
	}

	public void setPod(String pod) {
		this.pod = pod;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Booking(int id, String name, long contactnum, String email, int age, String username, String password,
			char gender, String seattype, String pod, String destination) {
		super();
		this.id = id;
		this.name = name;
		this.contactnum = contactnum;
		this.email = email;
		this.age = age;
		this.username = username;
		this.password = password;
		this.gender = gender;
		this.seattype = seattype;
		this.pod = pod;
		this.destination = destination;
	}
	
	@Override
	public String toString() {
		return "Booking [id=" + id + ", name=" + name + ", contactnum=" + contactnum + ", email=" + email + ", age="
				+ age + ", username=" + username + ", password=" + password + ", gender=" + gender + ", seattype="
				+ seattype + ", pod=" + pod + ", destination=" + destination + "]";
	}

	public Booking()
	{
		
	}
	
}
