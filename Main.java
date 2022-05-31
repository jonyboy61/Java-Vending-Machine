package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        VendingMachine VendingMachine1 = new VendingMachine();

                         //product(name, price, quantity)
        Product Lays = new Product("Lays", 1, 15);
        Product Snickers = new Product("Snickers", 1, 20);
        Product Cake = new Product("Cake", 0.6, 5);
        Product Coke = new Product("Coke", 1, 10);
        Product Pepsi = new Product("Pepsi", 1, 13);
        Product Sprite = new Product("Sprite", 1, 14);
        Product IcedTea = new Product("IcedTea", 1, 1);

        boolean loop = true;

while(loop == true) {

    System.out.println("1 - Admin");
    System.out.println("2 - User");
    System.out.println("0 - End");
    choice = scanner.nextLine();


    switch (choice) {

        case "1":
            new Menu().admin();
            choice = scanner.nextLine();



            switch (choice) {
                case "1":
                    System.out.println(Lays.getItemName() + " - Price: " + Lays.getItemPrice() +"€ " + "quantity " + Lays.getItemQuantity());
                    System.out.println(Snickers.getItemName() + " - Price: " + Snickers.getItemPrice() +"€ " + "quantity " + Snickers.getItemQuantity());
                    System.out.println(Cake.getItemName() + " - Price: " + Cake.getItemPrice() +"€ " + "quantity " + Cake.getItemQuantity());
                    System.out.println(Coke.getItemName() + " - Price: " + Coke.getItemPrice() +"€ " + "quantity " + Coke.getItemQuantity());
                    System.out.println(Pepsi.getItemName() + " - Price: " + Pepsi.getItemPrice() +"€ " + "quantity " + Pepsi.getItemQuantity());
                    System.out.println(Sprite.getItemName() + " - Price: " + Sprite.getItemPrice() +"€ " + "quantity " + Sprite.getItemQuantity());
                    System.out.println(IcedTea.getItemName() + " - Price: " + IcedTea.getItemPrice() +"€ " + "quantity " + IcedTea.getItemQuantity());
                    break;

                case "2":
                    System.out.println(VendingMachine1.getTotalMoney() + "€ PRESS ENTER TO CONTINUE");
                    break;
                case "3":
                    System.out.println("INSERT AMOUNT");
                    choice = scanner.nextLine();
                    double value=Double.parseDouble(choice);
                    VendingMachine1.addMoney(value);

                    break;
                case "4":
                    if(VendingMachine1.getMachineStatus() == 0){
                        System.out.println("0 - OFF");
                }
                    if(VendingMachine1.getMachineStatus() == 1){
                        System.out.println("1 - ON");
                    }
                    if(VendingMachine1.getMachineStatus() == 2){
                        System.out.println("2 - BROKEN");
                    }
                    break;
                case "5":
                    System.out.println("0 - OFF");
                    System.out.println("1 - ON");
                    System.out.println("2 - BROKEN");
                    System.out.println("What's the machine Status?");
                    choice = scanner.nextLine();
                    int num = Integer.parseInt(choice);
                    VendingMachine1.setMachineStatus(num);
                    break;
                case "0":
                    break;



            }
            System.out.println("PRESS ENTER TO CONTINUE");
            choice = scanner.nextLine();
            break;






        case "2":
            new Menu().user();
            choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    int num = Integer.parseInt(choice);
                    System.out.println("VALID COINS: 2€, 1€, 0.50€, 0.20€, 0.10€, 0.05€");
                    System.out.println("PRESS 0 TO FINISH");
                    while(num != 0){
                        choice = scanner.nextLine();
                        double money = Double.parseDouble(choice);

                        if (money == 0){
                            num = Integer.parseInt(choice);
                            break;
                        }

                        if(money != 2 && money != 1 && money != 0.5 && money != 0.2 && money != 0.1 && money != 0.05 ){
                            System.out.println("INVALID COIN");
                        }
                        else {

                                VendingMachine1.addUserInputMoney(money);
                                System.out.println(VendingMachine1.getUserInputMoney());
                        }
                    }
                    break;
                case "2":
                    VendingMachine1.resetUserCoins();
                    break;

                case "3":
                    System.out.println("1 - " + Lays.getItemName() + " - Price: " + Lays.getItemPrice() +"€ " + "quantity " + Lays.getItemQuantity());
                    System.out.println("2 - " + Snickers.getItemName() + " - Price: " + Snickers.getItemPrice() +"€ " + "quantity " + Snickers.getItemQuantity());
                    System.out.println("3 - " + Cake.getItemName() + " - Price: " + Cake.getItemPrice() +"€ " + "quantity " + Cake.getItemQuantity());
                    System.out.println("4 - " + Coke.getItemName() + " - Price: " + Coke.getItemPrice() +"€ " + "quantity " + Coke.getItemQuantity());
                    System.out.println("5 - " + Pepsi.getItemName() + " - Price: " + Pepsi.getItemPrice() +"€ " + "quantity " + Pepsi.getItemQuantity());
                    System.out.println("6 - " + Sprite.getItemName() + " - Price: " + Sprite.getItemPrice() +"€ " + "quantity " + Sprite.getItemQuantity());
                    System.out.println("7 - " + IcedTea.getItemName() + " - Price: " + IcedTea.getItemPrice() +"€ " + "quantity " + IcedTea.getItemQuantity());
                    System.out.println("CHOOSE YOUR ITEM - ");
                    choice = scanner.nextLine();
                    switch (choice) {

                        case "1":
                            if(VendingMachine1.getUserInputMoney() >= Lays.getItemPrice()){
                                Lays.sellItem();
                                VendingMachine1.change(Lays.getItemPrice());
                            }
                            else{
                                System.out.println("NOT ENOUGH COINS");
                            }
                            break;
                        case "2":
                            if(VendingMachine1.getUserInputMoney() >= Snickers.getItemPrice()){
                                Snickers.sellItem();
                                VendingMachine1.change(Snickers.getItemPrice());
                            }
                            else{
                                System.out.println("NOT ENOUGH COINS");
                            }
                            break;
                        case "3":
                            if(VendingMachine1.getUserInputMoney() >= Cake.getItemPrice()){
                                Cake.sellItem();
                                VendingMachine1.change(Cake.getItemPrice());
                            }
                            else{
                                System.out.println("NOT ENOUGH COINS");
                            }
                            break;
                        case "4":
                            if(VendingMachine1.getUserInputMoney() >= Coke.getItemPrice()){
                                Coke.sellItem();
                                VendingMachine1.change(Coke.getItemPrice());
                            }
                            else{
                                System.out.println("NOT ENOUGH COINS");
                            }
                            break;
                        case "5":
                            if(VendingMachine1.getUserInputMoney() >= Pepsi.getItemPrice()){
                                Pepsi.sellItem();
                                VendingMachine1.change(Pepsi.getItemPrice());
                            }
                            else{
                                System.out.println("NOT ENOUGH COINS");
                            }
                            break;
                        case "6":
                            if(VendingMachine1.getUserInputMoney() >= Sprite.getItemPrice()){
                                Sprite.sellItem();
                                VendingMachine1.change(Sprite.getItemPrice());
                            }
                            else{
                                System.out.println("NOT ENOUGH COINS");
                            }
                            break;
                        case "7":
                            if(VendingMachine1.getUserInputMoney() >= IcedTea.getItemPrice()){
                                IcedTea.sellItem();
                                VendingMachine1.change(IcedTea.getItemPrice());
                            }
                            else{
                                System.out.println("NOT ENOUGH COINS");
                            }
                            break;
                    }
            }

            System.out.println("PRESS ENTER TO CONTINUE");
            choice = scanner.nextLine();
            break;
        case "0":
            System.out.println("Shutting down");
            loop = false;
            break;
        default:
            System.out.println("wrong choice");
            break;
    }
}
    }
}
