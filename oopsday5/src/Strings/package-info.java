import java.util.Scanner;  
  
public statemachine()
{  
    
    public static void main(String args[] )  
    {  
       
        int balance = 5000, withdraw, deposit; 
        int countofhundred=50;
        int countof
        int denomination;
          
         
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("state machine");  
            System.out.println("Choose 1 for Withdraw");  
            System.out.println("Choose 2 for Deposit");  
            System.out.println("Choose 3 for Check Balance");  
            System.out.println("Choose 4 for EXIT");  
            System.out.print("Choose the operation you want to perform:");  
              
              
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
                		System.out.print("Enter money to be withdrawn:");  
                		withdraw = sc.nextInt();
                		
                		switch(choice)
                		{

                		System.out.println("enter the denominators");
                		System.out.println("enter 1 for 100 rupee note");
                		System.out.println("enter 2 for 50 rupee notes");
                		System.out.println("enter 3 for 20 rupee notes");
                		System.out.println("enter the denominators");
                			
                		}
                      
        
                		if(balance >= withdraw)  
                		{  
             
                			balance = balance - withdraw;  
                			System.out.println("Please collect your money");  
                		}  
                		else  
                		{  
            
                			System.out.println("Insufficient Balance");  
                		}  
                		System.out.println("");  
                		
                		break;  
   
                case 2:  
                      
        System.out.print("Enter money to be deposited:");  
                      
         
        deposit = sc.nextInt();  
                      
   
        balance = balance + deposit;  
        System.out.println("Your Money has been successfully depsited");  
        System.out.println("");  
        break;  
   
                case 3:  
       
        System.out.println("Balance : "+balance);  
        System.out.println("");  
        break;  
   
                case 4:  
      
        System.exit(0);  
            }  
        }  
    }  
}  