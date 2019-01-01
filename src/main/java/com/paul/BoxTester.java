package com.paul;

import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        checkBoxUsage();
    }

    public static void checkBoxUsage() {
        PostOfficeBox box;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter object's length:  ");
        float boxlength = scanner.nextFloat();
        System.out.println("Please enter object's width:  ");
        float boxwidth = scanner.nextFloat();
        System.out.println("Please enter object's height:  ");
        int boxheight = scanner.nextInt();
       box = new Box3();
        if(!box.validate(boxlength,boxwidth,boxheight)) {
            box = new Box5();
            if(box.validate(boxlength,boxwidth,boxheight)){
                System.out.println("Box5");
            }else
                System.out.println("Good is out of range of Box3 and Box5 !!");
        }else
            System.out.println("Box3");
    }
}
