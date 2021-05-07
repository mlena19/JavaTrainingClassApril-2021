package day7assignment5;

public class ThreeDimentionalShape extends Polygonclass {
	private int height;

	// Q4 Create a ThreeDimentionalShape class inheriting from Polygon class. Add
	// height property,
	// create a constructor with Sides , color and Height.Add a method to display
	// the height

	public ThreeDimentionalShape(int sides, String color, int height) {
		super(sides, color);
		this.height = height;
	}

	public void displayheight() {
		System.out.println(height);
	}
}
