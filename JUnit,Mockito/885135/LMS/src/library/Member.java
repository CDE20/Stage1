package library;

public class Member {
	private final String memberId;
	private final String memberName;
	private final String memberType;
	private final int entitlement;
	private final String address;
	private final String emailId;

	public Member(String memberId, String memberName, String memberType, int entitlement, String address,
			String emailId) {
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberType = memberType;
		this.entitlement = entitlement;
		this.address = address;
		this.emailId = emailId;
	}

	public String getMemberId() {
		return this.memberId;
	}

	public String getMemberName() {
		return this.memberName;
	}

	public String getMemberType() {
		return this.memberType;
	}

	public int getEntitlement() {
		return this.entitlement;
	}

	public String getAddress() {
		return this.address;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public String toString() {

		return this.memberId + " " + this.memberName;
	}
}
