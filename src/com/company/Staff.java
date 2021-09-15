package com.company;

public class Staff {
    private String Name;
    private String PhoneNum;
    private String Room;

    public Staff(String name, String phoneNum, String room) {
        Name = name;
        PhoneNum = phoneNum;
        Room = room;
    }

    public void setRoom(String room) {
        this.Room = room;
    }

    public String getRoom() {
        return Room;
    }
}

