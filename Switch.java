import java.util.*;
class Switch
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int ch = sc.nextInt();
switch(ch)
{
default:
System.out.println("Incorrect");
case 1:
System.out.println("one");
break;
case 2:
System.out.println("Two");
break;
case 3:
System.out.println("Three");
break;
case 4:
System.out.println("Four");
break;
case 5:
System.out.println("Five");
break;
case 6:
System.out.println("Six");
break;
}
}
}
