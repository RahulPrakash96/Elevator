package com.elevator;

public class DropRequest implements Command {

	private Elevator elevator;
	private int to;
	
	DropRequest(Elevator elevator,int to)
	{
		this.elevator = elevator;
		this.to = to;
	}

	@Override
	public void execute() {
		
		elevator.goToFloor(to);
		
	}

}
