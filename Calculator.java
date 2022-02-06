
package calculator;

import java.util.Scanner;

/**
 *
 * so , lets practice the BASICS 
 * to create calculateor 
 * 1.enter n1 
 * 2.enter n2
 * 3.enter the operation
 * 4.o/p the results
 */
public class Calculator {

    public static void main(String[] args) {
        //accept int from user
        Scanner in=new Scanner(System.in);
        System.out.println("Please Enter The First Integer Number :");
        int n1=in.nextInt();
        System.out.println("Please Enter The Second Integer Number :");
        int n2=in.nextInt();
        System.out.println("Please Enter The Requird Operation : [+,-,*,/,factorial] ");
        char op=in.next().charAt(0);
        
         calculate(n1,n2,op);
        
        in.close();
    }
    static void calculate(int n1,int n2,char op){
        int result = 0;
        switch(op){
            case '+':
                result = (n1 + n2);
                System.out.println("The Result Of "+n1+" "+op+" "+n2+" Is = "+result) ;
                break;
            case '-':
                result = (n1 - n2);
                System.out.println("The Result Of "+n1+" "+op+" "+n2+" Is = "+result) ;
                break;
            case '*':
                result = (n1 * n2);
                System.out.println("The Result Of "+n1+" "+op+" "+n2+" Is = "+result) ;
                break;
            case '/':
                result = (n1 / n2);
                System.out.println("The Result Of "+n1+" "+op+" "+n2+" Is = "+result) ;
                break;
               
            default :
                System.out.println("Please Enter A valid Operation !");
                
        }
        
       
    }
    
}
