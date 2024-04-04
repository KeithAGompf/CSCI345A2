//package A2;
/*
# Name:Keith Gompf
# Date:11/19/23
# Description:Holds a list of the people(listners) who have set alarms and then calls notify in the Listener class
 */
import java.util.ArrayList;
import java.util.List;

public class Notifier 
{
	private List<IListener> listeners = new ArrayList<IListener>();
	//adds a lsitener to the Arraylist
	public void registerListener(IListener listener)
	{
		listeners.add(listener);
	}
	//iterates through listeners and notifies them
	public void notifyListeners(String message) {
	    for (IListener listener : listeners) {
	        listener.notify(message);
	    }
	}

}
