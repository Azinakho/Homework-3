
package homework3;
import java.util.Scanner;

/**
 *
 * @author tyatya
 */
public class Homework3 {
    public static void main(String[] args) {
        //Create Scanner Object to read fromt he Keyboard
        Scanner Keyboard = new Scanner (System.in);
        double hours;
        double rate;
        double pay;
        
        //display promps
        System.out.print("How many hours did you work?");
        hours = Keyboard.nextDouble();
        System.out.print("How much do you get paid per hour");
        rate = Keyboard.nextDouble();
        
        //Calculations
        if(hours <= 40){
            //calcilate gross pay for 40 or less
            pay = hours * rate;
        }else{
            //calculate gross pay for more than 40 hours
            double regularPay = 40* rate;
            double overtimeHours = hours - 40;
            double overtimePay = overtimeHours * (rate * 1.5);
            
            pay = regularPay + overtimePay;
        }
        //display results
        System.out.println("You earned $" + pay); 
    }
    //2.This program calculates the total price which includes sales(tax)
    
    //creat a scanner object to read from the keyboard
    Scanner Keyboard = new Scanner (System.in);
    
    //identifier declarations
    final double TAX_RATE = 0.055;
    double price;
    double tax;
    double total;
    String item;
    
    //display prompts and get input
    System.out.print("Item description: ");
    item = Keyboard.nextLine();
    
    System.out.print("Item price: $" );
    price = Keyboard.nextDouble();
    
    //calculations
    tax = price + TAX_RATE;
    total = price * tax;
    //display results
    System.out.print(item + "$");
    System.out.printIn(price);
    System.out.print("Tax $");
    System.out.print("Total $");
    price = keyboard.nextDouble();
    
    //Calculations
    tax = price + TAX_RATE;
    total = price * tax;
        

        

    
}
