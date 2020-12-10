
public class Vehicle implements Loan,Insurance {
	
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
	    double loan_amount=0;
	    if(this.vehicleType.equals("4 wheeler")){
	        loan_amount=(this.price*80)/100;
	    }
	    
	    else if(this.vehicleType.equals("3 wheeler")){
	        loan_amount=(this.price*75)/100;
	    }
	    
	    if(this.vehicleType.equals("2 wheeler")){
	        loan_amount=(this.price*50)/100;
	    }
	    return loan_amount;
	}
	 public double takeInsurance(){
	     int amount=0;
	     if(this.price<=150000){
	         amount=3500;
	     }
	     else if(this.price>=150000&&this.price<=300000){
	         amount=4000;
	     }
	     else if(this.price>=300000){
	         amount=5000;
	     }
	     return amount;
	 }
	

}
