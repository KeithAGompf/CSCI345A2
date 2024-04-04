//package A2;

/*
# Name:Keith Gompf
# Date:11/19/23
# Description: Alarmclock object which directly calls timer class which sets time and activates the alarm
 */
public class AlarmClock {
	
	private Timer timer;
	
	//constructor
	public AlarmClock(Timer timer) {
		this.timer = timer;
	}
	
	//The AlarmClock.setAlarm method should call the Timer.setTimePeriod and the Timer.activate method
	public void setAlarm(int period) {
		timer.setTimePeriod(period);
		timer.activate();
		
	}

}
