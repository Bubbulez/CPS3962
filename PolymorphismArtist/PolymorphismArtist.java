/*
 
Delali Doe
CPS3962 04 - Kean University
Title: PolymorphismArtist
Task: Looking at the image (figure 1-13) provided, 
create and test all three functions.

*/

package week1;

public class PolymorphismArtist {

	public static void main(String[] args) {
		//Creating the shape objects based on corner numbers...
		Shape four = new Square();
		Shape three = new Triangle();
		Shape zero = new Circle();

		four.drawYourself();
		three.drawYourself();
		zero.drawYourself();
	}

}
