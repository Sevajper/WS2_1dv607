package model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Member")
@XmlType(propOrder = {"name", "persNum", "id", "numOfBoats", "boats", "boat"})
@XmlAccessorType(XmlAccessType.FIELD)

public class Member {
	
	@XmlElement(name = "Name")
	private String name;
	@XmlElement(name = "PersonalNumber")
	private String persNum;
	@XmlElement(name = "IdentityNumber")
	private String id;
	@XmlElement(name = "NumberofBoats")
	private int numOfBoats;
	@XmlElement(name = "BoatInfo")
	private ArrayList<Boat> boats = new ArrayList<Boat>();
	@XmlElement(name = "boat")
	private Boat boat = new Boat();
	
	public Member() {
		
	}
	
	public Member(String memberName, String memberPersNum) {
		this.name = memberName;
		this.persNum = memberPersNum;
	}
	/*
	 * Member ID is a unique number starting from 0,
	 * that increases by 1 after each member registration, 
	 * plus the first letter of the name,
	 * plus the last three numbers of their personal number.
	 */
	public String createID() {
		
		id = getName().substring(0, 1).toUpperCase() 
			 + getPersNum().substring(8, 11); //Needs a dash when making the personal number
		return id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPersNum() {
		return persNum;
	}

	public void setPersNum(String persNum) {
		this.persNum = persNum;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getNumOfBoats() {
		return numOfBoats;
	}

	public void setNumOfBoats(int numOfBoats) {
		this.numOfBoats = numOfBoats;
	}
	
	public Boat getBoat() {
		return boat;
	}

	public void setBoat(Boat boat) {
		this.boat = boat;
	}
	public ArrayList<Boat> getBoats() {
		return boats;
	}
	public void setBoats(Boat boat) {
		boats.add(boat);
	}
}
