package labprograms;
import java.util.Scanner;
abstract class Shape{
	public abstract float calculator Perimeter();
	public abstract float calculator Area();
}
class circle extends Shape{
	private int radius;
	public circle (int radius);
	this.radius=radius;
}
@Override
public float calculate Perimeter() {
	return(float)(2*Math.PI*radius);
}
public float calculate Area() {
	return(float)(Math.PI*radius*radius);
}
}
class Triangle extends shape{
	private int a;
	private int b;
	private int c;
	public Triangle(int a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	@Override
	public float calculatePerimeter() {
		return(float)(a+b+c);
		}
	@Override
	public float calculateArea() {
		return(float)(a+b+c);/2.0);
		float area=(float)Math.sqrt(s*(s-a)*(s-b)*(s-c));
		return area;
	}
		}
public class ShapeDemo{
	
		
}
class ShapeDemo {

	public static void main(String[] args) {
		

	}

}
