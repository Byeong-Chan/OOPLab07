package byeongChan;

public class Toaster extends Product {
	
	public String prepareFood() {
		return "will make food.";
	}
	
	@Override
	public String getName() {
		return "Toaster";
	}

}
