 package in.sbms.controller;

import java.io.File;
import java.util.Random;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.sbms.binding.Customer;
import in.sbms.binding.Ticket;



@RestController
public class CustomerController {
	
	@PostMapping(value="/ticketBook",
				 produces="application/json",
				 consumes= "application/json")
	public ResponseEntity<Ticket> bookTicket(@RequestBody Customer customer) throws Exception{
		System.out.println(customer);
		
		Ticket ticketInfo=new Ticket();
		
		String ticketId=UUID.randomUUID().toString();
		Integer numOfSeats=customer.getNoOfSeat();
		Double tPrice=numOfSeats*120.00;
		
        Random random = new Random();
        int randomNumber = 1 ;
        int arr[] =new int[numOfSeats];
        
        for (int i = 0; i < numOfSeats; i++) {
             randomNumber = 1 + random.nextInt(100); // generates a number between 1 and 100
         //   System.out.println("Seat " + (i + 1) + ": " + randomNumber);
            arr[i]=randomNumber;
        }
        
//        for(int elem : arr) {
//        	randomNumber =1 + random.nextInt(100);
//        	arr[elem]=randomNumber;
//        }
       
     
		
		ticketInfo.setTicketId(ticketId);
		ticketInfo.setSeatNo(arr);
		ticketInfo.setCoach(customer.getCoach());
		ticketInfo.setMsg("CONFIRMED");
		ticketInfo.setTicketPrice(tPrice);
		
		ObjectMapper mapper = new ObjectMapper();

		// converting java obj to json and store into a file
		mapper.writeValue(new File("Ticket.json"), ticketInfo);
		
		System.out.println("Conversion Completed....");
		
		return new ResponseEntity<Ticket>(ticketInfo,HttpStatus.CREATED);
		
		
	}

}

