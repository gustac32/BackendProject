package Container;
import java.util.Scanner;
public class Container {
	private double height;
	private double width;
	private double length;
	private String Name;
	private Scanner input = new Scanner(System.in);
	public Container() {
		super();
		this.height = 2.59;
		this.width = 2.43;
		this.length = 6.06;
		this.Name = "Small Container";
	} 
	public Container(double length){
		this.height = 2.59;
		this.width = 2.43;
		this.length = 12.01;
		this.Name = "Big Container";
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
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public  void PrintInfo() {
		System.out.println("information assigned: ");
		System.out.println("the container selected is: " +this.Name);
		System.out.println("its specifications are: "+" height: " +this.height +" length: " +this.length + " width: " + this.width);
	}
	public double VolumeCalc() {
		double x = height*length*width;
		System.out.println("the volume for container is: " +x + " m3");
        return x;
	}
	

}
