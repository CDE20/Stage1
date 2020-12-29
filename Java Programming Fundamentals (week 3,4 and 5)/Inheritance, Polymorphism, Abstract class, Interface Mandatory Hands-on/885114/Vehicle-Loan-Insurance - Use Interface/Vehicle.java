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
	    if (vehicleType == "4 wheeler" || vehicleType == "3 wheeler" || vehicleType == "2 wheeler")
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

    @Override
    public double issueLoan() {
        double amount = 0;
        if (vehicleType == "4 wheeler") 
            amount = 0.80 * price;
            
        if (vehicleType == "3 wheeler") 
            amount = 0.75 * price;
            
        if (vehicleType == "2 wheeler") 
            amount = 0.50 * price;
            
        return amount;
    } 
    
    @Override
    public double takeInsurance() {
        double amount = 0;
        if (price <= 150000) 
            amount = 3500;
            
        if (price > 150000 && price <= 300000 ) 
            amount = 4000;
            
        if (price > 300000) 
            amount = 5000;
            
        return amount;
    }
}
