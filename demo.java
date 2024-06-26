/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class atm {
    int deposit(int to,int amt)
    {
       return to+amt;
    }
    int withdrawl(int to,int amt)
    {
        if(to>amt)
        {
       return to-amt;
    }
    else 
    {
       return 0; 
    }
    }
    void showdetails(String n,int a)
    {
    System.out.println("NAME OF ACCOUNT HOLDER "+n);
    System.out.println("BALANCE \n"+a);
    }
}
class bankaccount extends atm
{   
    
    public static int tot=100000;
    public void caller()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR NAME");
        String n=sc.nextLine();
        System.out.println("WELCOME "+n);
        System.out.println("YOUR CURRENT BALANCE IS "+tot);
        int re=1,ch,amt,z;
        int ntot= tot;
        while(re==1)
        {
            System.out.println(" \n ENTER 1 TO DEPOSIT A SUM");
            System.out.println("ENTER 2 TO WITHDRAW MONEY");
            System.out.println("ENTER 3 TO SHOW ACCOUNT DETAILS");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("PLEASE ENTER AMOUNT TO YOU WANT TO DEPOSIT");
                    amt=sc.nextInt();
                    ntot=super.deposit(tot,amt);
                    System.out.println("YOUR MONEY HAD BEEN DEPOSITED \n");
                    break;
                case 2:
                    System.out.println("PLEASE ENTER AMOUNT TO YOU WANT TO WITHDRAW ");
                    amt=sc.nextInt();
                    ntot=super.withdrawl(tot,amt);
                    System.out.println("YOU HAVE SUCESSFULLY WITHDRAWN YOUR MONEY \n");
                    break;
                case 3:
                    super.showdetails(n,ntot);
                    break;
                default:
                    System.out.println("PLEASE ENTER A VALID COMMAND \n");
                    break;
            }
            System.out.println("IF YOU WANT TO MAKE FURTHER CHANGES \n PRESS 1");
            System.out.println("IF YOU TO EXIT PRESS ANY OTHER BUTTON ");
            z=sc.nextInt();
            if(z!=1)
            {
                re=0;
            }
    }
}}
public class demo
{
    public static void main(String args[])
    {
        bankaccount ob=new bankaccount();
        ob.caller();
    }
}