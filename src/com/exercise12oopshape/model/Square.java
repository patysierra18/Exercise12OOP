package com.exercise12oopshape.model;

public class Square extends Shape
{
	private double side;
	
	public Square()
	{
	}
	public Square(double side)
	{
		this.setSide(side);
	}

	
	
	public double CalculateArea(double side)
	{
		return side*side;
	}
	
	public double CalculatePerimeter(double side)
	{
		return 4*side;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
}
