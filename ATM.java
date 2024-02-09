import java.util.*;
import java.io.*;

class BankAccount{
private long balance = 0;
private int account;
public BankAccount(int account){
this.account = account;
}
public void deposit(long amount){
balance += amount;
System.out.println("Rs."+amount+" has been successfully deposited.");
}

public void withdraw(long amount){
if(balance >= amount){
balance -= amount;
System.out.println("Rs."+amount+" has been debited from your account.");
}
else{
System.out.println("Invalid amount. Withdrawal Failed.");
}
}

public void checkBalance(){
System.out.println("Current account balance : Rs."+balance);
}
}


public class ATM{
public static void main(String [] args){
Scanner s = new Scanner (System.in);
System.out.println("Enter your account Number :");
int account = s.nextInt();
BankAccount obj = new BankAccount(account);
int choice;
do{
System.out.println("1. Deposit\t 2. Withdraw\t 3. Balance\t 4. Exit");
choice  =  s.nextInt();

switch(choice){
case 1:
System.out.print("Enter the amount You want to deposit :");
long depositamount = s.nextLong();
obj.deposit(depositamount);
break;

case 2:
System.out.print("Enter the amount you want to withdraw :");
long withdrawamount = s.nextLong();
obj.withdraw(withdrawamount);
break;

case 3:
obj.checkBalance();
break;

case 4:
System.out.println("Thank you for using the ATM.");
break;
}
}
while(choice != 4);
}
}

