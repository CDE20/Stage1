package library;

public class Member {
	public String address;
	private String emailId;
	private int entitlement;
	private String memberId;
	private String memberName;
	private String memberType;

    /** 
    * Creates instance of Member.
    */ 
    public Member() { 
        // The explicit constructor is here. 
    } 

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

	public String getAddress() {
		return address;
	}

	public String getEmailId() {
		return emailId;
	}

	public int getEntitlement() {
		return entitlement;
	}

	public String getMemberId() {
		return memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public String getMemberType() {
		return memberType;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}
}
