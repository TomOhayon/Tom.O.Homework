package homework241018;

import java.util.Scanner;
import java.util.Timer;

import jdk.vm.ci.hotspot.EventProvider.TimedEvent;

public class ClockApp {

	public static void main(String[] args) {
	/*	SimpleTime s = new SimpleTime(25, 78, 98);	
		System.out.println(s.toString());
		ExtendTime e = new ExtendTime();
		System.out.println(e.toString());
		e.setTime(23, 59, 14);
		e.setIs24Hours(false);
		System.out.println(e.toString());*/
		
		Scanner scan = new Scanner(System.in);
		AlarmClock c = new AlarmClock();
		c.setTime(23, 23, 23);
		System.out.println("please enter hour in HH:MM:SS format:");
		String s=scan.next();
		String[] S=new String[3];
		S=s.split(":");
		c.setTime(S[0], S[1], S[2]);
		System.out.println(s.toString());
		
		while (c.getHour()!=-1) {
			System.out.println(c.toString());
			c.tick();
			Timer t = new Timer
		}
		
		
	}

}
