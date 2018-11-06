import java.util.ArrayList;

public class Suitcase {
	//------properties------
	double weightSum;
	
	ArrayList <Items> suitcase=new ArrayList<Items>();
	//------methodes-------
	public double total() {
		for (Items items : suitcase) {
			 weightSum+=items.getWeight();
		}
	return weightSum;
	}
	
}
