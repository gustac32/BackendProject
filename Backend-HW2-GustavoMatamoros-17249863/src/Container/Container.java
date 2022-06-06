package Container;

public class Container {
	private double height;
	private double width;
	private double length;
	private String Name;
	public Container() {
		super();
		this.height = getHeight();
		this.width = getWidth();
		this.length = getLength();
		Name = getName();
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
		System.out.println("the container selected is: " +getName());
		System.out.println("its specifications are: "+" height: " +getHeight() +" length: " +getLength() + " width: " + getWidth() );
	}
	public double VolumeCalc() {
		if(height <= 0 || length <= 0 || width <= 0) {
			System.out.println("ERROR");
			System.exit(1);
		}
		else {
			return height*length*width;
		}
            return height*length*width;
	}
	

}
