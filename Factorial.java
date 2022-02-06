
package factorial;

import java.util.Scanner;

/**
 *
 * calculate the factorial of the number entered by the user
 */
public class Factorial {

 
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.println("Please Enter an Integer Number :");
     int n = in.nextInt();
     Fac(n);

        }
    
   static void Fac(int n){
      int fact = 1;
       for(int seq = 2 ;seq<= n ; seq++){
           fact *= seq ;

       }
             System.out.println("The Factorial Of "+ n +" = " + fact);

     }   

   
   
        
    }
     
