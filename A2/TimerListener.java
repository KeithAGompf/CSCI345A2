//package A2;
/*
# Name:Keith Gompf
# Date:11/19/23
# Description: Will print out the name and the hard coded "Wake up!"
 */
public class TimerListener implements IListener
{
	private String name;
	
	//the notify method should simply output a message to the console that outputs the value in the name field and a message.
	public void notify(String message) {
		System.out.println(name + ": "+ message + "\n");
	}
	
	//represents the TimerListener’s name. 
	public TimerListener(String name) {
		this.name = name;
	}
}
