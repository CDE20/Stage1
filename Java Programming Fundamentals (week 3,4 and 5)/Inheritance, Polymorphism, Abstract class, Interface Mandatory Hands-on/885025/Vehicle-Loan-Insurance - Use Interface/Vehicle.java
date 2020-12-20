
public class Vehicle implements Loan, Insurance {
	
	private String vehicleNumber;
	private String modelName;
	private String vehicleType;
	private double price;
	
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Vehicle(String vehicleNumber, String modelName, String vehicleType,double price) {
		
		this.vehicleNumber = vehicleNumber;
		this.modelName = modelName;
		this.vehicleType=vehicleType;
		this.price = price;
	}
	
	public double issueLoan(){
	    double la;
	    if(vehicleType=="4 wheeler"){
	        la=(80*price)/100;
	    }
	    else if(vehicleType=="3 wheeler"){
	        la=(75*price)/100;
	    }
	    else {
	        la=(50*price)/100;
	    }
	    
	    return la;
	    
	}
	
	public double takeInsurance(){
	    double ia;
	    if( price<=150000 ){
	        ia=3500;
	        
	    }
	    else if(price>150000 && price<=300000){
	        ia=4000;
	        
	    }
	    else {
	        ia=5000;
	        
	    }
	    
	    
	    return ia;
	    
	    
	}

}
