package view;

import java.util.ArrayList;

import model.Boat;
import model.Member;
import model.Registry;

public class Console {				//Print out methods
									
	public void displayWelcome() {
		System.out.println("----------------------------------------");
		System.out.println(" Hello! Welcome to the Member Registry!");
		System.out.println("---------------------------------------- ");
		System.out.print("1.  Register a new member" 
				+ "\n2.  Update an existing member" 
				+ "\n3.  Remove a member"
				+ "\n4.  Register a boat" 
				+ "\n5.  Update boat" 
				+ "\n6.  Remove a boat"
				+ "\n7.  Display specific member" 
				+ "\n8.  Display verbose list" 
				+ "\n9.  Display compact list"
				+ "\n10. Exit without saving" 
				+ "\n0.  Save and Exit" + "\n" 
				+ "\n100. Display Member Registry Menu"
				+ "\n\nChoose from menu by typing a number: ");
	}

	public void inputError() {	
		System.out.println("\n\t\t*** Wrong input, please choose a number between 0-10 or 100 to display menu ***");
	}

	public void memberAdded() {
		System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
						 + "\nx Member successfully added to member registry! x"
						 + "\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
	}

	public void memberUpdated() {
		System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" 
						 + "\nx Member successfully updated! x"
						 + "\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
	}

	public void memberRemoved() {
		System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" 
				         + "\nx Member successfully removed :( x"
				         + "\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
	}

	public void boatAdded() {
		System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" 
				         + "\nx Boat successfully registered! x"
				         + "\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
	}
	
	public void boatUpdated() {
		System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
				         + "\nx Boat successfully updated! x"
				         + "\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
	}
	
	public void boatRemoved() {
		System.out.println("\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"
				         + "\nx Boat successfully removed! x"
				         + "\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
	}
	
	public void persNumErr() {
		System.out.println("\n\t\t*** Incorrect personal number form, try again! ***");
	}
	
	public void goBackError() {
		System.out.print("\n----------------------------"
				       + "\nType \"100\" to display menu! "
				       + "\nChoose from menu by typing a number: ");
	}
	
	public String printMemberArray(Registry memberList) {
		StringBuilder list = new StringBuilder();
		for(int i=0; i < memberList.getRegistry().size(); i++) {
			list.append("\nMember: "  + memberList.getRegistry().get(i).getName() + " "
	                + "\nMember ID: " + memberList.getRegistry().get(i).getId()
	                + " " + "\nPersonal Number: " + memberList.getRegistry().get(i).getPersNum()
	                + " " + "\nNumber of Boats: " + memberList.getRegistry().get(i).getNumOfBoats()
	                +"\n" + "----------------------------");
		}	
		return list.toString();
	}
	
	public String printBoatArray(ArrayList<Boat> boatList) {
		StringBuilder list = new StringBuilder();
		for(int i=0; i < boatList.size(); i++) {
			list.append("\nName: " + boatList.get(i).getName()
					+ "\nBoat type: " + boatList.get(i).getType()
					+ "\nBoat length (meters): " + boatList.get(i).getLength()
	                +"\n" + "----------------------------");
		}	
		return list.toString();
	}
	
	public String printMember(Member member) {
		StringBuilder list = new StringBuilder();
		list.append("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@"
				+"\nMember: "  + member.getName() + " "
				+ "\nMember ID: " + member.getId()
	            + " " + "\nPersonal Number: " + member.getPersNum()
	            + " " + "\nNumber of Boats: " + member.getNumOfBoats()
	            + "\n" + "----------------------------");	
		return list.toString();
	}
}
