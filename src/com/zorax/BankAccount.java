package com.zorax;

public class BankAccount {
    private int accNumber;
    private double accBalance;
    private String custName;
    private String email;
    private String phoneNumber;

    //--------------------------------------------

    public BankAccount() {
        this("Name",0000000,"email@mail.com","1234567890");
    }

    public BankAccount(String custName, int accNumber, String email, String phoneNumber){
        setCustName(custName);
        setAccNumber(accNumber);
        setEmail(email);
        setPhoneNumber(phoneNumber);
    }
    //--------------------------------------------
    public void setAccNumber(int accNumber){
        this.accNumber = accNumber;
    }
    public int getAccNumber(){
        return accNumber;
    }
    //--------------------------------------------
    public void setAccBalance(double accBalance){
        this.accBalance = accBalance;
    }
    public double getAccBalance(){
        return accBalance;
    }
    //--------------------------------------------
    public void setCustName(String custName){
        this.custName = custName;
    }
    public String getCustName(){
        return custName;
    }
    //--------------------------------------------
    public void setEmail(String email){
        if (email.contains("@") && email.contains(".com")) {
            this.email = email;
        }else{
            System.out.println(email +" is not valid email entry.");
        }
    }
    public String getEmail(){
        return email;
    }
    //--------------------------------------------
    public void setPhoneNumber(String phoneNumber){
        if (phoneNumber.length() == 10) {
            this.phoneNumber = phoneNumber;
        }else{
            System.out.println(phoneNumber +" is not valid phone entry.");
        }
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    //--------------------------------------------
    public boolean depositFunds (double dpstAmount){
        if (dpstAmount <= 0){
            System.out.println("Amount equal or less than 0 cannot be accepted.");
            return false;
        }else{
            accBalance += dpstAmount;
            System.out.println("Deposited: " + dpstAmount + " Your Acount Balance Now: " + accBalance);
        }
        return true;
    }
    //--------------------------------------------
    public boolean wthdrwFunds (double wthdrAmount){
        if (wthdrAmount > accBalance) {
            System.out.println("Amount you are about to withdraw is larger than your account balance!!!");
            return false;
        }else if (wthdrAmount == accBalance){
            System.out.println("You are about to empty your account now.");
            accBalance -= wthdrAmount; return true;
        }else if(wthdrAmount < accBalance){
            accBalance -=wthdrAmount;
            System.out.println("Withdrawing amount: " + wthdrAmount + " Your Acount Balance Now: " + accBalance);
        }
        return true;
    }
    public void run(){
        System.out.println("Your name is: " + custName);
        System.out.println("Your account balance is: " + accBalance);
        System.out.println("Your account number is: " + accNumber);
        System.out.println("Your email is: " + email);
        System.out.println("Your phone is: " + phoneNumber);
    }
}


