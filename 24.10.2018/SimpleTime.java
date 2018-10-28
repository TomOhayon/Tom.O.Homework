package homework241018;

public class SimpleTime {
	//-------properties------
	protected int hour;
	protected int minute;
	protected  int second;

	//------getters+setters------
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	public void setHour(int hour) {
		this.hour = hour>23?hour%23-hour/23:hour;
	}
	public void setMinute(int minute) {
		this.minute =minute>59? minute%59-minute/59:minute;
	}
	public void setSecond(int second) {
		this.second = second>59?second%59-second/59:second;
	}
	//------constructor------
	public SimpleTime() {
		super();
		this.hour = 0;
		this.minute = 0;
		this.second = 0;	
	}
	public SimpleTime(int hour, int minute, int second) {
		super();
		this.hour = hour>23?hour%23-hour/23:hour;
		this.minute = minute>59? minute%59-minute/59:minute;
		this.second = second>59?second%59-second/59:second;
	}
	//------methods------
	public void setTime(int hour, int minute, int second) {
		this.setHour(hour);
		this.setMinute(minute);
		this.setSecond(second);
	}
	
	public void addHour(int hour) {
		this.hour=hour>23?hour%23-hour/23:hour;
	}

	public void addMinute(int minute) {
		this.minute=minute>59? minute%59-minute/59:minute;
	}

	public void addSecond(int second) {
		this.second= second>59?second%59-second/59:second;
	}
	
	public void tick() {
		this.addSecond(this.second+1);
		if (this.getSecond()==0) {
			this.addMinute(this.minute+1);
			if (this.getMinute()==0) {
				this.addHour(this.hour+1);
			}
		}
	
	}
	
	public boolean equals(SimpleTime S) {
		return this.toString()==S.toString();
	}
	
	public String toString() {
		return this.getHour()+":"+this.getMinute()+":"+this.getSecond();
	}
}
