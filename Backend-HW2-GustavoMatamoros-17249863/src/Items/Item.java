package Items;
import java.util.*;
import java.util.Scanner;
import java.lang.Math;
public  class Item extends AreaCalcc{
	//atributes 
    private String Shape;
	private String name;
	private double height;
	private double width;
	private double length;
	private double weight;
	private double volume;
	private String ItemInfo;
	private Scanner input = new Scanner(System.in);
    
	public Item() {
		super();
		setShape(); setName(); setHeight(); setWidth(); setLength(); setWeight();
		Shape = getShape();
		this.name = getName();
		this.height = getHeight();
		this.width = getWidth();
		this.length = getLength();
		this.weight = getWeight();
		System.out.println("Information assigned to: " +this.name);
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight() {
		System.out.println("Input Weight: ");
		this.weight = input.nextDouble();
	}
	public String getShape() {
		return Shape;
	}
	public void setShape() {
		System.out.println("Input Shape of packaging: ");
		this.Shape = input.nextLine();
	}
	public String getName() {
		return name;
	}
	public void setName() {
		System.out.println("Input Name: ");
		this.name = input.nextLine();
	}
	public double getHeight() {
		return height;
	}
	public void setHeight() {
		System.out.println("Input Height: ");
		this.height = input.nextDouble();
	}
	public double getWidth() {
		return width;
	}
	public void setWidth() {
		System.out.println("Input Width: ");
		this.width = input.nextDouble();
	}
	public double getLength() {
		return length;
	}
	public void setLength() {
		System.out.println("Input Length: ");
		this.length = input.nextDouble();
	}
	public double VolumeCalc() {
		double volume;
		volume = AreaCalc(length, width) * height;
		return volume;
	}
	public void setIteminfo() {
		List<String> Info = new ArrayList();
		String Info1;
		Info1 = ("product name is: " +getName() +" ,");
		Info1 = Info1 + (" product shape is: " + getShape() +" ,");
		Info1 = Info1 + (" The weight is: " + getWeight()+ " m3");
		Info1 = Info1 + (" the height is: "  +getHeight()+ " m3");
		Info1 = Info1 + (" the width is: "  +getWidth() + " m3");
		Info1 = Info1 + (" the Length is: "  +getLength()+ " m3");
		Info.add(Info1);
		System.out.println(Info);
		}
	public String getItemInfo() {
		return ItemInfo;
	}
	
	
}