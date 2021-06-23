package com.elevator;

import java.util.HashMap;
import java.util.Map;

public class ElevatorButtonPanel implements ButtonPanel{
	
	private Map<String,ElevatorButtons> buttons;
	
	public ElevatorButtonPanel(Elevator elevator)
	{
		buttons = new  HashMap<String,ElevatorButtons>();
		buttons.put("1", ElevatorButtons.ONE);
		buttons.put("3", ElevatorButtons.THREE);
	}
	
	public void performAction(int elevatorID, String buttonPressed)
	{
		ElevatorButtons button = buttons.get(buttonPressed);
		
		switch(button.getType())
		{
		   case 1 : Controller.getInstance().getDropRequest(elevatorID,button.getValue()); break;
		}
	}

}
