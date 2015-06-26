package com;

public class Account {

	private int id;
	private String name;
	private boolean active;
	private int count;
	private int[] address_ids;
	private AccountItem[] accounts;
	
	public Account(){}

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

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int[] getAddress_ids() {
		return address_ids;
	}

	public void setAddress_ids(int[] address_ids) {
		this.address_ids = address_ids;
	}

	public AccountItem[] getAccounts() {
		return accounts;
	}

	public void setAccounts(AccountItem[] accounts) {
		this.accounts = accounts;
	}
	
}

