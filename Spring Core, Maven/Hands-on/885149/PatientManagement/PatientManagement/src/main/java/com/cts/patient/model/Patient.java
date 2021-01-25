package com.cts.patient.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Patient {

	@Value("${pid}")
	private String pid;
	@Value("${pname}")
	private String pname;
	@Value("${disease}")
	private String disease;
	@Value("${sex}")
	private String sex;
	@Value("${admit_status}")
	private String admit_status;
	@Value("${age}")
	private Integer age;

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAdmit_status() {
		return admit_status;
	}

	public void setAdmit_status(String admit_status) {

		this.admit_status = admit_status;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
