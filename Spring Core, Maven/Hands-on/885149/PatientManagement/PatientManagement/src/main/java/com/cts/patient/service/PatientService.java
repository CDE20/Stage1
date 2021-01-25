package com.cts.patient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.cts.patient.model.Patient;

public class PatientService {

	// fill the code
	@Autowired
	private Patient patient;

	public void getPatientDetails() {
		System.out.println("Patient Id : "+patient.getPid());
		System.out.println("Patient Name : "+patient.getPname());
		System.out.println("Disease : "+patient.getDisease());
		System.out.println("Sex : "+patient.getSex());
		System.out.println("Patient Admit Status : "+patient.getAdmit_status());
		System.out.println("Age : "+patient.getAge());
	}

	public Patient getPatient() {
		return patient;
	}


	public void setPatient(Patient patient) {
		this.patient = patient;
	}

}
