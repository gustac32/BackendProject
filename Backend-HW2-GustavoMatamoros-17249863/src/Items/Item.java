package Items;
import java.util.Scanner;
import java.lang.Math;
public  class Item {
	//atributes 
    private String Shape;
	private String name;
	private double height;
	private double width;
	private double radius;
	private double length;
	private double weight;
	private double volume;
	private Scanner input = new Scanner(System.in);
    
	
	
	public Item() {
		super();
		this.Shape = getShape();
		this.name = getName();
		this.height = getHeight();
		this.width = getWidth();
		this.radius = getRadius();
		this.length = getLength();
		this.weight = getWeight();
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getShape() {
		return Shape;
	}
	public void setShape(String shape) {
		Shape = shape;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	public double itemVol(){
		int x;
		System.out.println("Select shape options: 1.Cylinder 2.Pentagon 3.Cube 4.Rectangle 5.Triangle");
		 x = input.nextInt();
		 if(x == 1) {
			 volume = Math.PI * (radius*radius) * height;
			 System.out.println("The volume is: " +volume);
		 }else if(x == 2) {
			 volume = (5/2)*(width*length*height);
			 System.out.println("The volume is: " +volume);
		 }else if(x == 3) {
			 volume = length*length*length;
			 System.out.println("The volume is: " +volume);
		 }else if(x ==4 ) {
			 volume = width*length*height;
			 System.out.println("The volume is: " +volume);
		 }else if(x == 5) {
			 volume = (1/2)*(width*length*height);
		 }else {
			 System.out.println("ERROR");
			 System.exit(1);
		 }
		return volume;
	}
	public void PrintIt() {
		
	}
		
	
	
	
}