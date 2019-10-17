package com.exercise12oopshape.model;

public class Circle extends Shape 
{
	private double radio;

	public Circle()
	{
	}
	public Circle(double radio)
	{
		this.radio=radio;
	}
	public double CalculateArea(double radio)
	{
		return Math.PI*(Math.pow(radio, 2));
	}
	
	public double CalculatePerimeter(double base, double height, double hypotenuse)
	{
		return 2*Math.PI*radio;
	}
	//getter and setter
		public double getRadio() {
			return radio;
		}
		public void setRadio(double radio) {
			this.radio = radio;
		}
	
}
