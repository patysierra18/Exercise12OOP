package com.exercise12oopshape.app;

import com.exercise12oopshape.model.Square;
import com.exercise12oopshape.model.Triangle;

import java.util.Scanner;

import com.exercise12oopshape.model.Circle;
import com.exercise12oopshape.model.IsoselesTriangle;
import com.exercise12oopshape.model.Shape;

public class ShapeApp {

	public static void main(String[] args) {
		
		Square square1 = new Square();
		Circle circle1 = new Circle();
		Triangle triangle1 = new Triangle();
		double radio = 0.0;
		Shape miForma = new Shape();
		
		
		Square square2 = new Square(10.2);
		Circle circle2 = new Circle(5.3);
		Triangle triangle2 = new Triangle(5.4,6.8);
		IsoselesTriangle triangle3 = new IsoselesTriangle();
		
		
		
	Scanner input= new Scanner(System.in);
	System.out.println("Input the radio of the circle;");
	radio = input.nextDouble();
	
	
	
	circle1.setRadio(radio);
	
	System.out.println("The area of the circle is: "+ 
	circle1.CalculateArea(circle1.getRadio()));
		
input.close();
	}

}
