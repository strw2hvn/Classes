package com.zorax;

public class Vihicle {
   private String drivenBy;
   private String typeOfUse;

    public Vihicle() {
    }

    public Vihicle(String drivenBy, String typeOfUse) {
        this.drivenBy = drivenBy;
        this.typeOfUse = typeOfUse;
    }

    public String getDrivenBy() {
        //System.out.println("getDrivenBy = " + drivenBy);
        return drivenBy;
    }

    public String getTypeOfUse() {
        //System.out.println("getTypeOfUse = " + typeOfUse);
        return typeOfUse;
    }

    public void setDrivenBy(String drivenBy) {

        this.drivenBy = drivenBy;
    }

    public void setTypeOfUse(String typeOfUse) {
        this.typeOfUse = typeOfUse;
    }

    public void getVihicleInfo(){
        System.out.println("Vihicle.VihicleInfo() - Invoked");
        System.out.println("Type of Use: " +getTypeOfUse());
        System.out.println("Driven By: " +getDrivenBy());
    }
}
