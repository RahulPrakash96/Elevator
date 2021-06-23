package com.elevator; 

public class MoveElevatorCommand implements Command {
	
	int floorNo;
	Elevator elevator;
	
	MoveElevatorCommand(Elevator elevator, int floorNo)
	{
		this.elevator = elevator;
		this.floorNo = floorNo;
	}

	@Override
	public void execute() {
		
		elevator.goToFloor(floorNo);
	
	}

}
