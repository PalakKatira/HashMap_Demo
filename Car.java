package com.palak.monday_demo;

public class Car implements Comparable<Car>{

	private String regNumber;
	private int price;
	
	//Default constructors
	public Car() {
		super();
	}

	//Parameterized constructors
	public Car(String regNumber, int price) {
		super();
		this.regNumber = regNumber;
		this.price = price;
	}

	//Getter setter 
	public String getRegNumber() {
		return regNumber;
	}

	public void setRegNumber(String regNumber) {
		this.regNumber = regNumber;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((regNumber == null) ? 0 : regNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (price != other.price)
			return false;
		if (regNumber == null) {
			if (other.regNumber != null)
				return false;
		} else if (!regNumber.equals(other.regNumber))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [regNumber=" + regNumber + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Car c1) {
		
		if(this.getPrice()>c1.getPrice())
		return -1;
		else if(this.getPrice()<c1.getPrice())
			return 1;
		return 0;
	}


	

	
	
	
}
