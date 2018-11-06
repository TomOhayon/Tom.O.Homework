package HOMEWORK;

public class Passenger {
	//------properties------
	private  double  ticketPrice;
	private  double allowedWeight;
	private  double extraCharge;
	private Suitcase suitcase;
	//------get+set------
	public double getTicketPrice() {
		return ticketPrice;
	}
	public double getAllowedWeight() {
		return allowedWeight;
	}
	public double getExtraCharge() {
		return extraCharge;
	}
	public Suitcase getSuitcase() {
		return suitcase;
	}
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public void setAllowedWeight(double allowedWeight) {
		this.allowedWeight = allowedWeight;
	}
	public void setExtraCharge(double extraCharge) {
		this.extraCharge = extraCharge;
	}
	public void setSuitcase(Suitcase suitcase) {
		this.suitcase = suitcase;
	}
	//------cotr------
	public Passenger(double ticketPrice, double allowedWeight, double extraCharge, Suitcase suitcase) {
		super();
		this.ticketPrice = ticketPrice;
		this.allowedWeight = allowedWeight;
		this.extraCharge = extraCharge;
		this.suitcase = suitcase;
	}
	//------methodes------
	
	public String toString(){
		return "ticket price:"+this.getTicketPrice()+"\nallowed weight:"+getAllowedWeight()+"\ncharge for every extra gr:"+getExtraCharge()+"\nsuitcase containes:";
	}
}
