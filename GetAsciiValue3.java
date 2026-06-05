import java.util.*;
class GetAsciiValue
{
public static void main(String args[])
{
String s = "als2c5d8";
char[] ch = s.toCharArray();
for(char c:ch)
{
System.out.println(c+"->"+(c-97));
}
}
}