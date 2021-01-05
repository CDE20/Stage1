package com.cts.passportService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Type your code here
@Component
public class BangalorePassportOffice implements HeadPassportOffice  {

	private Document bangaloreDocument;
		
    // Type your code here
	@Autowired
	public BangalorePassportOffice(Document bangaloreDocument) {
		super();
		this.bangaloreDocument = bangaloreDocument;
	}

	@Override
	public void doPhotoVerification() {
		// TODO Auto-generated method stub
		System.out.println("Photo verification done using "+this.bangaloreDocument.getIdProof());
	}

	@Override
	public void issuePassport() {
		// TODO Auto-generated method stub
		System.out.println("Passport issue is in progress for "+this.bangaloreDocument.getName()+" from "+ this.bangaloreDocument.getCity()+" office");
	}

	
	// Type your code here

	

}
