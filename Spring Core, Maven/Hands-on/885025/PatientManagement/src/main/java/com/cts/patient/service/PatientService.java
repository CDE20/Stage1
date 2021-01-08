package com.cts.patient.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cts.patient.model.Patient;

public class PatientService {

	// fill the code
	@Autowired
	private Patient patient;

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public void getPatientDetails() {
		// fill the code
		System.out.println("Patient Id : " + patient.getPid() + "\nPatient Name : " + patient.getPname()
				+ "\nDisease : " + patient.getDisease() + "\nSex : " + patient.getSex() + "\nAdmit Status : "
				+ patient.getAdmit_status() + "\nAge : " + patient.getAge());
	}

}