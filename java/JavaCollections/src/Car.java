
public class Car  implements Comparable<Car>{
	private String registrationNumber;
	private int price;
	
	public Car(String registrationNumber){
		this.registrationNumber = registrationNumber;
	}
	
	public Car(String registrationNumber, int price) {
		this.registrationNumber = registrationNumber;
		this.price = price;
	}
	

	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Car){
			String regNumber = ((Car)obj).getRegistrationNumber();
			if(regNumber != null & regNumber.equals(this.registrationNumber)){
				return true;
			}
		}
		return false;
	}
	
	public int hashCode() {
		return this.registrationNumber.hashCode();
	}

	public String toString() {
		return this.registrationNumber;
	}

	/**
	 * Natural ordering for car instances
	 */
	public int compareTo(Car o) {
		if(this.getPrice() > o.getPrice()){
			return 1;
		}else if(this.getPrice() < o.getPrice()){
			return -1;
		}
		return 0;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}


	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
}
