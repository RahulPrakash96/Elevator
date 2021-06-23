package com.elevator;

import java.util.Map;

public class Controller {
	
	static Controller controller;
	
	public static Controller getInstance()
	{
		if(controller == null)
			controller = new Controller();
		
		return controller;
	}
	
	private Map<Integer,Elevator> elevators;
	
	private Map<Integer,Floor> floors;
	
	public Command getPickUpRequest(int floorID, Directions direction)
	{
		// Choose appropriate elevator from all elevators based on request
		
		Elevator elevator  = null;
		
		return new MoveElevatorCommand(elevator,floorID);
		
	}
	
	public Command getDropRequest(int elevatorID , int to)
	{
		return new MoveElevatorCommand(elevators.get(elevatorID),to);
	}
	

}
