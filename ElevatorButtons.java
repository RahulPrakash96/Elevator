package com.elevator;


public enum ElevatorButtons {
	ONE(1,1), 
	TWO(1,1),
	THREE(1,3),
	CREATEALARM(2,0);
	
	private int type;
	private int value;

	
	private ElevatorButtons(int type,int value)
	{
		this.type = type;
		this.value = value;
	}


	public int getType() {
		return type;
	}


	public int getValue() {
		return value;
	}
	
}
