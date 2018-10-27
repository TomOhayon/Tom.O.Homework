package homework241018;

public class ExtendTime extends SimpleTime {
	//-------properties------
	private boolean is24Hours;
	
	//------getters+setters------
	public boolean isIs24Hours() {
		return is24Hours;
	}

	public void setIs24Hours(boolean is24Hours) {
		this.is24Hours = is24Hours;
		setHour(is24Hours?hour:hour>12?hour-12:hour);
	}
	//------constructor------

	public ExtendTime() {
		super();
		this.is24Hours = true;
	}

	public ExtendTime(int hour, int minute, int second, boolean is24Hours) {
		super(is24Hours?hour:hour>12?hour-12:hour, minute, second);
		this.is24Hours = is24Hours;
	}

	//------methods------
	public String toString() {
		return this.getHour()+":"+this.getMinute()+":"+this.getSecond();
	}
}
