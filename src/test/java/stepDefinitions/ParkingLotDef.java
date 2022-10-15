package stepDefinitions;

import org.pages.ParkingLot;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParkingLotDef {
	ParkingLot obj= new ParkingLot();
	@Given("A person in a {int} enters the parking lot")
	public void a_person_in_a_enters_the_parking_lot(Integer int1) {
		obj.remain_carslot(1);
		
	}

	@When("A person ask for parking ticket in {int}-wheeler")
	public void a_person_ask_for_parking_ticket_in_wheeler(Integer int1) {
		  System.out.println("asking for ticket");
	}

	@Then("The Ticket ID is given to the person")
	public void the_ticket_id_is_given_to_the_person() {
		  System.out.println("ticket id is 123");
	}

	@And("The parking lot has <{int}> {int}-wheeler parkings spots remaining and <{int}> {int}-wheeler parking spots remaining")
	public void the_parking_lot_has_wheeler_parkings_spots_remaining_and_wheeler_parking_spots_remaining(Integer int1, Integer int2, Integer int3, Integer int4) {
		  System.out.println("reamins 49 lot for 4-wheeler and 100 for 2-wheeler");
	}

}
