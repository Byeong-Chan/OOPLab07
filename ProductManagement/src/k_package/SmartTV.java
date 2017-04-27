package k_package;

import byeongChan.Product;

public class SmartTV extends Product{
	
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
		return "LGTV";
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	
}
