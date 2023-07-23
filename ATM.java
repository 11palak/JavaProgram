import java.util.Scanner;
public class ATM
{
    public static void main(String args[] )
    { 
        int balance = 5000, withdraw, deposit;
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.println("\t________________________________________");
            System.out.println("\t|\t   -----:WELLCOME:-----"+"\t\t|");
            System.out.println("\t|Automated Teller Machine(ATM)\t\t|");
            System.out.println("\t|Choose 1 for Withdraw\t\t\t|");
            System.out.println("\t|Choose 2 for Deposit\t\t\t|");
            System.out.println("\t|Choose 3 for Check Balance\t\t|");
            System.out.println("\t|Choose 4 for EXIT\t\t\t|");
            System.out.println("\t|_______________________________________|");
            System.out.println("");
            System.out.print("Choose the operation you want to perform:");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                System.out.println( "Withdrawn Operation :" );
                System.out.print("Enter money to be withdrawn:");
                withdraw = s.nextInt();
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    System.out.println("Please collect your money");
                    System.out.println("CURRENT BALANCE :" +balance);
                }
                else
                {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                break;
 
                case 2:
                System.out.println( "Deposit Operation :" );
                System.out.print("Enter money to be deposited:");
                deposit = s.nextInt();
                balance = balance + deposit;
                System.out.println("Your Money has been successfully depsited");
                System.out.println("CURRENT BALANCE :" +balance);
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