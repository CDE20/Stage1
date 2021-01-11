package com.cts.patient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.cts.patient.model.Patient;

@Component("patientService")
public class PatientService {

	//fill the code
	@Autowired
	private Patient patient;
	
	
	public Patient getPatient() {
		return patient;
	}

	
	public void setPatient(Patient patient) {
		this.patient = patient;
	}


	public void getPatientDetails() {
		//fill the code
		System.out.println("Patient Id : "+patient.getPid());
		System.out.println("Patient Name : "+patient.getPname());
		System.out.println("Disease  : "+patient.getDisease());
		System.out.println("Sex : "+patient.getSex());
		System.out.println("Admit Status : "+patient.getAdmit_status());
		System.out.println("Age : "+patient.getAge());
	}
	
	
}
