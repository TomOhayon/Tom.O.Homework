package homework241018;

public class AlarmClock extends Alarm {
	// -------properties------
	private ExtendTime currentTime;
	private Alarm A[] = new Alarm[5];

	// ------constructor------
	public AlarmClock() {
		super();
		this.currentTime = new ExtendTime();
		for (Alarm alarm : A) {
			alarm = new Alarm();
		}
	}

	// ------methods------
	public void setAlarm(int alarmNum, SimpleTime time, boolean isSet, int snoozeTime, boolean isSnooze) {
		A[alarmNum].setTime(time.getHour(), time.getMinute(), time.getSecond());
		A[alarmNum].setSnoozeTime(snoozeTime);
		A[alarmNum].setSet(isSet);
		A[alarmNum].setSnooze(isSnooze);
	}

	public void setAlarm(int hour, int minute, int second) {
		for (Alarm alarm : A) {
			alarm.setTime(hour, minute, second);
		}
	}

}