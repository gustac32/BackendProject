package Items;
import java.lang.Math;
import java.util.Scanner;
public abstract class  AreaCalcc  {
	private String str;
	private Scanner input = new Scanner(System.in);
	private String name;
	private String shape;
	private double height;
	private double width;
	private double length;
    private double weight;
    
	public double AreaCalc(double width,double length) {
		double a;
		int y;
		System.out.println("Select Shape: 1.Cylinder 2.Rectangle 3.Cube 4.Polygon");
		y = input.nextInt();
		if(y == 1) {
		 a = Math.PI * width * (length/2);
		 return a;
		}else if(y == 2) {
			a = length * width;
			return a;
		}else if(y == 3) {
			a = length * length;
			return a;
		}else if(y == 4) {
			System.out.println("input sides of the polygon packaging: ");
			y = input.nextInt();
			a =  width * length * (double)y;
			return a;
		}
		 else {
			System.out.println("ERROR ON DATA");
			System.exit(1);
			return 0;
		 }
	}
	
	
}
