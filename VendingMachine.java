package com.company;

public class VendingMachine {
    private int MachineStatus = 1;
    private double TotalMoney = 50;
    private double UserInputMoney = 0;
    private double Change;

    public int getMachineStatus() {
        return MachineStatus;
    }

    public void setMachineStatus(int Status) {

        if(Status != 0 && Status != 1 && Status != 2 ){
            System.out.println("ERROR: Machine status not recognized");
        }
        else{
            this.MachineStatus = Status;
        }
    }

    public double getTotalMoney() {
        return TotalMoney;
    }

    public void addMoney(double money){
        this.TotalMoney = this.TotalMoney + money;
    }

    public double getUserInputMoney() {
        return UserInputMoney;
    }

    public void addUserInputMoney(double money){
        this.UserInputMoney +=  money;
    }

    public void resetUserCoins(){
        System.out.println("RETURNED - " + this.UserInputMoney + "€");
        this.UserInputMoney = 0.0;
    }

public double change(double price){
        this.Change = this.UserInputMoney - price;
        this.TotalMoney = this.TotalMoney + this.UserInputMoney;
    this.TotalMoney = this.TotalMoney - this.Change;
    this.UserInputMoney = 0;
    System.out.println(this.Change + "€ OF CHANGE" );

    return this.Change;
}
}
