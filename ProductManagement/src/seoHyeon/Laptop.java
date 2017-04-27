package seoHyeon;

import byeongChan.*;
import k_package.*;

public class Laptop extends Product implements Networked,DataStorage{
	private double totalCapacity;
	private double usedCapacity;
	public Laptop(double tc, double uC){
		totalCapacity=tc;
		usedCapacity=uC;
	}
	
	public double getFreeCapacity(){
		return 1.0;
	}
	
	public void format(){
		
	}
	
	public boolean isConnected(){
		return true;
	}
	
	public double maxSpeed(){
		return 1.0;
	}
	
	public double getTotalCapacity(){
		return totalCapacity;
	}
	
	public void setTotalCapacity(double tC){
		totalCapacity=tC;
	}
	public double getUsedCapacity(){
		return usedCapacity;
	}
	
	public void setusedCapacity(double uC){
		usedCapacity=uC;
	}
	
	public String getName(){
		return this.getClass().getSimpleName();
	}
	public static void main(String[] args){
		Laptop l=new Laptop(2.1,4);
		System.out.println(l.getName());
	}
}
