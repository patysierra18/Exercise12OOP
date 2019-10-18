package com.exercise12oopshape.model;

public class Shape implements Shapeable, Lineable
{

	@Override
	public String Draw() {
				return "Figure is being drawn";
	}

	@Override
	public String ChangeColor() {
			return "Figure color has been changed";
	}

	@Override
	public String Erase() {
		
		return "Figure is being erased";
	}
	@Override
	public double CalculateArea() {
		
		return 0;
	}

	@Override
	public double CalculatePerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void DoSomething() {
		// TODO Auto-generated method stub
		
	}
}









