/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cookie;

import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author jared
 */
public class Calories {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Let the user enter the number of cookies they've eaten
        System.out.println("Please enter the number of cookies you've eaten...so far:");
        

        //Obtain amount of cookies eaten by user
        int numberOfCookies = input.nextInt(); 
        if (numberOfCookies > 40) {
            JOptionPane.showMessageDialog(null, "There are only 40 cookies available to eat");
    }

        
        //40 cookies in bag ----> 10 servings in bag ----> 4 cookies per serving
        //300 calories per serving/4 cookies = 75 calories per cookie
        //Calculate how many calories user has consumed
        int caloriesConsumed = numberOfCookies * 75;

        //Display to the user the total number of calories consumed
        System.out.println("Total number of calories you have consumed...so far: " + caloriesConsumed + " calories");

    }
}
