package com.psl.beans;

public class Transaction {
	int id, amount;
	String type;

	public Transaction(int id, int amount, String type) {
		super();
		this.id = id;
		this.amount = amount;
		this.type = type;
	}
	public Transaction() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", amount=" + amount + ", type="
				+ type + "]";
	}
	
}
