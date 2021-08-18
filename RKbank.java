import java.util.*;
import java.io.*;
import java.math.*;

public class RKbank{

    int a=500,b=2000,c=25000,d=50000,e;

    String cust="Avinash";

    public void cust(){

        if(a<b)

            System.out.println("Enter the PIN");
        

        else

            System.out.println("Transaction has Stopped");
    }

        public void withdraw(){

            if(b==2000)

                System.out.println("Select Either Savings nor Current");
            
            else

                System.out.println("Transaction has done Sucessfully,now take the Ammmout carefully");
        }    

            private void deposit(){


                while (a>=c)

                    System.out.println("The Ammout Sucessfully Deposited");
                
                //do
                
                  //System.out.println("Sorry transaction has failed..!");
            }
                protected void checkout(){

                    if(cust=="Avinash")

                        System.out.println("Customer details has to be showned ");                  

                    else

                        System.out.println("Please check at the Enquiry details");
                    
                }

                    public static void main (String[] args) {


                        RKbank obj = new RKbank();

                        obj.cust();
                        obj.withdraw();
                        obj.deposit();
                        obj.checkout();
                    }
            
                }
        

