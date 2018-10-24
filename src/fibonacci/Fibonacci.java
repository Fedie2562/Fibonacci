/*
 * Ferris D.
 * 24/10/2018
 * This will find the fibonacci number at the given term
 */

package fibonacci;

import javax.swing.JOptionPane;

/**
 *
 * @author fedie2562
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Input of the term
        int term = 0;
        try{
                term = Integer.parseInt(JOptionPane.showInputDialog("Here are the first nine fibonacci numbers\n"
                + "1,1,2,3,5,8,13,21,34\n"
                + "Which fibonacci term would you like to see ?"));
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Please only enter a non decimal number");
            System.exit(0);
        }
        //Displays the result
        JOptionPane.showMessageDialog(null,"The fibonacci number at the "+term+"th term is "+fNumber(term));
    }
    //Calculation of the number
    public static int fNumber(int n){
        if(n<=2){
            return 1;
        }
        else{
            return fNumber(n-1) + fNumber(n-2);
        }
    }
}