package homework241018;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import homework020918.Date;
import jdk.vm.ci.hotspot.EventProvider.TimedEvent;

public class ClockApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		AlarmClock c = new AlarmClock();
		System.out.println("please enter hour in HH:MM:SS format:");
		String s = scan.next();
		String[] S = new String[3];
		S = s.split(":");
		c.setTime(Integer.parseInt(S[0]), Integer.parseInt(S[1]), Integer.parseInt(S[2]));
		SimpleTime alarmTime = new SimpleTime();
		System.out.println("please enter the alarm hour, also in HH:MM:SS format:");
		String a = scan.next();
		String[] A = new String[3];
		A = a.split(":");
		alarmTime.setTime(Integer.parseInt(A[0]), Integer.parseInt(A[1]), Integer.parseInt(A[2]));
		//if u want to check 12 hour format then validate the following line of code:
		// c.setIs24Hours(false);
		c.setAlarm(1 , alarmTime , true, 0, true);
		Date timeToRun = new Date();
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				System.out.println(c.toString());
				c.alarmRing(alarmTime);
				c.tick();
			}
		},1000, 1000);
	}
}
