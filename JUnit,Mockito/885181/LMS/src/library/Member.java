package library;

public class Member {
	public String memberId;
	public String memberName;
	public String memberType;
	private int entitlement;
	public String address;
	public String emailId;

	public Member(String memberId, String memberName, String memberType, int entitlement, String address,
			String emailId) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberType = memberType;
		this.entitlement = entitlement;
		this.address = address;
		this.emailId = emailId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberType() {
		return memberType;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}

	public int getEntitlement() {
		return entitlement;
	}

	public void setEntitlement(int entitlement) {
		this.entitlement = entitlement;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

}
