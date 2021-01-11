package com.cts.patient;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.cts.patient.config.AppConfig;
import com.cts.patient.service.*;

public class Main {

	public static void main(String[] args) {
	//fill the code
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		PatientService patientService = (PatientService) context.getBean(PatientService.class);
		
		patientService.getPatientDetails();

	}

}
