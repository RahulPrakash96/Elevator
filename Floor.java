package com.elevator;

public class Floor {
	
	private int floorNo;

	private FloorButtonPanel floorButtonPanel;
	
	Floor(int floorNo)
	{
		this.floorNo = floorNo;
		this.floorButtonPanel = new FloorButtonPanel();
	}
	
	public int getFloorNo() {
		return floorNo;
	}
	
	public void pressButton(String buttonPressed)
	{
		floorButtonPanel.performAction(floorNo, buttonPressed);
	}

}
