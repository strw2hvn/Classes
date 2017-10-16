package com.zorax;

public class VipCustomers {
    private String name;
    private int creditLim;
    private String email;

    public VipCustomers() {
        //System.out.println("First constructor");
        this("Leonard",10000,"len@mail.com");
    }

    public VipCustomers(String name, String email) {
        System.out.println("Second Constructor");
        getName();
        getEmail();
        creditLim = 20000;
    }
    public VipCustomers(String name, int creditLim, String email) {
        System.out.println("Third Constructor");
        this.name = name;
        this.creditLim = creditLim;
        this.email = email;
    }

    public String getName() {
        this.name = name;
        return this.name;
    }

    public int getCreditLim() {
        this.creditLim = creditLim;
        return this.creditLim;
    }

    public String getEmail() {
        this.email = email;
        return this.email;
    }
}
