package homework241018;

public class Alarm extends ExtendTime {
	// -------properties------
	private SimpleTime time;
	private boolean isSet;
	private int snoozeTime;
	private boolean isSnooze;

	// ------getters+setters------
	public SimpleTime getTime() {
		return time;
	}

	public boolean isSet() {
		return isSet;
	}

	public int getSnoozeTime() {
		return snoozeTime;
	}

	public boolean isSnooze() {
		return isSnooze;
	}

	public void setTime(SimpleTime time) {
		this.time = time;
	}

	public void setSet(boolean isSet) {
		if (this.time != null) {
			this.isSet = true;
		}
	}

	public void setSnoozeTime(int snoozeTime) {
		this.snoozeTime = snoozeTime;
	}

	public void setSnooze(boolean isSnooze) {
		this.isSnooze = isSnooze;
	}

	// ------constructor------
	public Alarm() {
		super();
		this.time = new SimpleTime();
		this.isSet = false;
		this.snoozeTime = 0;
		this.isSnooze = false;
	}

	public Alarm(SimpleTime time, boolean isSet, int snoozeTime, boolean isSnooze) {
		super();
		this.time = new SimpleTime(time.getHour(), time.getMinute(), time.getSecond());
		this.isSet = isSet;
		this.snoozeTime = snoozeTime;
		this.isSnooze = isSnooze;
	}

}
