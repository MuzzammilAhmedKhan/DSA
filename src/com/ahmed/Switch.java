package com.ahmed;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String fruit = sc.next();

//        switch(fruit){
//            case "Mango":
//                System.out.println("Yellow");
//                break;
//            case "Orange":
//                System.out.println("Orange");
//                break;
//            case "Grapes":
//                System.out.println("Green");
//                break;
//            default:
//                System.out.println("invalid fruit");;
//        }

//        switch (fruit) {
//            case "Mango" -> System.out.println("Yellow");
//            case "Orange" -> System.out.println("Orange");
//            case "Grapes" -> System.out.println("Green");
//        }
         int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day");
        }

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Week day");
                break;
            case 6:
            case 7:
                System.out.println("Holiday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Week day");
            case 6, 7 -> System.out.println("Holiday");
            default -> System.out.println("Invalid day");
        }

    }
}
