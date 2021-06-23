package com.elevator;

public class Door {
	
	private boolean isOpen;
	
	Door()
	{
		isOpen = false;
	}
	
	
	public void openDoor()
	{
		isOpen = true;	
	}
	
	public void closeDoor()
	{
		isOpen = false;
	}

	public boolean isOpen() {
		return isOpen;
	}
	

}
