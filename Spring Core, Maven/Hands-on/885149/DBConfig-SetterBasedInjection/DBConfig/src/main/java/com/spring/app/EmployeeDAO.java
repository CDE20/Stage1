package com.spring.app;

public class EmployeeDAO {
	private DBConfig dbConfig;
		
		public DBConfig getDbConfig() {
		return dbConfig;
	}

	public void setDbConfig(DBConfig dbConfig) {
		this.dbConfig = dbConfig;
	}
	public String getDbUrl(){
	    return dbConfig.getDriverName()+"\n"+dbConfig.getUrl()+"\n"+dbConfig.getUserName()+"\n"+dbConfig.getPassword();
	}
}
