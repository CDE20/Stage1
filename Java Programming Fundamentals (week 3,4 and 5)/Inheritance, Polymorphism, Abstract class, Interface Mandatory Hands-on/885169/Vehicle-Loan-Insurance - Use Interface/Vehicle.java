
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
@Override
	public double takeInsurance() {
		// TODO Auto-generated method stub
		double insurance = 0;
		if(price <= 150000) {
			insurance = 3500;
		}
		else if(price > 150000 && price <= 300000) {
			insurance = 4000;
		}
		else if(price > 300000) {
			insurance = 5000;
		}
		return insurance;
	}
	@Override
	public double issueLoan() {
		// TODO Auto-generated method stub
		double loan = 0;
		if(vehicleType.equals("4 wheeler")) {
			loan = price * 0.8;
		}
		else if(vehicleType.equals("3 wheeler")) {
			loan = price * 0.75;
		}
		else if(vehicleType.equals("2 wheeler")) {
			loan = price * 0.5;
		}
		return loan;
	}

}


