import java.util.*;
import java.io.*;

public class TASK1{
public static void main(String [] args){
Scanner s = new Scanner (System.in);
int x = 1;
int attempt = 3;
int exactno = 14;
while(x != 0){

for(int i=3;i>=1;i--){
System.out.print("Guess the number between 1-100 : ");
int guess = s.nextInt();
if(guess > exactno){
System.out.println("Your guess is too high. Try again.");
attempt--;
if(i > 1){
System.out.println("Just "+attempt+" attempt more.");
}
else{
System.out.println("No more attempts.");
}
}
else if(guess < exactno){
System.out.println("Your guess is too low. Try again.");
attempt--;
if(i > 1){
System.out.println("Just "+attempt+" attempt more.");
}
else{
System.out.println("No more attempts.");
}
}
else{
System.out.println("Yay!!! Your guess it correct.");
break;
}
}
System.out.println("Do You Want to Play Again? If Yes, Press 1 else Press 0. ");
x = s.nextInt();
exactno = exactno + 4;
attempt = 3;
if(exactno > 100){
exactno = 14;
}
}
}
}






