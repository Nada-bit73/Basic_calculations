
package fibonacci;

import java.util.Scanner;

/**
 *
 * calculate the sum of the two preceeding numbers 
 * 0 1 1 2 3 5 8 13 ...
 */
public class Fibonacci {

   
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
     System.out.println("Please Enter an Integer Number To Dispaly Fibonacci Searice  :");
     int n = in.nextInt();
     //n=5
     dispalyFibonacci(n);

        }
    
   static void dispalyFibonacci(int n){
       //n=5
     int x = 1,y=0,z=0,count=1;
          // 1 <= 5
          // 2 <= 5
          // 3 <= 5 
          //4 <= 5
          // 5 <= 5
          //6 <= 5 false 
      while(count <= n){
           //0 
           //1
           //1
           //2
           //3
          System.out.print(z +"  ");
          //1
          //1
          //2
          //3
          //5
          z=x+y;
          //0
          //1
          //1
          //2
          //3
          x=y;
          //1
          //1
          //2
          //3
          //5
          y=z;
         //2
         //3
         //4
         //5
         //6
          count ++;
      }
          System.out.println("\n y="+y+"x="+x);

       
             

     }   
    }
    

