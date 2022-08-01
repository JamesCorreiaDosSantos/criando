package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import exception.Minha2;

public class Reservation {
	
	private Integer roomNumber;
	private Date checkin;
	private Date checkout;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	public Reservation() {
		
	}

	public Reservation(Integer roomNumber, Date checkin, Date checkout) throws Minha2 {
Date hoje = new Date();
    	
    	if(checkin.after(checkout) || checkout.before(checkin)) {
    		throw new Minha2("data de entrada nao pode ser depois da saida");
    	}
    	
    	if(!checkin.after(hoje)) {
    		throw new Minha2("Data de entrada nao pode ser inferior a hoje");
    	}
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
	}
	
	public long duration() {
		long duration = checkout.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(duration, TimeUnit.MILLISECONDS);
	}
     
    public void updateDate(Date checkin, Date checkout) throws Minha2 {
    	
    	Date hoje = new Date();
    	
    	if(checkin.after(checkout) || checkout.before(checkin)) {
    		throw new Minha2("data de entrada nao pode ser depois da saida");
    	}
    	
    	if(!checkin.after(hoje)) {
    		throw new Minha2("Data de entrada nao pode ser inferior a hoje");
    	}
    	
    	this.checkout = checkout;
    	this.checkin = checkin;
    	
    }
	
    public String toString() {
    	return "reservation: Room " + roomNumber + ", check-in: " + sdf.format(checkin) + ", checkou: " + sdf.format(checkout) + ", " + duration() + "nights";
    }
    
	
}