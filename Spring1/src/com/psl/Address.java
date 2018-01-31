package com.psl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("addr")
public class Address {
	@Value(value="ABC")
	private String street;
	@Value(value="PQR")
	private String city;
	@Value(value="XYZ")
	private String zip;

	public Address(String street, String city, String zip) {
		System.out.println("In Param constr of Address");

		this.street = street;
		this.city = city;
		this.zip = zip;
	}

	public Address(String street, String city) {
		System.out.println("in 2 param constr");
		this.street = street;
		this.city = city;
	}

	public Address() {
		// System.out.println("In Default constr of Address");
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		// System.out.println("in the street setter of emp");

		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		// System.out.println("in the city setter of emp");

		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		// System.out.println("in the zip setter of emp");

		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", zip=" + zip
				+ "]";
	}

	public void a() {
		// TODO Auto-generated method stub
		System.out.println("addr.initmethod");
	}

	public void d() {
		// TODO Auto-generated method stub
		System.out.println("Addr.Destroy");
	}
}
