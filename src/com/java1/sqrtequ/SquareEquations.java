// This program is for solving square equations

package com.java1.sqrtequ;

import java.util.Scanner;

public class SquareEquations {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double a,b,c;
        double discriminant;
        System.out.println("The program is going to solve the equation:");
        System.out.println("a(x^2)+bx+c=0");
        System.out.println("Please, enter a:");
        a = input.nextDouble();
        while (a == 0){
            System.out.println("a cannot equal zero!");
            System.out.println("Please, try a different value:");
            a = input.nextDouble();
        }
        System.out.println("Please, enter b:");
        b = input.nextDouble();
        System.out.println("Please, enter c:");
        c = input.nextDouble();
        discriminant = (Math.pow(b,2)) - 4 * a * c;
        ResultsClass all_results = roots(discriminant,b,a);
        results_display(all_results);
    }

    public static ResultsClass roots(double D, double b, double a){
        int d_sign;
        if (D < 0){
            d_sign = 0;
        } else if (D == 0){
            d_sign = 1;
        } else {
            d_sign = 2;
        }
        double x1,x2;
        x1 = ((-b) + Math.sqrt(D)) / (2 * a);
        x2 = ((-b) - Math.sqrt(D)) / (2 * a);
        return new ResultsClass(x1,x2,d_sign);
    }
    public static void results_display (ResultsClass x){
        switch (x.roots_number){
            case (0):
                System.out.println("The discriminant is less than zero!");
                System.out.println("It means that the equation has no roots.");
            break;
            case (1):
                System.out.println("The equation has only one root.");
                System.out.println("x: ");
                System.out.printf("%.2f", x.root1);
                break;
            case (2):
                System.out.println("The equation has two roots.");
                System.out.println("x1: ");
                System.out.printf("%.2f\n", x.root1);
                System.out.println("x2: ");
                System.out.printf("%.2f", x.root2);
                break;
        }

    }


}
