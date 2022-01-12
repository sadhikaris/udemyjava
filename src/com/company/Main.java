package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int value =5;   // this works as if statement
        switch(value){
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
                System.out.println("value was 3");
                break;
            case 4:
                System.out.println("This was 4");

            case 5:
                System.out.println("this is was 5");
            case 6:
                System.out.println("this is case 6");
                break;

            default:  // this is for something that has not covered above
                System.out.println("this is default");
                break;

        }

    printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(4);

    }

    public static void printDayOfTheWeek(int day){

        switch(day){
            case 1:
                System.out.println("Today is Sunday");
                break;
            case 2:
                System.out.println("today is Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("wed");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                    System.out.println("friday");
                    break;
            case 7:
                System.out.println("saturday");

                break;
            default:
                System.out.println("INVALID DAY");
                break;

        }

// this is for using if then statement


if (day ==1) {
    System.out.println("sunday");
} else if (day == 2){
    System.out.println("monday");  // follow the same pattern for other days
} else {
    System.out.println("invalid day");
}
    }


}
//  push this code on git@ initially done on 1/11/2022
//cant fixed the gitignore issue