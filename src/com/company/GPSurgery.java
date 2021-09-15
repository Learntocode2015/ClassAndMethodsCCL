package com.company;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Scanner;

public class GPSurgery {

    ArrayList<Staff> StaffList= new ArrayList();

    public void AddNewStaffMember() {
        Scanner input = new Scanner(System.in);
        System.out.println("name please");
        String name = input.nextLine();
        System.out.println("num please");
        String phoneNum = input.nextLine();
        System.out.println("room please?");
        String room = input.nextLine();
        System.out.println("injections please");
        Boolean injections = input.nextBoolean();
        System.out.println("Specialism please");
        String specialism = input.nextLine();
        Nurse NewNurseObj = new Nurse(name, phoneNum, room, injections, specialism);
        StaffList.add(NewNurseObj);
    }
}
