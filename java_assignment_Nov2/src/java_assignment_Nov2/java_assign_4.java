package java_assignment_Nov2;

/* 4. Write a program to create a room class, 
 *    the attributes of this class is roomno, roomtype, 
 *    roomarea and ACmachine. 
 *    In this class the member functions are setdata 
 *    and displaydata. 
 */

public class java_assign_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Room obj = new Room();
		obj.setData(14,"Residential",15,false);
		obj.displayData();

	}

}

class Room {
	private int roomNum;
	private String roomType;
	private int roomArea;
	private boolean acMachine;
	
	public void setData(int roomNum, String roomType, int roomArea, 
			boolean acMachine) {
		this.roomNum = roomNum;
		this.roomType = roomType;
		this.roomArea = roomArea;
		this.acMachine = acMachine;
	}
	
	public void displayData() {
		System.out.println("Room number: " + roomNum);
		System.out.println("Room type: " + roomType);
		System.out.println("Room area (m^2): " + roomArea);
		System.out.println("AC Machine: " + acMachine);
	}
}
