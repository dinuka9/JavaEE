package lk.dinuka.factory;

public class UmbrellaFactory {

	public Umbrella createUmbrella(String size) {
		
		if(size.equals("long")){
			return new ShortUmbrella();
		}else if(size.equals("short")){
			return new LongUmbrella();
		}else{
			return null;
		}
		
	}
	
}
