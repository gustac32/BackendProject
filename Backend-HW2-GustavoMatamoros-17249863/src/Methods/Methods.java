package Methods;
import java.util.Scanner;
import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class Methods  {
	private Scanner input = new Scanner(System.in);
	private int price;
    public int getPrice() {
		return price;
	}
//Use comma when putting decimal on length
	public void setPrice(double TotalV,double ContainerSmall,double weight) {
		if(TotalV <= ContainerSmall) {
		      if(weight <= 500) {
					System.out.println("Price is 1000" +" €" + " per container");
					price = 1000;
				 }else{
					System.out.println("Price is 1200" + " €" + " per container");
					price = 1200;
				   }	
			        }else {
				System.out.println("price is 1800" + " €" + " per container");
				price = 1800;
			}
		}
		
	    public double TotalVolume(int x,double shipmentVolume) {
		double z = x * shipmentVolume;
		return z;
		
	}
	
	    public double TotalWeight(int x, double weight) {
		double z;
		z = x * weight;
		System.out.println("the total weight for the order is: " +z + " kg");
		return z;
	}
	    public double ShippingMethod(double volumeSmall,double volumeB,double volumeShipment) {
	    double type;
		if(volumeShipment <= volumeSmall) {
			System.out.println("Small container Assigned");
			return 1;
		 }
		if(volumeShipment/volumeB <= 1.0 ) {
			System.out.println("Big container assigned");
			return 1;
		  }else {
			type = volumeShipment/volumeB;
			System.out.println("number of: " +(int)type +" of big containers are selected");
			return (int)type;
		}
		
	}
	
	    public void addOrderinfo(double TotalWeight , double TotalVol,int price) {
		System.out.println("final weight is: " +TotalWeight + " kg");
		System.out.println("final Volume is: " +TotalVol + " m3");
		System.out.println("the final price is: " +price + " €");
	}
	
}
