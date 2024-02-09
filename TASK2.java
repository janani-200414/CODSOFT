import java.util.*;
import java.io.*;

class Main{
public static int subjects = 5;
}

public class TASK2{
public static void main(String [] args){
Scanner s =  new Scanner (System.in);
int [] marks = new int[Main.subjects];
int sum = 0;
int avg = 1;
System.out.println("Enter your subject marks (out of 100) :");
for(int i=0;i<marks.length;i++){
marks[i] = s.nextInt();
sum += marks[i];
}
avg = avg * (sum/marks.length);
if(avg >= 90){
System.out.println("Total Marks Secured : "+sum);
System.out.println("Average Percentage  : "+avg+"%");
System.out.println("Grade : O");
}
else if(avg >= 80){
System.out.println("Total Marks Secured : "+sum);
System.out.println("Average Percentage  : "+avg+"%");
System.out.println("Grade : A");
}
else if(avg >= 70){
System.out.println("Total Marks Secured : "+sum);
System.out.println("Average Percentage  : "+avg+"%");
System.out.println("Grade : B");
}
else if(avg >= 60){
System.out.println("Total Marks Secured : "+sum);
System.out.println("Average Percentage  : "+avg+"%");
System.out.println("Grade : C");
}
else if(avg >= 50){
System.out.println("Total Marks Secured : "+sum);
System.out.println("Average Percentage  : "+avg+"%");
System.out.println("Grade : D");
}
else if(avg >= 40){
System.out.println("Total Marks Secured : "+sum);
System.out.println("Average Percentage  : "+avg+"%");
System.out.println("Grade : E");
}
else if(avg < 40){
System.out.println("Total Marks Secured : "+sum);
System.out.println("Average Percentage  : "+avg+"%");
System.out.println("FAIL");
}
}
}

