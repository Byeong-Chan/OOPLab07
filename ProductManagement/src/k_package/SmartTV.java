package k_package;

public class SmartTV {
	
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
