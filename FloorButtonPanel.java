package com.elevator;

import java.util.HashMap;
import java.util.Map;

public class FloorButtonPanel implements ButtonPanel {

	
	private Map<String,FloorButtons> buttons;
	
	FloorButtonPanel()
	{
		buttons = new HashMap<>();
		
		buttons.put("UP", FloorButtons.UP);
		buttons.put("DOWN",FloorButtons.DOWN);
		
		
	}
	

	@Override
	public void performAction(int floorID, String buttonPressed) {
		// TODO Auto-generated method stub
		
		FloorButtons button = buttons.get(buttonPressed);
		Controller.getInstance().getPickUpRequest(floorID,button.getDirection());
		
	}

}
