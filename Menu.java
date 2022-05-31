package com.company;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    String choice;

    public  void admin(){
        System.out.println("Admin");
        System.out.println("1 - Check Products");
        System.out.println("2 - Check Money");
        System.out.println("3 - Add Money");
        System.out.println("4 - Check Vending Machine Status");
        System.out.println("5 - Change Vending machine Status");
        System.out.println("0 - Go Back");

    }

    public  void user(){
        System.out.println("User");
        System.out.println("1 - Insert Coins");
        System.out.println("2 - Get Coins Back");
        System.out.println("3 - Choose Item");
        System.out.println("0 - Go Back");
    }
}
