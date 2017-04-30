package Palindrome;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;

/**
 *
 * @author 161073
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ab;
        ab = JOptionPane.showInputDialog("Please input a value to see if its a Palindrome: ");
        /// string(JOptionPane);
        System.out.println(isPalindromeR(ab));
        System.out.println(isPalindromeL(ab));
    }
        //recursion boolean method
    ////needs to do replace all method, so i get rid of caps , as well as spaces. he looks at spacing and caps
    public static boolean isPalindromeR(String recur) {
        recur = recur.toLowerCase();
        recur = recur.replaceAll(" ", "");
        
        if (recur.length() == 0 || recur.length() == 1) {
          
            return true;
        }
        if (recur.charAt(0) != recur.charAt(recur.length() - 1)) {   //might be == instead of !=
            
            return false;
        }
        boolean c = isPalindromeR(recur.substring(1, recur.length() - 1));
        return c;
    }

    //iterative boolean method to solve the problem
    //needs to do replace all method, so i get rid of caps , as well as spaces. he looks at spacing and caps
    public static boolean isPalindromeL(String bc) {
       
         String str2 = "";
         bc = bc.toLowerCase();
         bc = bc.replaceAll(" ", "");
        for(int i = bc.length(); i>0; i--){
             //rewrites the word backwards, by starting with the last letter and going back to the first letter
           str2 = str2 + bc.substring(i-1, i);
           
       }
        return bc.equals(str2);
        
    }

}
