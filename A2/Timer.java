//package A2;
/*
# Name:Keith Gompf
# Date:11/19/23
# Description:Timer class which counts down 0 then activates the alarm
 */
public class Timer extends Notifier{
	//subclasses Notifier
	private static int timerPeriod;//time in seconds timer should be set for

	//The activate method should activate the timing process and call the IListener notify method when the timer goes off.
	//The string “wake up!” should be hard-coded in the Timer.activate method.
    public void activate() {
        String message = "wake up!";
        System.out.println("Activating Timer...");
        while (timerPeriod > 0) {
            try {
                Thread.sleep(timerPeriod * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // Decrement the timerPeriod
            timerPeriod--;
        }
        this.notifyListeners(message);
 
        
    }

	//The method should use the parameter to set the timerPeriod field
	public void setTimePeriod(int period) {
		timerPeriod = period;
	}

}
