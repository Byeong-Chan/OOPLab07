package seoHyeon;

import byeongChan.*;
import k_package.*;

public class Laptop extends Product implements Networked,DataStorage{
	private double totalCapacity;
	private double usedCapacity;
	
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
}
