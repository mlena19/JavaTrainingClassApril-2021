package day7assignment5;

public class MainClass {

	public static void main(String[] args) {
		// Creating a main class to call for Polygon class, and this part of Q1...
		//In the main class create 3 objects triangle, rectangle and polygon
		Polygonclass traingle = new Polygonclass(3, "White");
		traingle.displaySides();
		traingle.displayColor();
		Polygonclass rectangle = new Polygonclass(4, "Red");
		rectangle.displaySides();
		rectangle.displayColor();
		Polygonclass polygon = new Polygonclass(8, "Green");
		polygon.displaySides();
		polygon.displayColor();
	//In this main class, we called the above 6 methods for every object we have created.
		//This part of Q3
		
		
		//Q5 In the main class create a rectangular 3D object and call all the methods 
		//to display all the properties.
		ThreeDimentionalShape printheight = new ThreeDimentionalShape(3, "Blue", 15);
		printheight.displaySides();
		printheight.displayColor();
		printheight.displayheight();
	}
}
