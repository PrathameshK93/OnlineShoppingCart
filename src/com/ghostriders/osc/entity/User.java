package com.ghostriders.osc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "`user`")
public class User {

	@Id
	@Column(name = "user_id")
	private int uid;
	@Column(name = "user_fname")
	private String Firstname;
	@Column(name = "user_lname")
	private String Lastname;
	@Column(name = "user_dob")
	private String DateOfBirth;
	@Column(name = "user_email")
	private String Email;
	@Column(name = "user_mno")
	private String MobileNo;
	@Column(name = "user_address")
	private String Address;
	@Column(name = "user_uname")
	private String Username;
	@Column(name = "user_pass")
	private String Password;

	public User(String firstname, String lastname, String dateOfBirth, String email, String mobileNo, String address,
			String username, String password) {
		super();
		Firstname = firstname;
		Lastname = lastname;
		DateOfBirth = dateOfBirth;
		Email = email;
		MobileNo = mobileNo;
		Address = address;
		Username = username;
		Password = password;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getFirstname() {
		return Firstname;
	}

	public void setFirstname(String firstname) {
		Firstname = firstname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	@Override
	public String toString() {
		return "User [Firstname=" + Firstname + ", Lastname=" + Lastname + ", DateOfBirth=" + DateOfBirth + ", Email="
				+ Email + ", MobileNo=" + MobileNo + ", Address=" + Address + ", Username=" + Username + ", Password="
				+ Password + "]";
	}

}
