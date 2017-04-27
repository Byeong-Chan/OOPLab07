package k_package;

import byeongChan.*;
import seoHyeon.*;

public class ProductTest {
	
	public void testProduct(Product P)
	{
		if(P instanceof Laptop){
			Laptop L=(Laptop)P;
			System.out.println("Name: "+L.getName());
			System.out.println("Freecapacity: "+L.getFreeCapacity());
			System.out.println("Maxspeed: "+L.maxSpeed());
			System.out.println("Is connected?\n"+L.isConnected());
			System.out.println("Total capacity: "+L.getTotalCapacity());
			System.out.println("Used capacity: "+L.getUsedCapacity());
		
		} else if(P instanceof SmartTV){
			SmartTV S=(SmartTV)P;
			System.out.println("Name: "+S.getName());
			System.out.println("Is Connected?\n"+S.isConnected());
			System.out.println("Maxspeed: "+S.maxSpeed());
			System.out.println("Channel: "+S.getChannel());
			
		} else if(P instanceof Toaster){
			Toaster T=(Toaster)P;
			System.out.println("Name: "+T.getName());
			System.out.println("I "+T.prepareFood());
		}
	}
	
	public void testDataStorage(DataStorage DS)
	{
		Laptop L=(Laptop)DS;
		System.out.println("Name: "+L.getName());
		System.out.println("Freecapacity: "+L.getFreeCapacity());
		System.out.println("Maxspeed: "+L.maxSpeed());
		System.out.println("Is connected?\n"+L.isConnected());
		System.out.println("Total capacity: "+L.getTotalCapacity());
		System.out.println("Used capacity: "+L.getUsedCapacity());
	}
	
	public void testNetworked(Networked N)
	{
		if(N instanceof Laptop){
			Laptop L=(Laptop)N;
			System.out.println("Name: "+L.getName());
			System.out.println("Freecapacity: "+L.getFreeCapacity());
			System.out.println("Maxspeed: "+L.maxSpeed());
			System.out.println("Is connected?\n"+L.isConnected());
			System.out.println("Total capacity: "+L.getTotalCapacity());
			System.out.println("Used capacity: "+L.getUsedCapacity());
		
		} else if(N instanceof SmartTV){
			SmartTV S=(SmartTV)N;
			System.out.println("Name: "+S.getName());
			System.out.println("Is Connected?\n"+S.isConnected());
			System.out.println("Maxspeed: "+S.maxSpeed());
			System.out.println("Channel: "+S.getChannel());
			
		}
	}
	
	public void testCooker(Cooker C)
	{
		Toaster T=(Toaster)C;
		System.out.println("Name: "+T.getName());
		System.out.println("I "+T.prepareFood());
	}
	
	
	public static void main(String[] args) {
		Laptop p1=new Laptop();
		SmartTV p2=new SmartTV();
		Toaster p3=new Toaster();
		
		ProductTest test=new ProductTest();
		test.testProduct(p1);
		System.out.println();
		test.testCooker(p3);
		System.out.println();
		test.testDataStorage(p1);
		System.out.println();
		test.testNetworked(p2);
	}
	
	
}
