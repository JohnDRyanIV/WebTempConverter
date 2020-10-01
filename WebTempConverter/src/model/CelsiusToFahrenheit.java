package model;

public class CelsiusToFahrenheit {
	private double tempC, tempF;
	
	public CelsiusToFahrenheit() {
		super();
	}
	
	public CelsiusToFahrenheit(double tempC) {
		super();
		setTempC(tempC);
		setFahrenheit(tempC);
	}

	private void setFahrenheit(double tempC) {
		setTempF((getTempC() * 9/5) + 32);
		
	}

	@Override
	public String toString() {
		return String.valueOf(getTempC()) + " Celsius = " + String.format("%.3f",  getTempF()) + " Fahrenheit";
	}
	
	// Getters-Setters
	
	public double getTempC() {
		return tempC;
	}

	public void setTempC(double tempC) {
		this.tempC = tempC;
	}

	public double getTempF() {
		return tempF;
	}

	public void setTempF(double tempF) {
		this.tempF = tempF;
	}
}
