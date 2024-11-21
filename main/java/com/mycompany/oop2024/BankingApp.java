/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop2024;

import java.util.Scanner;

/**
 *
 * @author HomePC
 */
public class BankingApp {
    public static void main(String []args){
    Scanner scanner = new Scanner (System.in);
    boolean exit = false;
    
    while (!exit){
    System.out.println("Please choose an Option ");
    System.out.println("1. Send money ");
    System.out.println("2. Withdraw Cash ");
    System.out.println("3. Buy Airtime ");
    System.out.println("4. Loans and savings ");
    System.out.println("5. Lipa na M-pesa ");
    System.out.println("6. My Account ");
    System.out.println("7. Exit ");
    
    int choice = scanner.nextInt();
    scanner.nextLine(); // Consume new line
    
    switch (choice){
        case 1: 
            sendMoney(scanner);
            break;
        case 2: 
            withdrawCash(scanner);
            break;
        case 3:
            buyAirtime(scanner);
            break;
        case 4:
            loansAndSavings(scanner);
            break;
        case 5:
            exit= true;
            System.out.println("Thank you for using M-PESA app ");
            break;
        default:
            System.out.println("Invalid choice please try again ");       
    }
    
    }
    scanner.close();
    }
    
    private static void sendMoney(Scanner scanner){
    System.out.println("Enter mobile Number");
    String mobileNumber = scanner.nextLine();
    System.out.println("Enter amount ");
    double amount = scanner.nextDouble();
    System.out.println("Enter M-Pesa pin");
    double mpesaPin = scanner.nextDouble();
    System.out.println("Confirm " + amount + " sent to " +mobileNumber + "Successfully");
    }
    
    
    private static void withdrawCash(Scanner scanner){
    System.out.println("Choose an Option");
    System.out.println("1. From Agent");
    System.out.println("2. From ATM");
    
    int choice = scanner.nextInt();
    scanner.nextLine();
    
    switch(choice){
        case 1:
            handleAgent(scanner);
            break;
        case 2:
            handleATM(scanner);
            break;
        default:
            System.out.println("Invalid Choice, please try again");
    }
    }
    
    private static void handleAgent(Scanner scanner){
    System.out.println("Enter Agent Number ");
    double agentNumber= scanner.nextDouble();
    System.out.println("Enter Store Number ");
    double storeNumber = scanner.nextDouble();
    System.out.println("Enter amount");
    double amount = scanner.nextDouble();
    System.out.println("Enter M-Pesa pin");
    double mpesaPin = scanner.nextDouble();
    System.out.println("Confirm " + amount + "Withdrawn from" + agentNumber +"of" + storeNumber);
    }
    
    private static void handleATM(Scanner scanner){
        System.out.println("Enter Bank Agent Number");
        double bankAgentNumber = scanner.nextDouble();
        System.out.println("Enter amount");
        double amount = scanner.nextDouble();
        System.out.println("Enter M-Pesa pin ");
        double mpesaPin = scanner.nextDouble();
        System.out.println("Confirm " + amount + "withdrawn from " + bankAgentNumber );
    }
    
    private static void buyAirtime(Scanner scanner){
        System.out.println("Enter amount ");
        double amount = scanner.nextDouble();
        System.out.println("Enter M-Pesa pin");
        double mpesaPin = scanner.nextDouble();
        System.out.println("Confirm airtime of " + amount + " bought to your account");
    }
    
    private static void  loansAndSavings(Scanner scanner){
    System.out.println("Choose an option");
    System.out.println("1. M-Shwari");
    System.out.println("2. KCB M-PESA");
    
    int choice = scanner.nextInt();
    scanner.nextLine();
    
    switch(choice){
        case 1:
            handleMshwari(scanner );
            break;
        case 2:
            handleMpesa(scanner);
            break;
        default:
            System.out.println("Invalid choice, please choose option 1 or 2");
    }
    }
    
    private static void handleMshwari(Scanner scanner){
        System.out.println("Choose an Option ");
        System.out.println("1. Send to M-Swari ");
        System.out.println("2. Withdraw from M-Shwari");
        System.out.println("3. Lock Savings Account");
        System.out.println("4. Loan @ 9% Incl. of Exercise Duty ");
        System.out.println("5. Check Balance ");
        System.out.println("6. Mini Statement");
        
        int mshwariChoice = scanner.nextInt();
        scanner.nextLine();
        
        switch(mshwariChoice){
            case 1:
                sendToMshwari(scanner);
                break;
            case 2:
                withdrawFromMshwari(scanner);
                break;
            case 3:
                lockSavingsAccount(scanner);
                break;
            case 4:
                loanExerciseDuty(scanner);
                break;
            case 5:
                checkBalance(scanner);
                break;
            case 6:
                miniStatement(scanner);
                break;
            default:
                  System.out.println("Invalid Choice. Please Enter a Valid Choice");
        }
    
    }
    private static void checkBalance(Scanner scanner){
    System.out.println("Enter M-PESA pin ");
    int mpesaPin = scanner.nextInt();
    System.out.println("You will revieve a confirmation massage shortly");
    }
    
    private static void miniStatement(Scanner scanner){
    System.out.println("Enter you M-PESA PIN ");
    double mpesaPin = scanner.nextInt();
    System.out.println("Wait patiently for a confirmation massage of ministatement");
    }
    
    private static void loanExerciseDuty(Scanner scanner){
    System.out.println("Choose an Option");
    System.out.println("1. Request Loan ");
    System.out.println("2. Pay Loan");
    System.out.println("3. Check Loan Limit ");
    System.out.println("4. Loan Balance");
    
    int exerciseChoice = scanner.nextInt();
    scanner.nextLine();
    
    switch(exerciseChoice){
        case 1:
            requestLoan(scanner);
            break;
        case 2:
            payLoan(scanner);
            break;
        case 3:
            checkLoanLimit(scanner);
            break;
        case 4:
            loanBalance(scanner);
            break;
        default:
            System.out.println("Inalid Choice, please try again");
    }
      
    }
    private static void requestLoan(Scanner scanner){
    System.out.println("Enter amount ");
    double amount = scanner.nextDouble();
    System.out.println("Enter M-PESA pin ");
    int mpesaPin = scanner.nextInt();
    System.out.println("Confirm " + amount + " sent to you account ");
    }
    
    private static void payLoan(Scanner scanner){
    System.out.println("Enter amount");
    double amount = scanner.nextDouble();
    System.out.println("Loan paid succesfully");
    }
    
    private static void checkLoanLimit(Scanner scanner){
    System.out.println("Youre not elogible for any loan at the moment ");
    }
    
    private static void loanBalance(Scanner scanner){
    System.out.println("We are processing your loan request, kindly wait for half an hour");
    }
    
    private static void sendToMshwari(Scanner scanner){
    System.out.println("Enter Amount");
    double amount = scanner.nextDouble();
    System.out.println("Enter M-Pesa Pin");
    int mpesaPin = scanner.nextInt();
    System.out.println("Confirm " + amount + "sent to M-Shwari lock savings Account");
    }
    private static void withdrawFromMshwari(Scanner scanner){
    System.out.println("Enter amount");
    double amount = scanner.nextDouble();
    System.out.println("Enter M-Pesa pin ");
    int mpesaPin = scanner.nextInt();
    System.out.println("Confirm " + amount + "withdrawn from M-Shwari Account" );
    }
    
    private static void lockSavingsAccount(Scanner scanner){
    System.out.println("Choose an Option");
    System.out.println("1. Open Account");
    System.out.println("2. Save ");
    System.out.println("3. Withdraw");
    System.out.println("4. Check Balance");
    System.out.println("5. Mini Statement");
    
    int lockChoice = scanner.nextInt();
    scanner.nextLine();
    switch (lockChoice){
    
        case 1:
            openAccount(scanner);
            break;
        case 2:
            save(scanner);
            break;
        case 3:
            withdraw(scanner);
            break;
        case 4:
            checkBalance(scanner);
            break;
        case 5:
            miniStatement(scanner);
            break;
        default:
            System.out.println("Invalid Choice, please try again");
    }
    
    }
    private static void save(Scanner scanner){
    System.out.println("Enter amount to save ");
    double amount = scanner.nextDouble();
    System.out.println("Enter duration to save ");
    double duration = scanner.nextDouble();
    
    }
    
    private static void withdraw(Scanner scanner){
    System.out.println("Enter M-PESA pin ");
    int mpesaPin = scanner.nextInt();
    System.out.println("wait for a confirmation massage shortly ");
    }
    
       private static void openAccount(Scanner scanner){
       System.out.println("Choose an option");
       System.out.println("1. From M-PESA");
       System.out.println("2. From M-SHWARI");
       
       int openChoice = scanner.nextInt();
       switch(openChoice){
           case 1:
               fromMpesa(scanner);
               break;
           case 2:
               fromMshwari(scanner);
               break;
           default:
               System.out.println("Invalid Choice, please try again");
       }
       }
    private static void fromMpesa(Scanner scanner){
    System.out.println("Enter Target Amount");
    double amount = scanner.nextDouble();
    System.out.println("Enter Period ");
    int period = scanner.nextInt();
    System.out.println("Enter Amount to send ");
    double amountToSend = scanner.nextDouble();
    System.out.println("Enter M-pesa PIN");
    int mpesaPin = scanner.nextInt();
    System.out.println("Confirm " + amount + "sent to M-Shwar for " + period + "months");
    }
    
    private static void fromMshwari(Scanner scanner){
    System.out.println("Enter Target amount");
    double amount = scanner.nextDouble();
    System.out.println("Enter period");
    int period = scanner.nextInt();
    System.out.println("Enter amount ");
    double amountToKeep = scanner.nextDouble();
    System.out.println("Enter M-Pesa pin ");
    int mpesaPin = scanner.nextInt();
    System.out.println("Confirm " + amount + " sent to M-Shwari for" + period );
    }
    
    private static void handleMpesa(Scanner scanner){
    System.out.println("yOU CHOOSED M-PESA");
    }
    
    }


    

