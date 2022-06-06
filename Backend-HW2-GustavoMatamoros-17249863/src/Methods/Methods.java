package Methods;
import Items.Item;
import Container.Container;
import java.util.Scanner;

public class Methods  {
	private Scanner input = new Scanner(System.in);
	Item items = new Item();
	Container Contain = new Container();
	public double TotalVolume(int x) {
	    double y;
		y = items.itemVol() * x;
		System.out.println("the total volume is: " +y);
		return x;
	}
	public double TotalWeight(int x) {
	   double y;
	   y = items.getWeight() * x;
	   System.out.println("the total weight: " +y);
	   return x;
	}
	public void ShippingMethod(double volume) {
		if(volume <= Contain.VolumeCalc()) {
			System.out.println("Small container Assigned");
		}else if(volume > Contain.VolumeCalc()) {
			System.out.println("Big container assigned");
		}
	}
	
}
