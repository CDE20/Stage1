package com.spring.app;

public class MemberShip {

	private Customer customer;
	private int membershipId;
	private String membershipType;
	private int visitsPerYear;

	public MemberShip(Customer customer) {
		this.customer = customer;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public int getMembershipId() {
		return membershipId;
	}

	public String getMembershipType() {
		return membershipType;
	}

	public int getVisitsPerYear() {
		return visitsPerYear;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setMembershipId(int membershipId) {
		this.membershipId = membershipId;
	}

	public void setMembershipType(String membershipType) {
		this.membershipType = membershipType;
	}

	public void setVisitsPerYear(int visitsPerYear) {
		this.visitsPerYear = visitsPerYear;
	}

	@Override
	public String toString() {
		return "MemberShip [membershipId=" + membershipId + ", membershipType=" + membershipType + ", visitsPerYear="
				+ visitsPerYear + ", customer=" + customer + "]";
	}

}
