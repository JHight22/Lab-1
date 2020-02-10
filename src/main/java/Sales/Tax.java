/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sales;

import java.util.Scanner;

/**
 *
 * @author jared
 */
public class Tax {
    public static void main(String[] args) {
        
        //Ask the user to enter the amount of a purchase
        System.out.println("Please enter the amount of the purchase: ");
        
        Scanner input = new Scanner (System.in);
        
        //obtain purchase variable from the user
        double purchase = input.nextInt();
        
        //Calculate county sales tax
        double countySalesTax = purchase * 0.02;
        
        //Calculate state sales tax
        double stateSalesTax = purchase * 0.04;
        
        //Calculate total sales tax
        double totalSalesTax = countySalesTax + stateSalesTax;
        
        //Calculate total of the sale
        double totalOfSale = purchase + totalSalesTax;
        
        //Display amount of the purchase
        System.out.println("Amount of the purchase: " + purchase);
        
        //Display the amount of state, county, and total sales tax
        System.out.println("Amount of county sales tax: " + countySalesTax);
        System.out.println("Amount of state sales tax: " + stateSalesTax);
        System.out.println("Amount of total sales tax: " + totalSalesTax);
    }
}
