package de.hdm.wim.event.shared;
import org.apache.curator.framework.recipes.leader.Participant;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by nils on 30/05/2017.
 */
public class EventGenerator {
	private final Random random             = new Random();

	/**
	 * Instantiates a new Event generator.
	 *
	 */
	public EventGenerator() {
	}

	/**
	 * Generate event event.
	 *
	 * @return the event
	 */
    public Event GenerateEvent(){

        String data = "something";

        return new Event(getRandomEventSource() ,getRandomEventType() , data);
    }


	public String getRandomEventType(){
    	int i = random.nextInt(6);

		switch (i) {
			case 0:
				return Enums.EventType.action;
			case 1:
				return Enums.EventType.date;
			case 2:
				return Enums.EventType.feedback;
			case 3:
				return Enums.EventType.request;
			case 4:
				return Enums.EventType.time;
			case 5:
				return Enums.EventType.user;
			default:
				return "";
		}
	}


	public String getRandomEventSource(){
		int i = random.nextInt(5);

		switch (i) {
			case 0:
				return Enums.EventSource.event;
			case 1:
				return Enums.EventSource.machineLearning;
			case 2:
				return Enums.EventSource.semanticRepresentation;
			case 3:
				return Enums.EventSource.speechTokenization;
			case 4:
				return Enums.EventSource.userInterface;
			default:
				return "";
		}
	}

}
