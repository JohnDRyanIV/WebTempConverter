package model;

public class FahrenheitToCelsius {
	private double tempF, tempC;
	
	public FahrenheitToCelsius() {
		super();
	}
	
	public FahrenheitToCelsius(double tempF) {
		super();
		setTempF(tempF);
		setCelsius(tempF);
	}
	
	public void setCelsius(double tempF) {
		setTempC((getTempF() - 32) * 5/9);
	}
	
	@Override
	public String toString() {
		return String.valueOf(getTempF()) + " Fahrenheit = " + String.format("%.3f", getTempC()) + " Celsius";
	}
	
	// Getters-Setters

	public double getTempF() {
		return tempF;
	}

	public void setTempF(double tempF) {
		this.tempF = tempF;
	}

	public double getTempC() {
		return tempC;
	}

	public void setTempC(double tempC) {
		this.tempC = tempC;
	}
}
