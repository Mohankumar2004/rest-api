package com.example.TicketBooking;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketBookingController {
	
	@Autowired
	TicketBookingRepository tbr;
	
	@GetMapping("/getbookingdetails")
	public List<Booking> getDetails()
	{
		System.out.println("Data are Displayed");
		return tbr.findAll();
	}
	
	@GetMapping("/getbookingdetailsbyid/{id}")
	public Optional<Booking> getDetailsByid(@PathVariable("id") int id)
	{
		System.out.println("Data's are received by Id");
		return tbr.findById(id);
	}
	
	@PostMapping("/postbookingdetails")
	public String postDetails(@RequestBody Booking b1)
	{
		tbr.save(b1);
		return "Details are Successfully saved"
				+ " in the DB";
	}
	
	@PutMapping("/putbookingdetails/{id}")
	public Booking updateDetails(@RequestBody Booking b2)
	{
		System.out.println("Details are Updated");
		return tbr.save(b2);
	}
	
	@DeleteMapping("/deletebookingdetails/{id}")
	public String deleteDetails(@PathVariable("id") int id)
	{
		tbr.deleteById(id);
		return "ID " + id+" is deleted....";
	}
}
