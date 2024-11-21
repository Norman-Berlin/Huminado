/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oop2024;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HomePC
 */
public class toDoList {
    public static void main ( String[]args){
        ArrayList<String> toDoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        
        toDoList.add("Submit my Assignments");
        toDoList.add("Write at least 1 successful program daily");
        toDoList.add("Go for Lunch at 1PM");
        
        while(!exit){
    System.out.println("Choose an option ");
    System.out.println("1. Add a task ");
    System.out.println("2. Remove a task ");
    System.out.println("3. View a Task ");
    System.out.println("4. Exit ");
    
    int choice = scanner.nextInt();
    scanner.nextLine();
    
    switch (choice){
        case 1:
            System.out.println("Enter a new task: ");
            String task = scanner.nextLine();
            toDoList.add(task);
            break;
        case 2:
            System.out.println("Enter the task number to Remove: ");
            int taskNumber = scanner.nextInt();
            scanner.nextLine();
            if (taskNumber > 0 && taskNumber <= toDoList.size()){
            toDoList.remove(taskNumber - 1);
            }
            else {
            System.out.println("Invalid task Number ");
            }
            break;
        case 3:
            System.out.println("Your Tasks. ");
            for (int i = 0; i < toDoList.size(); i++ ){
            System.out.println((i + 1) + "." + toDoList.get(i));
            }
            break;
        case 4:
            exit = true;
            System.out.println("Exiting To Do List App, Goodbye");
        default:
            System.out.println("Invalid Choice please try again");
    }
    }
    }
}
