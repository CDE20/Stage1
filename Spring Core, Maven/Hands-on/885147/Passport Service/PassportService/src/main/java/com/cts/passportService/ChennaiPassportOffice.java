package com.cts.passportService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Type your code here
@Component("chennai")
public class ChennaiPassportOffice implements HeadPassportOffice{

	
	private Document chennaiDocument;
	
	// Type your code here
	@Autowired
	public ChennaiPassportOffice(Document chennaiDocument) {
		super();
		this.chennaiDocument = chennaiDocument;
	}

	@Override
	public void doPhotoVerification() {
		// TODO Auto-generated method stub
		System.out.println("Photo verification done using " + chennaiDocument.getIdProof());
	}

	@Override
	public void issuePassport() {
		// TODO Auto-generated method stub
		System.out.println("Passport issue is in progress for "+ chennaiDocument.getName() +" from "+ chennaiDocument.getCity() +" office");
	}

	// Type your code here

	

}
