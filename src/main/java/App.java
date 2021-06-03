/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Edmund Johnson V
 */

/*
Working with multiple inputs and currency can introduce some tricky precision issues.

Create a simple self-checkout system. Prompt for the prices and quantities of three items. Calculate the subtotal of the items. Then calculate the tax using a tax rate of 5.5%. Print out the line items with the quantity and total, and then print out the subtotal, tax amount, and total.

Example Output
Enter the price of item 1: 25
Enter the quantity of item 1: 2
Enter the price of item 2: 10
Enter the quantity of item 2: 1
Enter the price of item 3: 4
Enter the quantity of item 3: 1
Subtotal: $64.00
Tax: $3.52
Total: $67.52
Constraints
Keep the input, processing, and output parts of your program separate. Collect the input, then do the math operations and string building, and then print out the output.
Be sure you explicitly convert input to numerical data before doing any calculations.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] arg){
        float PI1 = getPItem1();
        float QI1 = getQItem1();
        float PI2 = getPItem2();
        float QI2 = getQItem2();
        float PI3 = getPItem3();
        float QI3 = getQItem3();
        float subtotal = getSubtotal(PI1, QI1, PI2, QI2, PI3, QI3);
        System.out.println(printSubtotal(subtotal));
        System.out.println(printTax(subtotal));
        System.out.println(printTotal(subtotal));
    }

    private static float getPItem1(){
        System.out.print("Enter the price of item 1: ");
        String x = in.nextLine();
        return Float.parseFloat(x.replace(" ", ""));
    }

    private static Float getQItem1(){
        System.out.print("Enter the quantity of item 1: ");
        String x = in.nextLine();
        return Float.parseFloat(x.replace(" ", ""));
    }

    private static Float getPItem2(){
        System.out.print("Enter the price of item 2: ");
        String x = in.nextLine();
        return Float.parseFloat(x.replace(" ", ""));
    }

    private static Float getQItem2(){
        System.out.print("Enter the quantity of item 2: ");
        String x = in.nextLine();
        return Float.parseFloat(x.replace(" ", ""));
    }

    private static Float getPItem3(){
        System.out.print("Enter the price of item 3: ");
        String x = in.nextLine();
        return Float.parseFloat(x.replace(" ", ""));
    }

    private static Integer getQItem3(){
        System.out.print("Enter the quantity of item 3: ");
        String x = in.nextLine();
        return Integer.parseInt(x.replace(" ", ""));
    }

    private static Float getSubtotal(float p1, float q1, float p2, float q2, float p3, float q3){
        return (p1 * q1) + (p2 * q2) + (p3 * q3);
    }

    private static String printSubtotal(float s){
        DecimalFormat d = new DecimalFormat(("0.00"));
        return "Subtotal: $" + d.format(s);
    }

    private static String printTax(float s){
        DecimalFormat d = new DecimalFormat("0.00");
        return "Tax: $" + d.format((s * .055));
    }

    private static String printTotal(float s){
        DecimalFormat d = new DecimalFormat("0.00");
        float tax = s * (float).055;
        return "Total: $" + d.format(s + tax);
    }
}
