package com.elevator;

public class Elevator {
	
	private int id;
	
	private int currentFloor;
	
	private Door door;
	
	private Status status;
	
	private ElevatorButtonPanel buttonPannel;
	
	Elevator(int id)
	{
		this.id = id;
		this.currentFloor = 0;
		door = new Door();
		status = Status.IDLE;
		buttonPannel = new ElevatorButtonPanel(this);
	}
	
	public void pressButton(String button)
	{
		buttonPannel.performAction(id, button);
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public int getId() {
		return id;
	}
	
	public void goToFloor(int to)
	{
		//
		door.isOpen();
		door.closeDoor();
	}
	
	public void emergencyAlarm()
	{
		
	}
	
	public void stopElevator()
	{
		status = Status.IDLE;
	}
	
}
