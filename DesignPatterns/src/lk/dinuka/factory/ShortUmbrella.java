package lk.dinuka.factory;

public class ShortUmbrella implements Umbrella{

	String color;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return "short";
	}
	
}
