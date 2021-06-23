package com.elevator;

public enum FloorButtons {
	
	UP(Directions.GOING_UP),
	DOWN(Directions.GOING_DOWN);
	
	private Directions direction;
	
	FloorButtons(Directions direction)
	{
		this.direction = direction;
	}

	public Directions getDirection() {
		return direction;
	}
	

}
