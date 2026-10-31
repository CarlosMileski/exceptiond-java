package model.entitis;

import java.util.Date;

public class reservate {
    public Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    public Date getCheckOut() {
        return checkOut;
    }


    public Date getCheckIn() {
        return checkIn;
    }


    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }



}
