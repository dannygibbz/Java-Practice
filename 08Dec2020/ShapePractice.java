package dayTwoHomework;


interface Shape {
	  public void calculateArea(); 
	  public void display(); 
}

class Circle implements Shape {
  public void calculateArea(){
	System.out.println("this is the circle");
    
  }
  public void display() {
    System.out.println("Text to display for circle");
  }
  
  
}

class Rectangle implements Shape {
  public void calculateArea(){
	System.out.println("this is the rectangle");
    
  }
  public void display() {
    System.out.println("Text to display for rectangle");
  }
  
}

class Triangle implements Shape {
  public void calculateArea(){
	System.out.println("this is the triangle");
	    
  }
  public void display() {
	System.out.println("Text to display for triangle");
  }
	  
}

public class ShapePractice{
	public static void main(String[] args) {
		Circle myCircle = new Circle();
		Rectangle myRectangle = new Rectangle();
		Triangle myTriangle = new Triangle();
		myCircle.calculateArea();
		myRectangle.display();
	}
} 
