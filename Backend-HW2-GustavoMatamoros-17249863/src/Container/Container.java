package Container;
import java.util.ArrayList;
import java.util.List;
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
		List<String> Info = new ArrayList();
		String Info1;
		Info1 = ("container is: " +this.Name);
		Info1 = Info1 + (" The specifications are: ");
		Info1 = Info1 + (" the height is: "  +this.height + " m");
		Info1 = Info1 + (" the width is: "  +this.width+ " m");
		Info1 = Info1 + (" the Length is: "  +this.length+ " m");
		Info1 = Info1 + (" the volume for the container is: " +VolumeCalc() + " m3");
		Info.add(Info1);
		System.out.println(Info);
		}
	public double VolumeCalc() {
		double x = height*length*width;
        return x;
	}
	

}
