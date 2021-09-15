package com.company;

public class Main {

    public static void main(String[] args) {
        Nurse newNurse1 = new Nurse("Nina", "02", "E02", true, "Resus" );
        //GPSurgery NewGpSurgery = new GPSurgery();
        //NewGpSurgery.AddNewStaffMember();
        newNurse1.setSpecialism("elderlyCare");
        newNurse1.setInjections(false);
        System.out.println(newNurse1.getInjections());



    }


}
