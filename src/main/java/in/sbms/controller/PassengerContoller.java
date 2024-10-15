package in.sbms.controller;

import java.util.Random;
import java.util.UUID;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.sbms.binding.PassengerInfo;
import in.sbms.binding.TicketInfo;

@RestController
public class PassengerContoller {

	@PostMapping( value = "/booking/ticket" )
	public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo passInfo){
		
		System.out.println(passInfo);
		
		TicketInfo ticInfo = new TicketInfo();
		
		Random random = new Random();
		int numOfSeat = passInfo.getSeat();
		int seats = 0;
		for(int i=0; i<=numOfSeat; i++) {
			seats = 1 + random.nextInt(100);
		}
		
		ticInfo.setInr(UUID.randomUUID().toString());
		ticInfo.setCoach("First AC");
		ticInfo.setSeatNo(seats);
		ticInfo.setMsg("CONFIRM TICKET");
		
		
		return new ResponseEntity<>(ticInfo,HttpStatus.OK);
		
	}  
}
