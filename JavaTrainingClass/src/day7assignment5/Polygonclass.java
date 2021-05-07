package day7assignment5;

public class Polygonclass {
// Q1 is to write a java program that has a Polygon class with a property Sides and color.
	//We intialize it 1st and create a property, which is like Variable or attribute 
	private int sides =0;
	private String color = "White";
	
	//Q2 Modify your code from question 1 by adding a constructor for the Polygon class and 
	//user should pass the values for Sides and color during the initialization
	//Adding a constructor to this class which is same name as the class name 
public Polygonclass(int side, String color) {
	//the above constructor has now created but does not have arg so we add an arg ourself
	sides = side;
	this.color = color;
	}
//Q3 Modify your code from question 1 by adding two methods to display the number of 
//sides and color of the polygon object created...
public void displaySides() {
	System.out.println(sides);
}
public void displayColor() {
	System.out.println(color);
}
}
