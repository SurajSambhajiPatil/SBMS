package in.sbms.binding;

import java.sql.Date;

import lombok.Data;

@Data
public class PassengerInfo {

	private Integer pid;
	private String pname;
	private Date toDate;
	private  String from;
	private String to;
    private int seat;
}
