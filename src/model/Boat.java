package model;

public class Boat {
	
	public enum BoatType {
		Canoe,
		Motorsailer,
		Sailboat,
		Other
	}

	private String name;
	private BoatType type;
	private int length; 
	/*
	 * A boat is measured from tip of the bow to the center of the stern
	 * (from tip to tail)
	*/

	//constructor to create a boat
	public Boat(String boatName, BoatType boatType, int boatSize) {
		this.name = boatName;
		this.type = boatType;
		this.length = boatSize;
	}
	
	//constructor to get a boat
	public Boat(Boat boat) {
		this.name = boat.getName();
		this.type = boat.getType();
		this.length = boat.getLength();
	}
	
	public Boat() {}
	
	//getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BoatType getType() {
		return type;
	}

	public void setType(BoatType boatType) {	
		try {
			this.type = boatType;
			if(validateType(boatType) == false)
			{
				throw new IllegalArgumentException();
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	public int getLength() {
		return length;
	}


	public void setLength(int boatLength) throws Exception {
		
		try {
			this.length = boatLength;
			if(validateLength(boatLength) == false)
			{
				throw new Exception();
			}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}


	//data validation helper methods
	private boolean validateLength(int length) {
		if(length >= 0) {
			return true;
		}
		return false;
	}
	
	private boolean validateType(BoatType type) {
		for(BoatType validType : BoatType.values()) {
			if(validType == type) {
				return true;
			}
		}
		return false;
	}
	
	
}
