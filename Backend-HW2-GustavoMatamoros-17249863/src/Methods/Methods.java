package Methods;
import java.util.Scanner;
import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
//method class
public class Methods  {
	//attrinutes
	private Scanner input = new Scanner(System.in);
	private int price;
	//getters and setters for price
    public int getPrice() {
		return price;
	}
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
		//total volume method per order
	    public double TotalVolume(double OrderAmount, double shipmentVolume) {
	    	
		double z = OrderAmount * shipmentVolume;
		return z;
		
	}
	    //total weight per order method
	    public double TotalWeight(int x, double weight) {
		double z;
		z = x * weight;
		System.out.println("the total weight for the order is: " +z + " kg");
		return z;
	}
	    //shipping method calculator
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
	//add order method
	    public void addOrderinfo(double TotalWeight , double TotalVol,int price) {
		System.out.println("final weight is: " +TotalWeight + " kg");
		System.out.println("final Volume is: " +TotalVol + " m3");
		System.out.println("the final price is: " +price + " €");
	}
	//Gustavo matamoros
	    
}
