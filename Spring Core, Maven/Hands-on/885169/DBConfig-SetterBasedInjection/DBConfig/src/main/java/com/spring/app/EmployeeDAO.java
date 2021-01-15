package com.spring.app;

public class EmployeeDAO {
    
    DBConfig dbConfig;
    public DBConfig getDbConfig(){
        return dbConfig;
    }
    public void setDbConfig(DBConfig dbConfig ){
        this.dbConfig = dbConfig ;
    }
	
}
