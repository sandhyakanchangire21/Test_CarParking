package org.pages;

public class ParkingLot {
	//webElements
	//constructor - to initialize the webelement

	//Action
	int total_carslot = 50 ;

	int total_bikeslot = 100 ;

	public int remain_carslot(int input)

	{

		int remain_cslot = total_carslot-input ;
		if (remain_cslot>0) {
			System.out.println("ticket id is 123");
		}else
			System.out.println("ticket is not availble");	
		return remain_cslot ;

	}


}
