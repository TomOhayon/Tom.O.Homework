package homework241018;

public class AlarmClock extends Alarm {
	// -------properties------
	private ExtendTime currentTime;
	private Alarm A[] = new Alarm[5];
	private int alarmNum;

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
		this.alarmNum = alarmNum;
		A[alarmNum]= new Alarm();
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
	
	public void alarmRing (SimpleTime S) {
		if (this.isSnooze() && S.getHour()==A[this.alarmNum].getTime().getHour() && S.getMinute()==A[this.alarmNum].getTime().getMinute() && S.getSecond()==A[this.alarmNum].getTime().getSecond()) {
			System.out.println("Ring Ring - good morning MotherFucker!!!");
		}
	}

}