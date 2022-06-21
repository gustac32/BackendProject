package Items;
import java.util.*;
import java.util.Scanner;
import java.lang.Math;
//class extends area class to make the volume calculator work
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
	private double quantity;
	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	private Scanner input = new Scanner(System.in);
    //constructor using getters and setters
	public Item() {
		super();
		Shape = getShape();
		this.name = getName();
		this.height = getHeight();
		this.width = getWidth();
		this.length = getLength();
		this.weight = getWeight();
		System.out.println("Information assigned to: " +this.name);
	}
	//setters and getters each setter has a scanner function to input data 
	
	//method of volume calculation plus the area calculation 
	public double VolumeCalc() {
		double volume;
		volume = AreaCalc(length, width) * height;
		return volume;
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

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public void setItemInfo(String itemInfo) {
		ItemInfo = itemInfo;
	}

	//setter and getter to print item information 
	public void setIteminfo() {
		List<String> Info = new ArrayList();
		String Info1;
		Info1 = ("product name is: " +getName() +" ,");
		Info1 = Info1 + (" product shape is: " + getShape() +" ,");
		Info1 = Info1 + (" The weight is: " + getWeight()+ " kg");
		Info1 = Info1 + (" the height is: "  +getHeight()+ " m3");
		Info1 = Info1 + (" the width is: "  +getWidth() + " m3");
		Info1 = Info1 + (" the Length is: "  +getLength()+ " m3");
		Info.add(Info1);
		System.out.println(Info);
		}
	public String getItemInfo() {
		return ItemInfo;
	}
	//use comma as decimal
	//Gustavo Matamoros
	
}