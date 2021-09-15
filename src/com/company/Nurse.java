package com.company;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Nurse extends Staff {

    private Boolean Injections;
    private String Specialism;

    public Nurse(String name, String phoneNum, String room, Boolean injections, String specialism) {
        super(name, phoneNum, room);
        this.Injections = injections;
        this.Specialism = specialism;
    }

    public void setSpecialism(String specialism) {
        Specialism = specialism;
    }

    public void setInjections(Boolean hadInjections) {
        this.Injections = hadInjections;
    }

    public Boolean getInjections() {
        return Injections;
    }
}
