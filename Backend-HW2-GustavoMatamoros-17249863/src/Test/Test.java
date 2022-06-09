package Test;
import Items.*;
import Methods.*;
import Container.*;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double totalVol,TotalWeight;
		int price;
		Item Laptops = new Item();
	    Item mouse = new Item();
	    Item Desktop = new Item();
	    Item LCDSC = new Item();
	    Container Bigc = new Container(12.01);
	    Container smallC = new Container();
	    Methods metho = new Methods();
	    Laptops.setIteminfo();
	    mouse.setIteminfo();
	    Desktop.setIteminfo();
	    LCDSC.setIteminfo();
	    Bigc.PrintInfo();
	    smallC.PrintInfo();
	    //add al volumes from the orders
	    totalVol = metho.TotalVolume(100, Laptops.VolumeCalc())
	    + metho.TotalVolume(200, mouse.VolumeCalc()) 
	    + metho.TotalVolume(150, Desktop.VolumeCalc()) 
	    + metho.TotalVolume(200,LCDSC.VolumeCalc());
	    //add all the total weight for the orders
	    TotalWeight = metho.TotalWeight(100, Laptops.getWeight())
	    + metho.TotalWeight(200, mouse.getWeight()) 
	    + metho.TotalWeight(150, Desktop.getWeight())
	    + metho.TotalWeight(200, LCDSC.getWeight());
	    metho.setPrice(totalVol, smallC.VolumeCalc(), TotalWeight);
	    //add all prices per order 
		price = (int) metho.ShippingMethod(smallC.VolumeCalc(), Bigc.VolumeCalc(), totalVol) * metho.getPrice();
		//get the information of the orders
		metho.addOrderinfo(TotalWeight, totalVol, price);
		
		
	}

}
