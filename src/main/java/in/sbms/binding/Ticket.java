package in.sbms.binding;

import java.util.List;

import lombok.Data;

@Data
public class Ticket {

	private String ticketId;
	private String coach;
	private int[] seatNo;
	private String msg;
	private Double ticketPrice;
	
}
