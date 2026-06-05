import java.util.*;
class Grade{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter marks:");
int marks = sc.nextInt();
if(marks >= 91 && marks <= 100)
{
System.out.println("Outstanding");
}
else if(marks >= 81 && marks <= 90)
{
System.out.println("A+");
}
else if(marks >= 71 && marks <=80)
{
System.out.println("A");
}
else if(marks >= 61 && marks <=70)
{
System.out.println("B+");
}
else if(marks >= 51 && marks <= 60)
{
System.out.println("B");
}
else if(marks <= 50){
System.out.println("Fail");
}
}
}