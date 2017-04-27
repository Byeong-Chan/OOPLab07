package k_package;

import byeongChan.*;
import seoHyeon.*;

public class SmartTV extends Product implements Networked{
	
	private int channel;
	
	public boolean isConnected()
	{
		return true;
	}
	
	public double maxSpeed()
	{
		return 1.1;
	}
	
	public String getName()
	{
		return this.getClass().getSimpleName();
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	
}
