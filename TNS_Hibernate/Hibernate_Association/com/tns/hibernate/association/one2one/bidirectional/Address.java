package com.tns.hibernate.association.one2one.bidirectional;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ADD_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addressId;
	@Column(name = "ADD_STREET")
	private String street;

	@Column(name = "ADD_CITY")
	private String city;

	@Column(name = "ADD_STATE")
	private String state;

	@Column(name = "ADD_ZIP")
	private String zipcode;

	@OneToOne(mappedBy = "address")
	private Person person;

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}
