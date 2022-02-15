package com.Sebi;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        account sebi=new account("Parminder Singh",1234,"1234",24091996,5000);
        account hemant=new account("Hemant Rawat",2345,"2345",14091995,5000);
        account shubham=new account("Shubham Maheshwari",3456,"3456",30091996,5000);
        HashSet<account>h=new HashSet<>();
        h.add(sebi);
        h.add(hemant);
        h.add(shubham);
        int flag=0;
        while(flag>=0){
            System.out.println("Welcome to ATM Service. Please enter your Account number and Password");
            System.out.println("Account number- ");
            int an=s.nextInt();
            System.out.println("Password- ");
            String p=s.next();

            account user=new account();
            if(an==hemant.getAccountNo()&&p.equals( hemant.getPassword())){
                 user=hemant;
                 flag=0;
            }
            else if(an==sebi.getAccountNo()&&p.equals( sebi.getPassword())){
                user=sebi;
                flag=0;
            }
            else if(an==shubham.getAccountNo()&&p.equals( shubham.getPassword())){
                user=shubham;
                flag=0;
            }
            else{
                System.out.println("Invalid Account number or Password");

                flag=1;
            }
            if(flag==0) {
                System.out.println("Please select a option ");
                System.out.println("press 1 for check Account Balance ");
                System.out.println("press 2 for Deposit Money ");
                System.out.println("press 3 for Debit Money");
                int ans = s.nextInt();
                switch (ans) {
                    case 1:
                        user.checkbalance(an,p);
                        break;

                    case 2:
                        System.out.println("Enter money to deposit");
                        int d=s.nextInt();
                        user.depositmoney(d);
                        break;

                    case 3:
                        System.out.println("Enter money to Withdraw");
                        int w=s.nextInt();
                        user.debitmoney(w);
                        break;

                }
            }
        }
    }
}
