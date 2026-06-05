class Marks{
public static void main(String args[])
{
int[] marks = {14,23,31,67,32,75};
char gender='g';
int sum=0;
if(gender=='g')
{
   for(int i = 1;i<marks.length;i+=2)
   {
      sum+=marks[i];
      }
      System.out.println(sum);
      }

}
}