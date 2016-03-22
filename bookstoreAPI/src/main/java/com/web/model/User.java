package com.web.model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER")
public class User {
	
    @Id
    @Column(name="USER_ID")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long userId;
    
    @Column(name="FIRST_NAME")
	private String firstName;
    
    @Column(name="LAST_NAME")
	private String lastName;
    
//   TODO : change mapping to college
    @Column(name="COLLEGE_ID")
	private long collegeId;
    
    @Column(name="ROLL_NO")
	private BigInteger rollNo;
    
    @Column(name="PASSWRD")
	private String password;
    
    @Column(name="USER_ADD_1")
	private String userAdd1;
    
    @Column(name="USER_ADD_2")
	private String userAdd2;
    
    @Column(name="USER_ADD_3")
	private String userAdd3;
    
    @Column(name="USER_CITY")
	private String userCity;
    
    @Column(name="USER_PIN")
	private long userPin;
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(long collegeId) {
		this.collegeId = collegeId;
	}
	public BigInteger getRollNo() {
		return rollNo;
	}
	public void setRollNo(BigInteger rollNo) {
		this.rollNo = rollNo;
	}
	public String getUserAdd1() {
		return userAdd1;
	}
	public void setUserAdd1(String userAdd1) {
		this.userAdd1 = userAdd1;
	}
	public String getUserAdd2() {
		return userAdd2;
	}
	public void setUserAdd2(String userAdd2) {
		this.userAdd2 = userAdd2;
	}
	public String getUserAdd3() {
		return userAdd3;
	}
	public void setUserAdd3(String userAdd3) {
		this.userAdd3 = userAdd3;
	}
	public String getUserCity() {
		return userCity;
	}
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	public long getUserPin() {
		return userPin;
	}
	public void setUserPin(long userPin) {
		this.userPin = userPin;
	}
	
	

}
